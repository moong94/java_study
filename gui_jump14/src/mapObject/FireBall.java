package mapObject;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import mapObject.Animation;
import mapObject.MapObject;
import tile.TileMap;

public class FireBall extends MapObject {
	private boolean hit;
	private boolean remove;
	private BufferedImage[] sprites;
	private BufferedImage[] hitSprites;

	public void init(TileMap tm, boolean right) {
		super.init(tm, 30);

		facingRight = right;
		moveSpeed = 3.8;
		if (right)
			dx = moveSpeed;
		else
			dx = -moveSpeed;

		imageWidth = 30;
		imageHeight = 30;
		box = 14;
		// load sprites
		try {

			BufferedImage spritesheet = ImageIO.read(getClass().getResourceAsStream("/Player/fireball.gif"));

			sprites = new BufferedImage[4];
			for (int i = 0; i < sprites.length; i++) {
				sprites[i] = spritesheet.getSubimage(i * imageWidth, 0, imageWidth, imageHeight);
			}

			hitSprites = new BufferedImage[3];
			for (int i = 0; i < hitSprites.length; i++) {
				hitSprites[i] = spritesheet.getSubimage(i * imageWidth, imageHeight, imageWidth, imageHeight);
			}

			animation = new Animation();
			animation.setFrames(sprites);
			animation.setDelay(70);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setHit() {
		if (hit)
			return;
		hit = true;
		animation.setFrames(hitSprites);
		animation.setDelay(70);
		dx = 0;
	}

	public boolean isRemove() {
		return remove;
	}

	public void update() {

		checkTileMapCollision();

		if (dx == 0 && !hit) {
			setHit();
		}

		animation.update();
		if (hit && animation.hasPlayedOnce()) {
			remove = true;
		}
	}

	public void render(Graphics g) {
		super.render(g);
	}
}
