package mouse6_5_jump;

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
	String text;
	Color color;

	Rect() {
	};

	Rect(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		color = Color.black;
	}
}

class Player {
	double x;
	double y;
	double w;
	double h;
	int state = -1;
	float jump = 8f;
	float gravity = 0.0f; // 중력느낌용
	int direction = 0; // 0:정지상태, 1:점프중, 2:다운중
	// 설정값
	float jump_speed = -5.2f; // 점프속도
	float jump_accell = 0.05f; // 점프가속
	float y_base = 0.5f; // 캐릭터가 서있는 기준점
}

class MyPanel extends JPanel implements MouseListener, MouseMotionListener {
	Rect arrow[] = new Rect[4];
	Player p = new Player();

	MyPanel() {
		addMouseListener(this); // 마우스 와 패널 연결
		addMouseMotionListener(this); // 마우스 모션 과 패널 연결

		for (int i = 0; i < 4; i++) {
			arrow[i] = new Rect();
			arrow[i].w = 50;
			arrow[i].h = 50;
			arrow[i].text = "";
			arrow[i].color = Color.white;
		}
		arrow[0].x = 800;
		arrow[0].y = 500;
		arrow[0].text = "↑";
		arrow[1].x = 850;
		arrow[1].y = 550;
		arrow[1].text = "→";
		arrow[2].x = 800;
		arrow[2].y = 550;
		arrow[2].text = "↓";
		arrow[3].x = 750;
		arrow[3].y = 550;
		arrow[3].text = "←";

		p.x = 100;
		p.y = 500;
		p.w = 100;
		p.h = 100;

	}

	void update() {

		if (p.direction == 1) {
			p.y += p.gravity;
			if (p.gravity >= 0.0f) {
				p.direction = 2;
			} else {
				p.gravity += p.jump_accell;
			}
		} else if (p.direction == 2) {
			p.y -= p.gravity;
			if (p.gravity >= p.jump_speed) {
				p.gravity -= p.jump_accell;
			} else {
				p.direction = 0;
			}

		}
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
		// ===== Update ===============
		update();
		// ===== Render ===============
		for (int i = 0; i < 4; i++) {
			g.setColor(arrow[i].color);
			g.fillRect(arrow[i].x, arrow[i].y, arrow[i].w, arrow[i].h);
			g.setColor(Color.black);
			g.drawRect(arrow[i].x, arrow[i].y, arrow[i].w, arrow[i].h);
			g.drawString(arrow[i].text, arrow[i].x + 20, arrow[i].y + 30);
		}
		g.drawRect((int) p.x, (int) p.y, (int) p.w, (int) p.h);
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
		for (int i = 0; i < 4; i++) {
			if (x > arrow[i].x && x < arrow[i].x + arrow[i].w && y > arrow[i].y && y < arrow[i].y + arrow[i].h) {
				arrow[i].color = Color.lightGray;
			}
		}
		if (p.direction == 0) {
			p.direction = 1;
			p.gravity = p.jump_speed;
		}
	}

	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
	}

	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		for (int i = 0; i < 4; i++) {
			arrow[i].color = Color.white;
		}
	}

	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
	}
}



public class Mouse10 {
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
