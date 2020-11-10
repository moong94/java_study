package stage;

import java.awt.Graphics;

public abstract class Stage {
	public abstract void init();
	public abstract void update();
	public abstract void render(Graphics g);
}
