package array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx17 {

	public static void main(String[] args) {
		/* 
		 * # Æ½ÅÃÅä
		 * === Æ½ÅÃÅä ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]ÀÎµ¦½º ÀÔ·Â : 6
		 * === Æ½ÅÃÅä ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]½Â¸®
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] game = new int[9];
		int[] check = new int[9];
		
		int cnt = 0;
		
		int win = 0;
		int lose = 0;
		
		boolean opt = true;
		boolean opt2 = true;
		
		while(cnt < 9) {
			while(opt) {
				System.out.print("p1 ÀÔ·Â : ");
				int p1 = scan.nextInt();
		
				if(p1 < 0 || p1 > 8) {
					System.out.println("0~8ÀÇ ¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä.");
					continue;
				}
				if(game[p1] != 0) {
					System.out.print("´Ù½Ã ÀÔ·Â : ");
					continue;
				}
				else {
					game[p1] = 1;
					cnt++;
					break;
				}
				
			}
			for(int i = 0; i < 9; i++) {
				System.out.print("[");
				if(game[i] == 0) {
					System.out.print(" ]");
				}
				else if(game[i] == 1) {
					System.out.print("O]");
				}
				else if(game[i] == 2) {
					System.out.print("X]");
				}
				if(i % 3 == 2) {
					System.out.println();
				}
			}
			
			if(win == 1) {
				System.out.println("p1½Â¸®");
				break;
			}
			
			else if(lose == 1) {
				System.out.println("p2½Â¸®");
				break;
			}
			else if(cnt == 9) {
				System.out.println("¹«½ÂºÎ");
				break;
			}
			System.out.println("p2Â÷·Ê");
			
			
			while(opt2) {
				int p2 = ran.nextInt(9);
				if(game[p2] != 0) {
					continue;
				}
				else {
					game[p2] = 2;
					cnt++;
					break;
				}
			}
			for(int i = 0; i < 9; i++) {
				System.out.print("[");
				if(game[i] == 0) {
					System.out.print(" ]");
				}
				else if(game[i] == 1) {
					System.out.print("O]");
				}
				else if(game[i] == 2) {
					System.out.print("X]");
				}
				if(i % 3 == 2) {
					System.out.println();
				}
			}
		
			
			for(int i = 0; i < 3; i++) {
				if(game[i] == 1 && game[i + 3] == 1 && game[i + 6] == 1) {
					win = 1;
				}
				else if(game[i] == 2 && game[i + 3] == 2 && game[i + 6] == 2) {
					lose = 1;
				}
				
			}
			if(game[0] == 1 && game[1] == 1 && game[2] == 1) {
				win = 1;
			}
			else if(game[3] == 1 && game[4] == 1 && game[5] == 1) {
				win = 1;
			}
			else if(game[6] == 1 && game[7] == 1 && game[8] == 1) {
				win = 1;
			}
			else if(game[0] == 2 && game[1] == 2 && game[2] == 2) {
				lose = 1;
			}
			else if(game[3] == 2 && game[4] == 2 && game[5] == 2) {
				lose = 1;
			}
			else if(game[6] == 2 && game[7] == 2 && game[8] == 2) {
				lose = 1;
			}
			else if(game[0] == 1 && game[4] == 1 && game[8] == 1) {
				win = 1;
			}
			else if(game[0] == 2 && game[4] == 2 && game[8] == 2) {
				lose = 1;
			}
			else if(game[2] == 1 && game[4] == 1 && game[6] == 1) {
				win = 1;
			}
			else if(game[2] == 2 && game[4] == 2 && game[6] == 2) {
				lose = 1;
			}

			if(win == 1) {
				System.out.println("p1½Â¸®");
				break;
			}
			
			else if(lose == 1) {
				System.out.println("p2½Â¸®");
				break;
			}
			else if(cnt == 9) {
				System.out.println("¹«½ÂºÎ");
				break;
			}
			
		}
		
	}

}
