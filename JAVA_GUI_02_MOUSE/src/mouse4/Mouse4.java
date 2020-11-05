package mouse4;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
class Rect{
	int x; int y; int width; int height;
}
class My_panel extends JPanel   implements  MouseListener{
	Rect rc = new Rect();
	
	My_panel(){				
		rc.x = 10;
		rc.y = 10;
		rc.width = 100;
		rc.height = 100;		
		addMouseListener(this);		

	}	
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g); // 전의 화면지우기 	

		g.drawRect(rc.x, rc.y, rc.width, rc.height);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getX() + " " + e.getY());
		rc.width += 40;
		repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}	
	
}



public class Mouse4 {
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
