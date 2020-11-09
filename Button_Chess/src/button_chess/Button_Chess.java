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
	
	int now_loc[] = new int[2];
	int red_loc[][];
	
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
		turn_box(0);
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
				if(board[j][i] == 0) {
					map_btn[j][i].setIcon(null);
				}
			}
		}
	}
	
	public void movetoRED(int y, int x) {
		if(map_btn[y][x].getBackground() == Color.RED) {
			board[y][x] = board[now_loc[0]][now_loc[1]];
			board[now_loc[0]][now_loc[1]] = 0;
			System.out.println(now_loc[0] + "  " + now_loc[1]);
			for(int i = 0; i < SIZE; i++) {
				for(int j = 0; j < SIZE; j++) {
					if((j + i) % 2 == 1) {
						map_btn[j][i].setBackground(Color.WHITE);
					}
					else {
						map_btn[j][i].setBackground(Color.GRAY);
					}
				}
			}
		}
			
	}
	
	public void turn_box(int turn) {
		if(turn == 0) {
			turn_btn.setText("플레이어 1(흰색) 차례");
		}
		else if(turn == 1) {
			turn_btn.setText("플레이어 2(검정색) 차례");
		}
	}
	
	public boolean enemy_check() {
		
		return true;
	}
	
	
	public void p1_pawn_move(int y, int x) {
		now_loc[0] = y;
		now_loc[1] = x;
		
		if(y == 6 && (board[y - 1][x] / 10) == 0) {
			map_btn[y - 1][x].setBackground(Color.RED);
			map_btn[y - 2][x].setBackground(Color.RED);
			red_loc = new int[2][2];
			red_loc[0][0] = y - 1;
			red_loc[0][1] = x;
			red_loc[1][0] = y - 2;
			red_loc[1][1] = x;
		}
		else {
			if(y != 0 && (board[y - 1][x] / 10) == 0) {
				map_btn[y - 1][x].setBackground(Color.RED);
				red_loc = new int [1][2];
				red_loc[0][0] = y - 1;
				red_loc[0][1] = x;
			}
		}
		if(y > 0 && y < SIZE && x > 0 && x < SIZE && board[y - 1][x - 1] / 10 == 2) {
			map_btn[y - 1][x - 1].setBackground(Color.RED);
		}
		if(y > 0 && y < SIZE && x > 0 && x < SIZE && board[y - 1][x + 1] / 10 == 2) {
			map_btn[y - 1][x + 1].setBackground(Color.RED);
		}
	}
	
	public void p2_pawn_move(int y, int x) {
		now_loc[0] = y;
		now_loc[1] = x;
		
		if(y == 1 && (board[y + 1][x] / 10) == 0) {
			map_btn[y + 1][x].setBackground(Color.RED);
			map_btn[y + 2][x].setBackground(Color.RED);
			red_loc = new int[2][2];
			red_loc[0][0] = y + 1;
			red_loc[0][1] = x;
			red_loc[1][0] = y + 2;
			red_loc[1][1] = x;
		}
		else {
			if(y != 7 && (board[y + 1][x] / 10) == 0) {
				map_btn[y + 1][x].setBackground(Color.RED);
				red_loc = new int [1][2];
				red_loc[0][0] = y + 1;
				red_loc[0][1] = x;
			}
		}
		if(y > 0 && y < SIZE && x > 0 && x < SIZE && (board[y + 1][x + 1] / 10 == 1)) {
			map_btn[y + 1][x + 1].setBackground(Color.RED);
		}
		if(y > 0 && y < SIZE && x > 0 && x < SIZE && (board[y + 1][x - 1] / 10 == 1)) {
			map_btn[y + 1][x - 1].setBackground(Color.RED);
		}
	}
	
	public void p1_king_move(int y, int x){
	}
	
	public void p2_king_move(int y, int x) {
		
	}
	
	public void rook_move(int y, int x) {
		now_loc[0] = y;
		now_loc[1] = x;
		
		y = now_loc[0];
		x = now_loc[1];
		while(y < SIZE - 1) {
			if(board[y + 1][x] / 10 == ((player_turn % 2) + 1)) {
				break;
			}
			else if(board[y + 1][x] / 10 != ((player_turn % 2) + 1) && board[y + 1][x] != 0) {
				map_btn[y + 1][x].setBackground(Color.RED);
				break;
			}
			else {
				map_btn[y + 1][x].setBackground(Color.RED);
				y++;
			}
		}

		y = now_loc[0];
		x = now_loc[1];
		while(y > 0) {
			if(board[y - 1][x] / 10 == ((player_turn % 2) + 1)) {
				break;
			}
			else if(board[y - 1][x] / 10 != ((player_turn % 2) + 1) && board[y - 1][x] != 0) {
				map_btn[y - 1][x].setBackground(Color.RED);
				break;
			}
			else {
				map_btn[y - 1][x].setBackground(Color.RED);
				y--;
			}
		}
		
		y = now_loc[0];
		x = now_loc[1];
		while(x < SIZE - 1) {
			if(board[y][x + 1] / 10 == ((player_turn % 2) + 1)) {
				break;
			}
			else if(board[y][x + 1] / 10 != ((player_turn % 2) + 1) && board[y][x + 1] != 0) {
				map_btn[y][x + 1].setBackground(Color.RED);
				break;
			}
			else {
				map_btn[y][x + 1].setBackground(Color.RED);
				x++;
			}
		}
		
		y = now_loc[0];
		x = now_loc[1];
		while(x > 0) {
			if(board[y][x - 1] / 10 == ((player_turn % 2) + 1)) {
				break;
			}
			else if(board[y][x - 1] / 10 != ((player_turn % 2) + 1) && board[y][x - 1] != 0) {
				map_btn[y][x - 1].setBackground(Color.RED);
				break;
			}
			else {
				map_btn[y][x - 1].setBackground(Color.RED);
				x--;
			}
		}
	}
	
	public void knight_move(int y, int x) {
		
	}
	
	public void bishop_move(int y, int x) {
		
	}
	
	public void queen_move(int y, int x) {
		
	}
	
	public void first_loc(int y, int x) {
		now_loc[0] = y;
		now_loc[1] = x;
	}
	
	public void cancel(int y, int x) {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if((j + i) % 2 == 1) {
					map_btn[j][i].setBackground(Color.WHITE);
				}
				else {
					map_btn[j][i].setBackground(Color.GRAY);
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//첫 클릭
		if(status == 1) {
			status = 2;
			System.out.println("1");
			for(int i = 0; i < SIZE; i++) {
				for(int j = 0; j < SIZE; j++) {
					if(e.getSource() == map_btn[j][i]) {
						first_loc(j, i);
						if(board[j][i] == 0) {
							status = 1;
							return;
						}
						else if((board[j][i] / 10) != (player_turn % 2) +  1) {
							status = 1;
							return;
						}
						if(board[j][i] / 10 == 1 && player_turn % 2 == 0) {
							map_btn[j][i].setBackground(Color.YELLOW);
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
						else if(board[j][i] / 10 == 2 && player_turn % 2 == 1) {
							map_btn[j][i].setBackground(Color.YELLOW);
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
		}
		
		//다음 클릭
		else if(status == 2) {
			status = 1;
			for(int i = 0; i < SIZE; i++) {
				for(int j = 0 ; j < SIZE; j++) {
					if(e.getSource() == map_btn[j][i]) {
						if(map_btn[j][i].getBackground() == Color.RED) {
							player_turn++;
							movetoRED(j, i);
						}
						else if(now_loc[0] == j && now_loc[1] == i) {
							cancel(j, i);
						}
						if((board[j][i] / 10) == (player_turn % 2) + 1) {
							cancel(j, i);
						}
					}
				}
			}
			image_draw();
			turn_box(player_turn % 2);
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
