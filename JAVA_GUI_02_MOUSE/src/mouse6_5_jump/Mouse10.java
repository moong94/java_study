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
	float gravity = 0.0f; // �߷´�����
	int direction = 0; // 0:��������, 1:������, 2:�ٿ���
	// ������
	float jump_speed = -5.2f; // �����ӵ�
	float jump_accell = 0.05f; // ��������
	float y_base = 0.5f; // ĳ���Ͱ� ���ִ� ������
}

class MyPanel extends JPanel implements MouseListener, MouseMotionListener {
	Rect arrow[] = new Rect[4];
	Player p = new Player();

	MyPanel() {
		addMouseListener(this); // ���콺 �� �г� ����
		addMouseMotionListener(this); // ���콺 ��� �� �г� ����

		for (int i = 0; i < 4; i++) {
			arrow[i] = new Rect();
			arrow[i].w = 50;
			arrow[i].h = 50;
			arrow[i].text = "";
			arrow[i].color = Color.white;
		}
		arrow[0].x = 800;
		arrow[0].y = 500;
		arrow[0].text = "��";
		arrow[1].x = 850;
		arrow[1].y = 550;
		arrow[1].text = "��";
		arrow[2].x = 800;
		arrow[2].y = 550;
		arrow[2].text = "��";
		arrow[3].x = 750;
		arrow[3].y = 550;
		arrow[3].text = "��";

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

	// �θ� ��ӹ��� �ڽĸ� ��밡�� protected
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // �������
		// �ڵ� repaint (100/1 ��)
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
		frame.setTitle("�����̵�");
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
