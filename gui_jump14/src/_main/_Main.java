package _main;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
public class _Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		int width = 1800;
		int height = 800;
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width , height);
		frame.setTitle("jump game");
		
//		Toolkit tk = Toolkit.getDefaultToolkit();
//		Dimension screenSize = tk.getScreenSize();
//		frame.setLocation(screenSize.width / 2 - width/2 , screenSize.height/2-height/2);
	
		frame.setVisible(true);	
		frame.addKeyListener(KeyManager.instance);		
		frame.setContentPane(new GamePanel());
		frame.revalidate();
	}
}
