package mapObject;

import java.awt.Graphics;

import javax.swing.SortingFocusTraversalPolicy;

import _main.GamePanel;
import tile.TileMap;

public class Enemy extends MapObject {
	protected int health;
	protected int maxHealth;
	protected boolean dead;
	protected int damage;

	protected boolean flinching;
	protected long flinchTimer;

	public void init(TileMap tm, int size) {
		super.init(tm, size);
	}

	public boolean isDead() {
		return dead;
	}
	public int getHealtn() {
		return health;
	}
	public int getDamage() {
		return damage;
	}

	public void hit(int damage) {
		if (dead || flinching)
			return;
		health -= damage;
		if (health < 0)
			health = 0;
		if (health == 0)
			dead = true;
		flinching = true;
		flinchTimer = System.nanoTime();
	}

	public void update() {
		// check done flinching
		if (flinching) {
			long elapsed = (System.nanoTime() - flinchTimer) / 1000000;
			if (elapsed > 1000) {
				flinching = false;
			}
		}		
	};

	public void render(Graphics g) {
		if (flinching) {
			long elapsed = (System.nanoTime() - flinchTimer) / 1000000;
			if (elapsed / 100 % 2 == 0) {
				return;
			}
		}
		super.render(g);
	}
}
