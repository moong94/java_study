package button9_omok;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
class MyPanel extends JPanel implements ActionListener{
	int size = 9;
	JButton[][] board= new JButton[size][size];
	int nodeSize = 60;
	int turn = 0;
	JButton resetBtn = new JButton("리셋");
	MyPanel(){
		setLayout(null);
		setBounds(0,0, Button9.WIDTH , Button9.HEIGHT);
		for(int i = 0; i < size; i++) {
			for(int n = 0; n < size; n ++) {
				board[i][n] = new JButton();
				board[i][n].setBounds(n * nodeSize , i * nodeSize 
						, nodeSize , nodeSize);
				board[i][n].setBackground(Color.WHITE);
				board[i][n].addActionListener(this);				
				add(board[i][n]);
			}
		}
		resetBtn.setBounds(700 , 100 , 180, 100);
		resetBtn.addActionListener(this);
		add(resetBtn);
	}
	void Reset() {
		for(int i = 0; i < size; i++) {
			for(int n = 0; n < size; n ++) {				
				board[i][n].setBackground(Color.WHITE);				
			}
		}
	}
	void CheckWin() {
		int win = 0;
		
		// 가로 검사
		for(int i = 0; i < size; i++) {
			for(int n= 0; n < size - 4; n++) {	
				int countp1 = 0;
				int countp2 = 0;
				for(int k = 0; k < 5; k++) {
					Color temp1 = board[i][n + k].getBackground();
					if(temp1 == Color.RED) {
						countp1 += 1;
					}else {
						countp1 = 0;
					}
					Color temp2 = board[i][n + k].getBackground();
					if(temp2 == Color.BLUE) {
						countp2 += 1;
					}else {
						countp2 = 0;
					}
				}
				if(countp1 == 5) {
					win = 1;				
					break;
				}
				if(countp2 == 5) {
					win = 2;
					break;
				}
			}
			if(win >  0) {
				System.out.println("[p" + win + "] 승리 !" );
				break;
			}	
		}
		// 세로 검사 
		for(int i = 0; i < size - 4; i++) {
			for(int n= 0; n < size; n++) {	
				int countp1 = 0;
				int countp2 = 0;
				for(int k = 0; k < 5; k++) {
					Color temp1 = board[i + k][n].getBackground();
					if(temp1 == Color.RED) {
						countp1 += 1;
					}else {
						countp1 = 0;
					}
					Color temp2 = board[i + k][n].getBackground();
					if(temp2 == Color.BLUE) {
						countp2 += 1;
					}else {
						countp2 = 0;
					}
				}
				if(countp1 == 5) {
					win = 1;				
					break;
				}
				if(countp2 == 5) {
					win = 2;
					break;
				}
			}
			if(win >  0) {
				System.out.println("[p" + win + "] 승리 !" );
				break;
			}	
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < size; i++) {
			for(int n= 0; n < size; n++) {
				if(e.getSource() == board[i][n] 
						&& board[i][n].getBackground() == Color.WHITE) {
					if(turn == 0 ) {
						board[i][n].setBackground(Color.RED);						
						turn = 1;						
					}else if(turn == 1 ){
						board[i][n].setBackground(Color.BLUE);
						turn = 0;
					}
					CheckWin();
				}
			}
		}
		if(e.getSource() == resetBtn) {
			Reset();
		}
	}
}

public class Button9 {
	static public JFrame frame = new JFrame();
	static final int WIDTH = 1200;
	static final int HEIGHT = 800;
	public static void main(String[] args) {
		frame.setTitle("오목");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0,0, WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(new MyPanel());
		frame.revalidate();
	}

}
