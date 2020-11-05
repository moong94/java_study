package mouse6_4_drag;

import java.awt.Color;



import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


class Rect {
	int x;
	int y;
	int w;
	int h;
	Color color;
	Rect(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		color = Color.black;
	}
}
class MyPanel extends JPanel implements MouseListener, MouseMotionListener {

	Rect rc = new Rect(100, 100, 100, 100);
	boolean press = false;
	int pressX; int pressY;
	MyPanel() {
		addMouseListener(this); // 마우스 와 패널 연결
		addMouseMotionListener(this); // 마우스 모션 과 패널 연결
		rc.x = 100;
		rc.y = 100;
	}

	// 부모를 상속받은 자식만 사용가능 protected
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // 지우기기능
		// 자동 repaint (100/1 초)
		try {
			Thread.sleep(10);
			repaint();
		} catch (Exception e) {
		}
		// ======================================================
		g.drawString(press + "", 100, 100);
		g.drawRect(rc.x, rc.y, rc.w, rc.h);
	}
	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();	
		if (x > rc.x && x < rc.x + rc.w && y > rc.y && y < rc.y + rc.h) {
			press = true;
			pressX = x - rc.x;
			pressY = y - rc.y;
		}
	}
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();	
		
	}
	public void mouseReleased(MouseEvent e) {
		press = false;
	}
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if(press == true) {
			rc.x = x - pressX;
			rc.y = y - pressY;
		}
	}
}


public class Mouse9 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("슬라이드");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200, 800);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		//======================================================
		MyPanel mp = new MyPanel();
		frame.setContentPane(mp);
		frame.revalidate();
	}

}
