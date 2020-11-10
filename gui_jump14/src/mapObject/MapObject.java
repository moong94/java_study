package mapObject;

import java.awt.Graphics;
import java.awt.Rectangle;

import _main.GamePanel;
import tile.Tile;
import tile.TileMap;

public class MapObject {
	// position and vector
	public double x;
	public double y;
	protected double dx;
	protected double dy;
	// collision box
	 public int box;
	// movement
	protected boolean left;
	protected boolean right;
	protected boolean up;
	protected boolean down;
	protected boolean falling;
	protected boolean jumping;
	// movement speed
	protected double moveSpeed;
	protected double maxSpeed;
	protected double stopSpeed;
	protected double fallSpeed;
	protected double maxFallSpeed;
	protected double jumpStart;
	protected double stopJumpSpeed;
	// tile
	protected TileMap tileMap;
	protected int tileSize;
	// collision
	protected double nextx;
	protected double nexty;
	protected int currWidth;
	protected int currHeight;
	protected boolean topLeft;
	protected boolean topRight;
	protected boolean bottomLeft;
	protected boolean bottomRight;
	// animations
	protected int imageWidth;
	protected int imageHeight;
	protected Animation animation;
	protected int currentAnimation;
	protected int previousAnimation;
	protected boolean facingRight;
	
	
	public void init(TileMap tm, int size) {
		tileMap = tm;
		tileSize = size;
	}

	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void calculateCorners(double x, double y) {
		int leftTile = (int) (x - box / 2) / tileSize;
		int rightTile = (int) (x + box / 2 - 1) / tileSize;
		int topTile = (int) (y - box / 2) / tileSize;
		int bottomTile = (int) (y + box / 2 - 1) / tileSize;

		int tl = tileMap.getType(topTile, leftTile);
		int tr = tileMap.getType(topTile, rightTile);
		int bl = tileMap.getType(bottomTile, leftTile);
		int br = tileMap.getType(bottomTile, rightTile);

		topLeft = tl == Tile.BLOCKED;
		topRight = tr == Tile.BLOCKED;
		bottomLeft = bl == Tile.BLOCKED;
		bottomRight = br == Tile.BLOCKED;
	}

	public void checkTileMapCollision() {
		nextx = x + dx;
		nexty = y + dy;

		currWidth = (int) x / tileSize;
		currHeight = (int) y / tileSize;
			
		calculateCorners(x, nexty);

		if (dy < 0) {
			if (topLeft || topRight) {
				dy = 0;
				y = currHeight * tileSize + box / 2;
			} else {
				y += dy;
			}
		}
		if (dy > 0) {
			if (bottomLeft || bottomRight) {
				dy = 0;
				falling = false;
				y = (currHeight + 1) * tileSize - box / 2;
			} else {
				y += dy;
			}
		}

		calculateCorners(nextx, y);
		
		if (dx < 0) {
			if (topLeft || bottomLeft) {
				dx = 0;
				x = currWidth * tileSize + box / 2;
			} else {
				x += dx;
			}
		}
		if (dx > 0) {
			if (topRight || bottomRight) {
				dx = 0;
				x = (currWidth + 1) * tileSize - box / 2;
			} else {
				x += dx;
			}
		}

		if (!falling) {
			calculateCorners(x, nexty + 1);
			if (!bottomLeft && !bottomRight) {
				falling = true;
			}
		}	
	}
	
	public boolean intersects(MapObject o) {
		Rectangle r1 = getRectangle();
		Rectangle r2 = o.getRectangle();
		return r1.intersects(r2);
	}
	public Rectangle getRectangle() {
		return new Rectangle((int) x - box /2, (int) y - box/2, box, box);
	}
	public void render(Graphics g) {
		mainRend(g);
		testRend(g);
	}
	public void mainRend(Graphics g) {
		int checkleft = (int) x + imageWidth/2;	
		int checkright = (int)x - imageWidth/2;	
			
		if (tileMap.cameraStartx < checkleft && checkright < tileMap.cameraEndx) {
			int rendx = (int) x - tileMap.cameraStartx - box / 2;
			int rendy = (int) y - box / 2;
			//g.drawRect(rendx, rendy, box, box);
			if (facingRight) {
				rendx = (int) x - tileMap.cameraStartx - imageWidth / 2;
				rendy = (int) y - imageHeight / 2;
				g.drawImage(animation.getImage(), rendx, rendy, imageWidth, imageHeight, null);
			} else {
				rendx = (int) x - tileMap.cameraStartx - imageWidth / 2 + imageWidth;
				rendy = (int) y - imageHeight / 2;
				g.drawImage(animation.getImage(), rendx, rendy, -imageWidth, imageHeight, null);
			}
		}
	}
	public void testRend(Graphics g) {
		int rendx = (int) x - box / 2;
		int rendy = (int) y - box / 2 + GamePanel.HEIGHT;
		g.drawRect(rendx, rendy, box, box);
	}
}
