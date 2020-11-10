package mapObject;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import _main.GamePanel;
import tile.TileMap;

public class Explosion {
	private int x;
	private int y;
	private Animation animation;
	private BufferedImage[] sprites;
	private boolean remove;
	private int imageWidth;
	private int imageHeight;
	private TileMap tileMap;
	public Explosion(TileMap tileMap , double x, double y) {
		this.x = (int)x;
		this.y = (int)y;
		imageWidth = 30;
		imageHeight = 30;
		this.tileMap = tileMap;
		try {

			BufferedImage spritesheet = 
					ImageIO.read(getClass().getResourceAsStream("/Enemies/explosion.gif"));
			sprites = new BufferedImage[6];
			for (int i = 0; i < sprites.length; i++) {
				sprites[i] = spritesheet.getSubimage(i * imageWidth, 0, imageWidth, imageHeight);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		animation = new Animation();
		animation.setFrames(sprites);
		animation.setDelay(70);

	}
	public void update() {
		animation.update();
		if(animation.hasPlayedOnce()) {
			remove = true;
		}
	}
	public boolean isRemove() { return remove; }
	public void render(Graphics g) {
		mainRend(g);
		testRend(g);
	}
	public void mainRend(Graphics g) {
		int checkleft = (int) x + imageWidth/2;	
		int checkright = (int)x - imageWidth/2;	
			
		if (tileMap.cameraStartx < checkleft && checkright < tileMap.cameraEndx) {
			int rendx = (int) x - tileMap.cameraStartx - imageWidth / 2;
			int rendy = (int) y - imageHeight / 2;
			g.drawImage(animation.getImage(), rendx, rendy, imageWidth, imageHeight, null);
		}
	}
	
	public void testRend(Graphics g) {
		int rendx = (int) x - imageWidth / 2;
		int rendy = (int) y - imageWidth / 2 + GamePanel.HEIGHT;
		g.drawRect(rendx, rendy, imageWidth, imageHeight);
	}	
}
