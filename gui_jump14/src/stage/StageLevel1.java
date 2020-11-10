package stage;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import _main.GamePanel;
import _main.KeyManager;
import enemy.Slugger;
import mapObject.Enemy;
import mapObject.Explosion;
import mapObject.Player;
import tile.TileMap;

public class StageLevel1 extends Stage {
	private Player player;
	private TileMap tileMap;
	private int tileSize;
	private ArrayList<Enemy> enemyList;
	private ArrayList<Explosion> explosions;
	// events
	private int eventCount = 0;
	static public boolean eventDead;
	private ArrayList<Rectangle> blackScreen;

	@Override
	public void init() {
		tileMapSetting();
		playerSetting();
		enemySetting();
		explosions = new ArrayList<Explosion>();
		blackScreen = new ArrayList<Rectangle>();
	}

	@Override
	public void update() {
		
		tileMap.setCamera(player.x, player.y);
		
		if(player.dead == true || player.y + player.box >= GamePanel.HEIGHT){ 
			eventDead = true; 
		}
		if (eventDead) {
			eventDead();
		}
		else {
			player.update();
			player.checkAttack(enemyList);
		}
			
		enemyUpdate();
		
		for (int i = 0; i < explosions.size(); i++) {
			explosions.get(i).update();
			if (explosions.get(i).isRemove()) {
				explosions.remove(i);
				i--;
			}
		}
		if (KeyManager.instance.isKeyDown(KeyEvent.VK_1)) {
			eventDead = true;
		}
		
	}

	@Override
	public void render(Graphics g) {
		tileMap.render(g);
		player.render(g);
		
		
		enemyRender(g);

		// draw transition boxes
		g.setColor(java.awt.Color.BLACK);
		for (int i = 0; i < blackScreen.size(); i++) {
			g.fillRect(blackScreen.get(i).x, blackScreen.get(i).y,
					blackScreen.get(i).width, blackScreen.get(i).height);

		}
	}

	void tileMapSetting() {
		tileSize = 30;
		tileMap = new TileMap();
		tileMap.setTileSize(tileSize);
		tileMap.setTileImage("/Tilesets/grasstileset.gif");
		tileMap.setMap("/Maps/level1-1.map");
	}

	void playerSetting() {
		player = new Player();
		player.init(tileMap, tileSize);
		player.setPosition(100, 100);
	}

	void enemySetting() {
		enemyList = new ArrayList<>();
		Point[] points = new Point[] { new Point(200, 100), 
				new Point(860, 200), new Point(1525, 200),
				new Point(1680, 200), new Point(1800, 200) };

		for (int i = 0; i < points.length; i++) {
			Slugger slugger = new Slugger();
			slugger.init(tileMap, tileSize);
			slugger.setPosition(points[i].x, points[i].y);
			enemyList.add(slugger);
		}
	}

	void enemyUpdate() {
		for (int i = 0; i < enemyList.size(); i++) {
			Enemy e = enemyList.get(i);
			e.update();
			if (e.isDead()) {
				enemyList.remove(i);
				i--;
				explosions.add(new Explosion(tileMap, e.x, e.y));
			}
		}
	}

	void enemyRender(Graphics g) {
		for (int i = 0; i < enemyList.size(); i++) {
			Enemy e = enemyList.get(i);
			e.render(g);
			g.drawString("enemyhp : " + e.getHealtn() + "", 300, 550 + i * 30);
		}

		for (int i = 0; i < explosions.size(); i++) {
			Explosion e = explosions.get(i);
			e.render(g);

		}
	}

	// player dead
	private void eventDead() {
		eventCount++;
		if (eventCount == 1) {
			blackScreen.clear();
			blackScreen.add(new Rectangle(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT / 2));
			blackScreen.add(new Rectangle(0, 0, GamePanel.WIDTH / 2, GamePanel.HEIGHT));
			blackScreen.add(new Rectangle(0, GamePanel.HEIGHT / 2, GamePanel.WIDTH, GamePanel.HEIGHT / 2));
			blackScreen.add(new Rectangle(GamePanel.WIDTH / 2, 0, GamePanel.WIDTH / 2, GamePanel.HEIGHT));
			
		}
		if (eventCount == 60) {
			init();
			eventCount = 0;
			eventDead = false;
			blackScreen.clear();
		}
	}
}
