package button_chess;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

class My_Panel extends JPanel implements ActionListener{
	final int SIZE = 8;
	final int P1_PAWN = 11;
	final int P1_ROOK = 12;
	final int P1_KNIGHT = 13;
	final int P1_BISHOP = 14;
	final int P1_QUEEN = 15;
	final int P1_KING = 16;
	
	final int P2_PAWN = 21;
	final int P2_ROOK = 22;
	final int P2_KNIGHT = 23;
	final int P2_BISHOP = 24;
	final int P2_QUEEN = 25;
	final int P2_KING = 26;
	
	int status = 1;
	//1 : 첫 클릭; 2 : 다음 클릭
	
	int board[][] = new int [SIZE][SIZE];
	JButton map_btn[][] = new JButton[SIZE][SIZE];
	int nodesize = 80;
	JButton turn_btn = new JButton();
	int player_turn = 0;
	
	ImageIcon p1_pawn_img = new ImageIcon("chess_image/p1_pawn.png");
	ImageIcon p2_pawn_img = new ImageIcon("chess_image/p2_pawn.png");
	ImageIcon p1_rook_img = new ImageIcon("chess_image/p1_rook.png");
	ImageIcon p2_rook_img = new ImageIcon("chess_image/p2_rook.png");
	ImageIcon p1_bishop_img = new ImageIcon("chess_image/p1_bishop.png");
	ImageIcon p2_bishop_img = new ImageIcon("chess_image/p2_bishop.png");
	ImageIcon p1_knight_img = new ImageIcon("chess_image/p1_knight.png");
	ImageIcon p2_knight_img = new ImageIcon("chess_image/p2_knight.png");
	ImageIcon p1_queen_img = new ImageIcon("chess_image/p1_queen.png");
	ImageIcon p2_queen_img = new ImageIcon("chess_image/p2_queen.png");
	ImageIcon p1_king_img = new ImageIcon("chess_image/p1_king.png");
	ImageIcon p2_king_img = new ImageIcon("chess_image/p2_king.png");
	
	
	My_Panel(){
		this.setLayout(null);
		init();
		play();
		
	}
	
	public void play() {
//		while(king_check()) {
			if(player_turn % 2 == 0) {
				turn_box(1);
			}
			else if(player_turn % 2 == 1) {
				turn_box(2);
			}
			
			image_draw();
			player_turn++;
//		}
	}
	
	public boolean king_check() {
		int cnt = 0;
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(board[j][i] == P1_KING || board[j][i] == P2_KING) {
					cnt++;
				}
			}
		}
		if(cnt == 1) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public void init() {
		
		map_init();
		
		for(int i = 0 ; i < SIZE; i++) {
			board[6][i] = P1_PAWN;
			board[1][i] = P2_PAWN;
		}
		board[7][0] = P1_ROOK;
		board[7][7] = P1_ROOK;
		board[7][1] = P1_KNIGHT;
		board[7][6] = P1_KNIGHT;
		board[7][2] = P1_BISHOP;
		board[7][5] = P1_BISHOP;
		board[7][3] = P1_QUEEN;
		board[7][4] = P1_KING;
		
		board[0][0] = P2_ROOK;
		board[0][7] = P2_ROOK;
		board[0][1] = P2_KNIGHT;
		board[0][6] = P2_KNIGHT;
		board[0][2] = P2_BISHOP;
		board[0][5] = P2_BISHOP;
		board[0][4] = P2_QUEEN;
		board[0][3] = P2_KING;
		
		
		image_draw();
		
		turn_btn.setBounds(225,700,200,50);
		turn_box(1);
		add(turn_btn);
		
	}
	
	public void map_init() {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				map_btn[j][i] = new JButton();
				map_btn[j][i].setBounds(i * nodesize, j * nodesize, nodesize, nodesize);
				if((j + i) % 2 == 1) {
					map_btn[j][i].setBackground(Color.WHITE);
				}
				else {
					map_btn[j][i].setBackground(Color.GRAY);
				}
				add(map_btn[j][i]);
				map_btn[j][i].addActionListener(this);
			}
		}
	}
	
	
	//이미지 그리기
	public void image_draw() {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(board[j][i] == P1_PAWN) {
					map_btn[j][i].setIcon(p1_pawn_img);
				}
				if(board[j][i] == P2_PAWN) {
					map_btn[j][i].setIcon(p2_pawn_img);
				}
				if(board[j][i] == P1_ROOK) {
					map_btn[j][i].setIcon(p1_rook_img);
				}
				if(board[j][i] == P2_ROOK) {
					map_btn[j][i].setIcon(p2_rook_img);
				}
				if(board[j][i] == P1_KNIGHT) {
					map_btn[j][i].setIcon(p1_knight_img);
				}
				if(board[j][i] == P2_KNIGHT) {
					map_btn[j][i].setIcon(p2_knight_img);
				}
				if(board[j][i] == P1_BISHOP) {
					map_btn[j][i].setIcon(p1_bishop_img);
				}
				if(board[j][i] == P2_BISHOP) {
					map_btn[j][i].setIcon(p2_bishop_img);
				}
				if(board[j][i] == P1_QUEEN) {
					map_btn[j][i].setIcon(p1_queen_img);
				}
				if(board[j][i] == P2_QUEEN) {
					map_btn[j][i].setIcon(p2_queen_img);
				}
				if(board[j][i] == P1_KING) {
					map_btn[j][i].setIcon(p1_king_img);
				}
				if(board[j][i] == P2_KING) {
					map_btn[j][i].setIcon(p2_king_img);
				}
				
			}
		}
	}
	
	//이동 경로에 적이 있으면 노란색
	public void enemy_check(int turn) {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(map_btn[j][i].getBackground() == Color.RED && (board[j][i] / 10 == turn)) {
					map_btn[j][i].setBackground(Color.YELLOW);
				}
			}
		}
	}
	
	public void map_location_check(int y, int x) {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				
			}
		}
	}
	
	public void movetoRED(int y, int x) {
		for(int i = 0 ; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(map_btn[j][i].getBackground() == Color.RED) {
					System.out.println("빨강");
				}
			}
		}
	}
	
	public void movetoYELLOW(int y, int x) {
		
	}
	
	public void turn_box(int turn) {
		if(turn == 1) {
			turn_btn.setText("플레이어 1(흰색) 차례");
		}
		else if(turn == 2) {
			turn_btn.setText("플레이어 2(검정색) 차례");
		}
	}
	
	public void p1_pawn_move(int y, int x) {
		if(y == 6) {
			map_btn[y - 1][x].setBackground(Color.RED);
			map_btn[y - 2][x].setBackground(Color.RED);
		}
		else if((board[y - 1][x - 1] / 10 == 2) || (board[y - 1][x + 1] / 10 == 2)){
			enemy_check(1);
		}
		else {
			if(y != 0) {
				map_btn[y - 1][x].setBackground(Color.RED);
			}
		}
		enemy_check(1);
	}
	
	public void p2_pawn_move(int y, int x) {
		if(y == 1) {
			map_btn[y + 1][x].setBackground(Color.RED);
			map_btn[y + 2][x].setBackground(Color.RED);
		}
		else {
			if(y != 0) {
				map_btn[y - 1][x].setBackground(Color.RED);
			}
		}
	}
	
	public void p1_king_move(int y, int x){
	}
	
	public void p2_king_move(int y, int x) {
		
	}
	
	public void rook_move(int y, int x) {
		
	}
	
	public void knight_move(int y, int x) {
		
	}
	
	public void bishop_move(int y, int x) {
		
	}
	
	public void queen_move(int y, int x) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//첫 클릭
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(e.getSource() == map_btn[j][i] && status == 1) {
					status = 2;
					if(board[j][i] / 10 == 1) {
						if(board[j][i] == P1_PAWN) {
							p1_pawn_move(j, i);
						}
						if(board[j][i] == P1_ROOK) {
							rook_move(j, i);
						}
						if(board[j][i] == P1_BISHOP) {
							bishop_move(j, i);
						}
						if(board[j][i] == P1_KNIGHT) {
							knight_move(j, i);
						}
						if(board[j][i] == P1_KING) {
							p1_king_move(j, i);
						}
						if(board[j][i] == P1_QUEEN) {
							queen_move(j, i);
						}
					}
					else if(board[j][i] / 10 == 2) {
						if(board[j][i] == P2_PAWN) {
							p2_pawn_move(j, i);
						}
						if(board[j][i] == P2_ROOK) {
							rook_move(j, i);
						}
						if(board[j][i] == P2_BISHOP) {
							bishop_move(j, i);
						}
						if(board[j][i] == P2_KNIGHT) {
							knight_move(j, i);
						}
						if(board[j][i] == P2_KING) {
							p2_king_move(j, i);
						}
						if(board[j][i] == P2_QUEEN) {
							queen_move(j, i);
						}
					}
				}
				
			}
		}
		
		//다음 클릭
		for(int k = 0; k < SIZE; k++) {
			for(int l = 0 ; l < SIZE; l++) {
				if(e.getSource() == map_btn[l][k] && status == 2) {
					status = 1;
					System.out.println("222");
					movetoRED(l, k);
					movetoYELLOW(l, k);
				}
			}
		}
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
