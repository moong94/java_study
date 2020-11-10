package mapObject;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import _main.KeyManager;
import mapObject.Enemy;
import mapObject.Animation;
import mapObject.MapObject;
import tile.TileMap;

public class Player extends MapObject {
	// player stuff
	public int health;
	private int maxHealth;
	public boolean dead;
	private boolean flinching;
	private long flinchTimer;
	// player skill ==> gliding , scratch , fireball
	private boolean gliding;
	private boolean scratching;
	private int scratchDamage;
	private int scratchRange;

	private boolean firing;
	private int fireBallDamage;
	private ArrayList<FireBall> fireBalls;

	// animations
	private ArrayList<BufferedImage[]> animationList;
	private final int[] numFrames = { 2, 8, 1, 2, 4, 2, 5 };
	// animation actions
	private static final int IDLE = 0;
	private static final int WALKING = 1;
	private static final int JUMPING = 2;
	private static final int FALLING = 3;
	private static final int GLIDING = 4;
	private static final int FIREBALL = 5;
	private static final int SCRATCHING = 6;

	public void init(TileMap tm, int size) {
		super.init(tm, size);
		playerSetting();
	}

	public void playerSetting() {
		box = 20;
		moveSpeed = 0.3;
		maxSpeed = 1.6;
		stopSpeed = 0.4;
		fallSpeed = 0.15;
		maxFallSpeed = 4.0;
		jumpStart = -4.8;
		stopJumpSpeed = 0.3;
		facingRight = true;
		health = maxHealth = 5;

		scratchDamage = 8;
		scratchRange = 40;

		imageWidth = 30;
		imageHeight = 30;

		fireBalls = new ArrayList<>();
		fireBallDamage = 5;

		animationSetting();
		setPosition(100, 100);
	}

	public void update() {

		keySetting();
		getNextPosiotion();
		checkTileMapCollision();
		updateAnimation();

	}

	public void render(Graphics g) {
		if (flinching) {
			long elapsed = (System.nanoTime() - flinchTimer) / 1000000;
			if (elapsed / 100 % 2 == 0) {
				return;
			}
		}
		// draw fireballs
		for (int i = 0; i < fireBalls.size(); i++) {
			fireBalls.get(i).render(g);
		}

		super.render(g);
	}

	void animationSetting() {
		try {
			int imageSize = 30;
			BufferedImage playerImage = ImageIO.read(getClass().getResourceAsStream("/Player/playersprites.gif"));
			animationList = new ArrayList<BufferedImage[]>();
			for (int i = 0; i < 7; i++) {
				BufferedImage[] imageList = new BufferedImage[numFrames[i]];
				for (int j = 0; j < numFrames[i]; j++) {
					if (i != SCRATCHING) {
						imageList[j] = playerImage.getSubimage(j * imageSize, i * imageSize, imageSize, imageSize);
					} else {
						imageList[j] = playerImage.getSubimage(j * imageSize * 2, i * imageSize, imageSize * 2,
								imageSize);
					}
				}
				animationList.add(imageList);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		animation = new Animation();
		currentAnimation = IDLE;
		animation.setFrames(animationList.get(IDLE));
		animation.setDelay(400);

	}

	void updateAnimation() {
		// check attack has stopped
		if (currentAnimation == SCRATCHING) {
			if (animation.hasPlayedOnce())
				scratching = false;
		}
		if (currentAnimation == FIREBALL) {
			if (animation.hasPlayedOnce()) {
				firing = false;
			}
		}

		// fireball attack
		if (firing && currentAnimation != FIREBALL) {
			FireBall fb = new FireBall();
			fb.init(tileMap, facingRight);
			fb.setPosition(x, y);
			fireBalls.add(fb);
		}
		// update fireballs
		for (int i = 0; i < fireBalls.size(); i++) {
			fireBalls.get(i).update();
			if (fireBalls.get(i).isRemove()) {
				fireBalls.remove(i);
				i--;
			}
		}

		// set animation
		if (scratching) {
			if (currentAnimation != SCRATCHING) {
				currentAnimation = SCRATCHING;
				animation.setFrames(animationList.get(SCRATCHING));
				animation.setDelay(50);
				imageWidth = 60;
			}
		} else if (firing) {
			if (currentAnimation != FIREBALL) {
				currentAnimation = FIREBALL;
				animation.setFrames(animationList.get(FIREBALL));
				animation.setDelay(100);
				imageWidth = 30;

			}
		} else if (dy > 0) {
			if (gliding) {
				if (currentAnimation != GLIDING) {
					currentAnimation = GLIDING;
					animation.setFrames(animationList.get(GLIDING));
					animation.setDelay(100);
					imageWidth = 30;
				}
			} else if (currentAnimation != FALLING) {
				currentAnimation = FALLING;
				animation.setFrames(animationList.get(FALLING));
				animation.setDelay(100);
				imageWidth = 30;
			}
		} else if (dy < 0) {
			if (currentAnimation != JUMPING) {
				currentAnimation = JUMPING;
				animation.setFrames(animationList.get(JUMPING));
				animation.setDelay(-1);
				imageWidth = 30;
			}
		} else if (left || right) {
			if (currentAnimation != WALKING) {
				currentAnimation = WALKING;
				animation.setFrames(animationList.get(WALKING));
				animation.setDelay(40);
				imageWidth = 30;
			}
		} else {
			if (currentAnimation != IDLE) {
				currentAnimation = IDLE;
				animation.setFrames(animationList.get(IDLE));
				animation.setDelay(400);
				imageWidth = 30;
			}
		}

		// check done flinching
		if (flinching) {
			long elapsed = (System.nanoTime() - flinchTimer) / 1000000;
			if (elapsed > 1000) {
				flinching = false;
			}
		}

		if (right)
			facingRight = true;
		if (left)
			facingRight = false;

		animation.update();
	}

	void getNextPosiotion() {
		if (left) {
			dx -= moveSpeed;
			if (dx < -maxSpeed) {
				dx = -maxSpeed;
			}
		} else if (right) {
			dx += moveSpeed;
			if (dx > maxSpeed) {
				dx = maxSpeed;
			}
		} else {
			if (dx > 0) {
				dx -= stopSpeed;
				if (dx < 0) {
					dx = 0;

				}
			} else if (dx < 0) {
				dx += stopSpeed;
				if (dx > 0) {
					dx = 0;
				}
			}
		}

		// jumping
		if (jumping && !falling) {
			dy = jumpStart;
			falling = true;
		}
		// falling
		if (falling) {
			if (dy > 0 && gliding)
				dy += fallSpeed * 0.1;
			else
				dy += fallSpeed;

			if (dy > 0)
				jumping = false;
			if (dy < 0 && !jumping)
				dy += stopJumpSpeed;

			if (dy > maxFallSpeed)
				dy = maxFallSpeed;
		}
	}

	public void keySetting() {
		if (KeyManager.instance.isKeyDown(KeyEvent.VK_RIGHT)) {
			right = true;
		}
		if (KeyManager.instance.isKeyDown(KeyEvent.VK_LEFT)) {
			left = true;
		}
		if (KeyManager.instance.isKeyUp(KeyEvent.VK_RIGHT)) {
			right = false;
		}
		if (KeyManager.instance.isKeyUp(KeyEvent.VK_LEFT)) {
			left = false;
		}
		if (KeyManager.instance.isKeyDown(KeyEvent.VK_W)) {
			jumping = true;
		}
		if (KeyManager.instance.isKeyDown(KeyEvent.VK_E)) {
			gliding = true;
		}
		if (KeyManager.instance.isKeyUp(KeyEvent.VK_E)) {
			gliding = false;
		}
		if (KeyManager.instance.isKeyDown(KeyEvent.VK_R)) {
			scratching = true;
		}
		if (KeyManager.instance.isKeyDown(KeyEvent.VK_F)) {
			firing = true;

		}
	}

	public void checkAttack(ArrayList<Enemy> enemyList) {
		for (int i = 0; i < enemyList.size(); i++) {
			Enemy e = enemyList.get(i);
			if (intersects(e)) {
				hit(e.getDamage());
			}

			// scratch attack
			if (scratching) {
				if (facingRight) {
					if (e.x > x && e.x < x + scratchRange && e.y > y - box / 2 && e.y < y + box / 2) {
						e.hit(scratchDamage);
					}
				} else {
					if (e.x < x && e.x > x - scratchRange && e.y > y - box / 2 && e.y < y + box / 2) {
						e.hit(scratchDamage);
					}
				}
			}

			// fireballs
			for (int j = 0; j < fireBalls.size(); j++) {
				if (fireBalls.get(j).intersects(e)) {
					e.hit(fireBallDamage);
					fireBalls.get(j).setHit();
					break;
				}
			}

		}
	}

	public void hit(int damage) {
		if (flinching)
			return;
		health -= damage;
		if (health <= 0) {
			health = 0;
			dead = true;
			return;
		}
		flinching = true;
		flinchTimer = System.nanoTime();

	}

}
