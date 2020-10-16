package methodEx;

import java.util.Scanner;

//# ƽ����

class TicTacToe{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		// 1[turn1�¸�] 2[turn2�¸�]
	
	// game �迭�� ����(" ")���� �ʱ�ȭ
	void setGame() {
		for(int i=0; i<game.length; i++) {
			for(int j=0; j<game[i].length; j++) {
					game[i][j] = " ";
			}
		}
	}
	
	// ���� ȭ�� ���
	void showGame() {
		System.out.println("== ƽ���� ==");
		for(int i=0; i<game.length; i++) {
			for(int j=0; j<game[i].length; j++) {
				System.out.print("[" + game[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println("==========");
	}
	
	// �ε��� ����
	void choiceIdx() {
		if(turn % 2 == 0) {
			System.out.print("[1��]x�ε��� �Է� : ");
			int xIdx = scan.nextInt();
			System.out.print("[1��]y�ε��� �Է� : ");
			int yIdx = scan.nextInt();
			
			if(game[xIdx][yIdx].equals(" ")) {
				game[xIdx][yIdx] = "O";
				turn += 1;
			}else {
				System.out.println("�߸��Է��߽��ϴ�.");
			}
		}
		else if(turn % 2 == 1) {
			System.out.print("[2��]x�ε��� �Է� : ");
			int xIdx = scan.nextInt();
			System.out.print("[2��]y�ε��� �Է� : ");
			int yIdx = scan.nextInt();
			
			if(game[xIdx][yIdx].equals(" ")) {
				game[xIdx][yIdx] = "X";
				turn += 1;
			}else {
				System.out.println("�߸��Է��߽��ϴ�.");
			}
		}
	}
	
	// ���� : ���� �˻�
	// 00 01 02
	// 10 11 12
	// 20 21 22
	void exitWidth() {
		for(int i=0; i<game.length; i++) {
			if(game[i][0].equals("O") && game[i][1].equals("O") && game[i][2].equals("O")) {
				win = 1;
			}
			if(game[i][0].equals("X") && game[i][1].equals("X") && game[i][2].equals("X")) {
				win = 2;
			}
		}
	}
	
	// ���� : ���� �˻�
	// 00 10 20
	// 01 11 21
	// 02 12 22
	void exitHeight() {
		for(int i=0; i<game.length; i++) {
			if(game[0][i].equals("O") && game[1][i].equals("O") && game[2][i].equals("O")) {
				win = 1;
			}
			if(game[0][i].equals("X") && game[1][i].equals("X") && game[2][i].equals("X")) {
				win = 2;
			}
		}
	}
	
	// ���� : �밢�� �˻�
	// 00 11 22
	// 02 11 20
	void exitCross() {
		if(game[0][0].equals("O") && game[1][1].equals("O") && game[2][2].equals("O")) {
			win = 1;
		}
		if(game[0][0].equals("X") && game[1][1].equals("X") && game[2][2].equals("X")) {
			win = 2;
		}
	}
	
	void run() {
		
		// game�迭�� ���� ���ڿ�(" ")�� �ʱ�ȭ
		setGame();
		
		while(true) {
			
			showGame();
			
			// ���� ����
			if(win == 1) {
				System.out.println("turn1 �¸�");
				break;
			}else if(win == 2) {
				System.out.println("tur2 �¸�");
				break;
			}
			
			choiceIdx();
			
			exitWidth();
			exitHeight();
			exitCross();
			
		}		
	}
	
}

public class Method_ƽ���� {

	public static void main(String[] args) {
		TicTacToe tic = new TicTacToe();
		tic.run();

	}

}
