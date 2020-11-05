package mouse6_6_omok;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	class Stone {
		int xx;
		int yy;
		int type;
		int size;
	}

	boolean isShow = false;
	Stone[][] grid = new Stone[11][11];
	boolean stoneType = false;
	Point mousePos = new Point();
	static final int START_POS = 400;
	public MyPanel() {
		 this.setBackground(new Color(227, 180, 243));  //배경 색
		
		for (int y = 0; y < 11; y++) {
			for (int x = 0; x < 11; x++) {
				Stone stone = new Stone();
				stone.xx = START_POS - 15 + x * 40;
				stone.yy = 100 - 15 + y * 40;
				stone.size = 30;
				stone.type = 0;
				grid[y][x] = stone;

			}
		}
		JButton m_button = new JButton("렉트");
		this.add(m_button);
		
		m_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isShow = !isShow;
				repaint();
			}
		});
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mousePos = e.getPoint();
				// Point rectPos = new Point();
				for (int y = 0; y < 11; y++) {
					for (int x = 0; x < 11; x++) {
						int minX = grid[y][x].xx;
						int maxX = grid[y][x].xx + grid[y][x].size;
						int minY = grid[y][x].yy;
						int maxY = grid[y][x].yy + grid[y][x].size;
						if(mousePos.x >= minX && mousePos.x <= maxX &&
								mousePos.y >= minY && mousePos.y <= maxY){
							if(grid[y][x].type == 0) {
								if(stoneType) {
									grid[y][x].type = 1;
								}
								else {
									grid[y][x].type = 2;
								}		
								stoneType = !stoneType;
							}						
						}
					}
				}
				repaint();
			}
		});

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setFont(new Font("", Font.BOLD, 30));
		g.drawString("나만의오목", 50, 50);
		if(stoneType) {
			g.drawString("흰돌 차례", 50, 100);
		}
		else {
			g.drawString("흑돌 차례", 50, 100);
		}
		//g.drawString(mousePos.x + "", 50, 150);
		//g.drawString(mousePos.y + "", 50, 250);

		for (int n = 0; n < 11; n++) {
			g.drawLine(START_POS + (n * 40), 100, START_POS + (n * 40), 100 + (10 * 40));
			g.drawLine(START_POS, 100 + (n * 40), START_POS + (10 * 40), 100 + (n * 40));
		}

		for (int y = 0; y < 11; y++) {
			for (int x = 0; x < 11; x++) {
				if (isShow) {
					g.drawRect(grid[y][x].xx, grid[y][x].yy, grid[y][x].size, grid[y][x].size);
				}
				if(grid[y][x].type == 2) {
					g.setColor(Color.black);
					g.fillOval(grid[y][x].xx, grid[y][x].yy, grid[y][x].size, grid[y][x].size);
				}
				else if(grid[y][x].type == 1) {
					g.setColor(Color.WHITE);
					g.fillOval(grid[y][x].xx, grid[y][x].yy, grid[y][x].size, grid[y][x].size);
				}
			}
		}
	}
}


public class Mouse11 {
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
