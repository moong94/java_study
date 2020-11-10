package tile;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import _main.GamePanel;
import _main.KeyManager;
public class TileMap {
	int tileSize;
	int showWidthCount;
	int showHeightCount;
	BufferedImage tileImage;
	int tileImageCount;
	Tile[] tileList;
	int mapWidthCount;
	int mapHeightCount;
	int [][] mapType;
	int widthSize;
	int heightSize;	
	
	int playerx;
	int playery;
	//public 
	public int cameraStartx;
	public int cameraEndx;
	public void setTileSize(int size) {
		tileSize = size;
		showWidthCount = GamePanel.WIDTH/tileSize + 5;
		showHeightCount = GamePanel.HEIGHT/tileSize;
	}
	public void setTileImage(String path) {
		try {
			tileImage = ImageIO.read(getClass().getResourceAsStream(path));
		}catch(IOException e) {}
		
		tileImageCount = tileImage.getWidth()/tileSize;
		tileList = new Tile[tileImageCount * 2];
		BufferedImage subImage;
		for(int i = 0; i < tileImageCount; i++) {
			subImage = tileImage.getSubimage(i * tileSize , 0 , tileSize, tileSize);
			tileList[i] = new Tile(subImage , Tile.NORMAL);
			subImage = tileImage.getSubimage(i * tileSize , tileSize , tileSize, tileSize);
			tileList[i + tileImageCount] = new Tile(subImage , Tile.BLOCKED);
		}
	}
	public void setMap(String path) {
		try {
			InputStream in = getClass().getResourceAsStream(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			mapWidthCount = Integer.parseInt(br.readLine());
			mapHeightCount = Integer.parseInt(br.readLine());
			
			mapType = new int[mapHeightCount][mapWidthCount];
			String delims = "\\s+";
			for(int h = 0; h < mapHeightCount; h++) {
				String line = br.readLine();
				String[] tokens = line.split(delims);
				for(int w = 0; w < mapWidthCount; w++) {
					mapType[h][w] = Integer.parseInt(tokens[w]);
				}
			}
			widthSize = mapWidthCount * tileSize;
			heightSize = mapHeightCount * tileSize;			
		}catch(Exception e) {}	
	}
	public void setCamera(double x, double y) {
		playerx = (int)x;
		playery = (int)y;
	}
	
	public int getType(int y, int x) {
		int index = mapType[y][x];	
		return tileList[index].getType();
	}
	
	public void update() {}
	public void render(Graphics g) {
		mainMap(g);
		testMap(g);		
	}
	
	void mainMap(Graphics g) {
		cameraStartx = playerx - GamePanel.WIDTH / 2;
		if(cameraStartx < 0) cameraStartx = 0;		
		cameraEndx = playerx + GamePanel.WIDTH / 2;
		if(cameraEndx > widthSize) cameraStartx = widthSize - GamePanel.WIDTH;
		int showIndex = cameraStartx / tileSize;
		if(showIndex < 0 ) showIndex = 0;	
		int addx =  showIndex * tileSize - cameraStartx;		
		for(int h = 0; h < mapHeightCount; h++) {
			int startIndex = 0;			
			for(int w = showIndex; w < showWidthCount + showIndex; w++) {	
				if(w >= mapWidthCount ) continue;
				int hw = mapType[h][w];
				BufferedImage img = tileList[hw].getImage();
				int rendx = startIndex * tileSize  + addx;
				int rendy = h * tileSize  ;
				g.drawImage(img,  rendx , rendy, null);		
				startIndex += 1;
			}
		}			
	}
	void testMap(Graphics g) {
		for(int h = 0; h < mapHeightCount; h++) {
			for(int w = 0; w < mapWidthCount; w++) {
				if(mapType[h][w] <= 0)continue;
				int hw = mapType[h][w];
				BufferedImage img = tileList[hw].getImage();
				g.drawImage(img, (int) w * tileSize , (int)h * tileSize  + GamePanel.HEIGHT, null);
			}
		}
		for(int h = 0; h < mapHeightCount; h++) {
			for(int w = 0; w < mapWidthCount; w++) {
				if(mapType[h][w] < tileImageCount)continue;
				g.drawRect((int) w * tileSize , (int)h * tileSize  + GamePanel.HEIGHT, tileSize, tileSize);		
			}
		}	
		g.setColor(Color.BLUE);
		g.drawRect(0,0, GamePanel.WIDTH , GamePanel.HEIGHT);
		g.drawRect(playerx - GamePanel.WIDTH/2 ,
				GamePanel.HEIGHT, GamePanel.WIDTH , GamePanel.HEIGHT);
				
	}
}
