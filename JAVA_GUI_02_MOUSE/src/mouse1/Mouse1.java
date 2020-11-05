package mouse1;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Rect{
	int x; int y; int width; int height;
}
class My_panel extends JPanel    {
	Rect rc = new Rect();
	
	My_panel(){				
		rc.x = 10;
		rc.y = 10;
		rc.width = 100;
		rc.height = 100;		
			
	}	
	
	protected void paintComponent(Graphics g){
		
		g.drawRect(rc.x, rc.y, rc.width, rc.height);
	}	
	
}

public class Mouse1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("슬라이드");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		//======================================================
		My_panel mp = new My_panel();
		frame.setContentPane(mp);
		frame.revalidate();
	}

}
