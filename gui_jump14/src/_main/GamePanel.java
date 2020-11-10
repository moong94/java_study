package _main;
import java.awt.Graphics;
import javax.swing.JPanel;
import stage.StageManager;
public class GamePanel extends JPanel{
	public static int DELAY = 10;
	public static final int WIDTH = 320;
	public static final int HEIGHT = 240;
	GamePanel(){
		StageManager.instance.init();
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			Thread.sleep(DELAY);
			repaint();
		}catch(Exception e) {}
		StageManager.instance.update();
		StageManager.instance.render(g);
	}
}
