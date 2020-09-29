package array;

import java.util.Scanner;

public class Omok {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int size = 10;
		int[][] omok = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
		};

		int p1Y = 0;
		int p1X = 0;
		int p2Y = 0;
		int p2X = 0;

		int turn = 0;

		int win = 0;

		boolean run = true;
		while (run) {
			// 전체화면 출력
			System.out.println(" ==== OMOK GAME ====");
			System.out.print("  ");
			for (int i = 0; i < size; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i = 0; i < size; i++) {
				System.out.print(i + " ");
				for (int j = 0; j < size; j++) {
					System.out.print(omok[i][j] + " ");
				}
				System.out.println();
			}

			if (win == 1) {
				System.out.println("p1승리");
				break;
			} else if (win == 2) {
				System.out.println("p2승리");
				break;
			}

			// 바둑알 두기
			if (turn % 2 == 0) {
				System.out.println("[p1차례]");
				System.out.print("Y좌표 입력 : ");
				p1Y = scan.nextInt();
				System.out.print("X좌표 입력 : ");
				p1X = scan.nextInt();
				if (omok[p1Y][p1X] == 0) {
					omok[p1Y][p1X] = 1;
					turn += 1;
				}
			} else if (turn % 2 == 1) {
				System.out.println("[p2차례]");
				System.out.print("Y좌표 입력 : ");
				p2Y = scan.nextInt();
				System.out.print("X좌표 입력 : ");
				p2X = scan.nextInt();
				if (omok[p2Y][p2X] == 0) {
					omok[p2Y][p2X] = 2;
					turn += 1;
				}
			}

			// 가로검사
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size - 4; j++) {
					if (omok[i][j] == 1 && omok[i][j + 1] == 1 && 
                        omok[i][j + 2] == 1 && omok[i][j + 3] == 1
							&& omok[i][j + 4] == 1) {
						win = 1;
					}
					if (omok[i][j] == 2 && omok[i][j + 1] == 2 && 
                        omok[i][j + 2] == 2 && omok[i][j + 3] == 2
							&& omok[i][j + 4] == 2) {
						win = 2;
					}
				}
			}

			// 세로검사
			for (int i = 0; i < size - 4; i++) {
				for (int j = 0; j < size ; j++) {
					if (omok[i][j] == 1 && omok[i + 1][j] == 1 &&
                        omok[i + 2][j] == 1 && omok[i + 3][j] == 1
							&& omok[i + 4][j] == 1) {
						win = 1;
					}
					if (omok[i][j] == 2 && omok[i + 1][j] == 2 && 
                        omok[i + 2][j] == 1 && omok[i + 3][j] == 1
							&& omok[i + 4][j] == 1) {
						win = 2;
					}
				}
			}

			
			//대각선검사
			for (int i = 0; i < size - 4; i++) {
				for (int j = 0; j < size - 4; j++) {
					if (omok[i][j] == 1 && omok[i + 1][j + 1] == 1 &&
                        omok[i + 2][j + 2] == 1 && omok[i + 3][j + 3] == 1
							&& omok[i + 4][j + 4] == 1) {
						win = 1;
					}
					if (omok[i][j] == 2 && omok[i + 1][j + 1] == 2 &&
                        omok[i + 2][j + 2] == 2 && omok[i + 3][j + 3] == 2
							&& omok[i + 4][j + 4] == 2) {
						win = 2;
					}
				}
			}
			
			for (int i = 9; i > size - 7; i--) {
				for (int j = 0; j < size - 4; j++) {
					if (omok[i][j] == 1 && omok[i - 1][j + 1] == 1 && 
                        omok[i - 2][j + 2] == 1 && omok[i - 3][j + 3] == 1
							&& omok[i - 4][j + 4] == 1) {
						win = 1;
					}
					if (omok[i][j] == 2 && omok[i - 1][j + 1] == 2 && 
                        omok[i - 2][j + 2] == 2 && omok[i - 3][j + 3] == 2
							&& omok[i - 4][j + 4] == 2) {
						win = 2;
					}
				}
			}
		}
 
		

		scan.close();

	}

}
