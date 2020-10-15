package classEx;

import java.util.Scanner;

class Ex10{
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		
	
	int con[] = new int[9];
}

public class Class_∆Ω≈√≈‰ {

	public static void main(String[] args) {
		/* 
		 * # ∆Ω≈√≈‰
		 * === ∆Ω≈√≈‰ ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]¿Œµ¶Ω∫ ¿‘∑¬ : 6
		 * === ∆Ω≈√≈‰ ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]Ω¬∏Æ
		 * 
		 */
		
		Ex10 e = new Ex10();
		Scanner scan = new Scanner(System.in);
		
		int row = -1;
		int calumn = -1;
		
		for(int i = 0; i < e.con.length; i++) {
			e.con[i] = i+10;
		}
		
		while(true) {
			
			System.out.println("===∆Ω≈√≈‰===");
			for(int i = 0; i < e.game.length; i++) {
				for(int j = 0; j < e.game[i].length; j++) {
					if(e.game[i][j] == null) {
						e.game[i][j] = " " ;
					}
					System.out.print("[" + e.game[i][j] + "]");
				}
				System.out.println();
			}
			
			if(e.win == 1){
				System.out.println("p" + (((e.turn - 1) % 2) + 1) + "Ω¬∏Æ");
				break;
			}
			if(e.turn == 9) {
				System.out.println("π´Ω¬∫Œ");
				break;
			}
			
			System.out.print("[p" + ((e.turn % 2) + 1) + "] ¿Œµ¶Ω∫ ¿‘∑¬ : ");
			int input = scan.nextInt();

			if(input < 0 || input >= 9) {
				System.out.println("¿Œµ¶Ω∫ ¿‘∑¬ ø¿∑˘");
				continue;
			}
			
			row = input % 3;
			calumn = input / 3;

			if(e.game[calumn][row].equals(" ")) {
				if(e.turn % 2 == 0) {
					e.game[calumn][row] = "O";
				}
				else {
					e.game[calumn][row] = "X";
				}
				
				//0 || 1
				e.con[input] = e.turn % 2;
				e.turn++;
				
			}
			else {
				System.out.println("¿Œµ¶Ω∫ ¿‘∑¬ ø¿∑˘");
				continue;
			}
			
			if(e.con[0] == e.con[1] && e.con[1] == e.con[2]) {
				e.win = 1;
			}
			else if(e.con[3] == e.con[4] && e.con[4] == e.con[5]) {
				e.win = 1;
			}
			else if(e.con[6] == e.con[7] && e.con[7] == e.con[8]) {
				e.win = 1;
			}
			else if(e.con[0] == e.con[3] && e.con[3] == e.con[6]) {
				e.win = 1;
			}
			else if(e.con[1] == e.con[4] && e.con[4] == e.con[7]) {
				e.win = 1;
			}
			else if(e.con[2] == e.con[5] && e.con[5] == e.con[8]) {
				e.win = 1;
			}
			else if(e.con[0] == e.con[4] && e.con[4] == e.con[8]) {
				e.win = 1;
			}
			else if(e.con[2] == e.con[4] && e.con[4] == e.con[6]) {
				e.win = 1;
			}			
			
		}
	}

}
