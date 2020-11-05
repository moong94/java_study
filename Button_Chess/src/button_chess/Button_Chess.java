package button_chess;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

class My_Panel extends JPanel implements ActionListener{
	final int SIZE = 8;
	final int P1_PAWN = 1;
	final int P1_ROOK = 2;
	final int P1_KNIGHT = 3;
	final int P1_BISHOP = 4;
	final int P1_QUEEN = 5;
	final int P1_King = 6;
	
	final int P2_PAWN = 11;
	final int P2_ROOK = 12;
	final int P2_KNIGHT = 13;
	final int P2_BISHOP = 14;
	final int P2_QUEEN = 15;
	final int P2_King = 16;
	
	int board[][] = new int [SIZE][SIZE];
	JButton map_btn[][] = new JButton[SIZE][SIZE];
	int nodesize = 80;
	JButton turn = new JButton();
	int player_turn = 0;
	
	
	My_Panel(){
		this.setLayout(null);
		init();
		
	}
	
	public void init() {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				map_btn[j][i] = new JButton();
				map_btn[j][i].setBounds(i * nodesize, j * nodesize, nodesize, nodesize);
				if((j + i) % 2 == 1) {
					map_btn[j][i].setBackground(Color.WHITE);
				}
				else {
					map_btn[j][i].setBackground(Color.BLACK);
				}
				add(map_btn[j][i]);
			}
		}
		turn.setBounds(245,700,150,50);
		if(player_turn % 2 == 0) {
			turn.setText("플레이어 1(흰색) 차례");
		}
		else if(player_turn % 2 == 1) {
			turn.setText("플레이어 2(검정색) 차례");
		}
		add(turn);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

public class Button_Chess {
	static public JFrame frame = new JFrame();
	static final int WIDTH = 655;
	static final int HEIGHT = 800;
	
	public static void main(String[] args) {
		frame.setTitle("CHESS");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(200, 150, WIDTH, HEIGHT);
		frame.setVisible(true);
		
		frame.setContentPane(new My_Panel());
		frame.revalidate();
	}

}
