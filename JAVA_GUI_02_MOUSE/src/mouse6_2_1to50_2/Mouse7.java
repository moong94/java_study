package mouse6_2_1to50_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
class Rect {
	int x; int y; int size; int num; Color color; int back;
}
class MyPanel extends JPanel implements MouseListener , MouseMotionListener{
	Rect [] rect = new Rect[25];
	int a = 0;
	MyPanel() {
		addMouseListener(this); // 마우스 와 패널 연결 
		addMouseMotionListener(this); // 마우스 모션 과 패널 연결 
		int i = 0;
		for(int y = 0; y < 5; y ++) {
			for(int x = 0; x < 5; x ++) {
				rect[i] = new Rect();
				rect[i].size = 50;
				rect[i].x = 400 + x * rect[i].size;
				rect[i].y = 200 + y * rect[i].size;	
				rect[i].num = i;
				rect[i].color = Color.WHITE;			
				rect[i].back = 25 + i;
				i += 1;
			}
		}
	}
	// 부모를 상속받은 자식만 사용가능 protected
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // 지우기기능 
		// 자동 repaint (100/1 초)
		try {Thread.sleep(10);repaint();}catch (Exception e) {}
		//======================================================
		g.drawString("다음 숫자 : " + a, 100, 100);

		for(int i = 0; i < 25; i++) {
			g.setColor(rect[i].color);
			g.fillRect(rect[i].x, rect[i].y,
					rect[i].size, rect[i].size);
			g.setColor(Color.black);
			g.drawRect(rect[i].x, rect[i].y,
					rect[i].size, rect[i].size);
			g.drawString(rect[i].num + "", 
					rect[i].x + 20, rect[i].y + 20);
		}
	}	
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {
		int x = e.getX(); int y = e.getY();	
		System.out.println(x + " " + y);
		for(int i = 0; i < 25; i++) {
			if(rect[i].x < x && x < rect[i].x + rect[i].size) {
				if(rect[i].y < y && y < rect[i].y + rect[i].size) {
					rect[i].num = rect[i].back;
				}		
			}
		}
	}
	public void mouseMoved(MouseEvent e) {
		int x = e.getX(); int y = e.getY();	
		System.out.println(x + " " + y);
		for(int i = 0; i < 25; i++) {
			if(rect[i].x < x && x < rect[i].x + rect[i].size 
					&& rect[i].y < y &&y < rect[i].y + rect[i].size) {
				rect[i].color = Color.RED;
			}
			else {
				rect[i].color = Color.WHITE;
			}
		}	
	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}		
}



public class Mouse7 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("슬라이드");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		//======================================================
		MyPanel mp = new MyPanel();
		frame.setContentPane(mp);
		frame.revalidate();
	}

}
