package mouse6_1_1to50_1;

import java.awt.Graphics;



import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Rect{
	int x; int y; int num; int size;
}
class My_panel extends JPanel implements MouseListener{
	Rect[] rect = new Rect[25];
	int mx = 0; int my = 0;
	My_panel(){
		setLayout(null);  // ���̾ƿ� ���� (setBounds ��밡��������)
		addMouseListener(this);  // ���콺�� �гο��� 	
		int i = 0;
		for(int y = 0; y < 5; y ++) {
			for(int x= 0; x < 5; x ++) {
				rect[i] = new Rect();
				rect[i].size = 50;
				rect[i].num = i;
				rect[i].x = x * rect[i].size;
				rect[i].y = y * rect[i].size;
				i += 1;
			}
		}	
	}
	// panel �� ��� �׸��׸��� ����
	protected void paintComponent(Graphics g){
		super.paintComponent(g); // ���� ȭ������� 				 
		try {Thread.sleep(10);repaint();} // 1000/10 �ʰ�������  paintComponent �ٽ� ����
		catch (InterruptedException e) {}
		//=========================================================================
		// ������� �⺻���� �Ʒ� �ڵ��ϸ�ȴ�. 
		//=========================================================================
		
		for(int i  = 0; i < rect.length; i++) {
			g.drawRect(rect[i].x, rect[i].y, rect[i].size, rect[i].size);
			g.drawString(rect[i].num + "" , rect[i].x + 25, rect[i].y + 25);
		}	
		g.drawString("���콺X : " + mx , 500, 20);
		g.drawString("���콺Y : " + my , 600, 20);
	}	
	Rect getClickedRect(int x , int y) {
		Rect temp = null;
		for(int i  = 0; i < rect.length; i++) {
			if(rect[i].x < x && x <rect[i].x + rect[i].size) {
				if(rect[i].y < y && y <  rect[i].y + rect[i].size) {
					temp = rect[i];
					return temp;
				}
			}
		}	
		return temp;
	}	
	@Override
	public void mousePressed(MouseEvent e) {
		mx = e.getX();  my = e.getY();	
		if(getClickedRect(mx , my) != null) {
			getClickedRect(mx, my).num = 100;
		}	
	}	
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}	
}




public class Mouse6 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("�����̵�");
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
