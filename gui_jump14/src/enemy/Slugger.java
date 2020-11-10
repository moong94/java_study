package enemy;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import mapObject.Animation;
import mapObject.Enemy;
import tile.TileMap;

public class Slugger extends Enemy {
	private BufferedImage[] imageList;
	public void init(TileMap tm, int size) {
		super.init(tm, size);
		imageWidth = 30;
		imageHeight = 30;
		moveSpeed = 0.3;
		maxSpeed = 0.3;
		fallSpeed = 0.2;
		maxFallSpeed = 10.0;
		box = 20;
		health = maxHealth = 20;
		damage = 2;

		// load sprites
		try {
			BufferedImage spritesheet = ImageIO.read(
					getClass().getResourceAsStream("/Enemies/slugger.gif"));
			imageList = new BufferedImage[3];
			for (int i = 0; i < imageList.length; i++) {
				imageList[i] = spritesheet.getSubimage(i * imageWidth, 0, 
						imageWidth, imageHeight);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		animation = new Animation();
		animation.setFrames(imageList);
		animation.setDelay(300);

		right = true;
		facingRight = true;

	}

	private void getNextPosition() {

		// movement
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
		}

		// falling
		if (falling) {
			dy += fallSpeed;
		}

	}

	public void update() {

		// update position
		getNextPosition();
		checkTileMapCollision();
		setPosition(x, y);

		// if it hits a wall, go other direction
		if (right && dx == 0) {
			right = false;
			left = true;
			facingRight = false;
		} else if (left && dx == 0) {
			right = true;
			left = false;
			facingRight = true;
		}
		// update animation
		animation.update();
		super.update();
	}
}
