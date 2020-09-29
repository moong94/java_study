package array;

import java.util.Scanner;
import java.util.Random;

public class Bingo_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		int size = 50;
		
		int[][] me  = new int[maxNum][maxNum];
		int[][] you = new int[maxNum][maxNum];
		
		int[][] meMark  = new int[maxNum][maxNum];
		int[][] youMark = new int[maxNum][maxNum];

		int[] temp = new int[maxNum*maxNum];
		
		int win = 0;
		int turn = 0;
		int p1X = 0;	int p1Y = 0;
		int p2X = 0;	int p2Y = 0;
		
		// me 셋팅
		for(int i=0; i<temp.length; i++) {
			temp[i] = ran.nextInt(size) + 1;
			for(int j=0; j<i; j++) {
				if(temp[i] == temp[j]) {
					i--;
				}
			}
		}
		int k = 0;
		for(int i=0; i<maxNum; i++) {
			for(int j=0; j<maxNum; j++) {
				me[i][j] = temp[k];
				k++;
			}
		}
		
		// you 셋팅
		for(int i=0; i<temp.length; i++) {
			temp[i] = ran.nextInt(size) + 1;
			for(int j=0; j<i; j++) {
				if(temp[i] == temp[j]) {
					i--;
				}
			}
		}
		k = 0;
		for(int i=0; i<maxNum; i++) {
			for(int j=0; j<maxNum; j++) {
				you[i][j] = temp[k];
				k++;
			}
		}
		
		while(true) {
			
			System.out.println("========= BINGO GAME[Me] =========");
			for(int i=0; i<maxNum; i++) {
				for(int j=0; j<maxNum; j++) {
					if(meMark[i][j] == 0) {
						System.out.print(me[i][j] + "\t");
					}
					else if(meMark[i][j] == 1) {
						System.out.print("O\t");
					}
				}
				System.out.println();
			}
			
			System.out.println();
			
			System.out.println("========= BINGO GAME[You] =========");
			k = 0;
			for(int i=0; i<maxNum; i++) {
				for(int j=0; j<maxNum; j++) {
					if(youMark[i][j] == 0) {
						System.out.print(you[i][j] + "\t");
					}
					else if(youMark[i][j] == 1) {
						System.out.print("X\t");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			if(win == 1) {
				System.out.println("Me 승리!");
				break;
			}else if(win == 2) {
				System.out.println("You 승리!");
				break;
			}
			
			if(turn % 2 == 0) {
				System.out.print("[Me]y좌표 입력 : ");
				p1Y = scan.nextInt();
				System.out.print("[Me]X좌표 입력 : ");
				p1X = scan.nextInt();
				if(meMark[p1Y][p1X] == 0) {
					meMark[p1Y][p1X] = 1;
					turn += 1;
					
					for(int i=0; i<maxNum; i++) {
						for(int j=0; j<maxNum; j++) {
							if(me[p1Y][p1X] == you[i][j]) {
								if(youMark[i][j] == 0) {
									youMark[i][j] = 1;
								}
							}
						}
					}
				}
				
				
			}
			else if(turn % 2 == 1) {
				System.out.print("[You]y좌표 입력 : ");
				p2Y = scan.nextInt();
				System.out.print("[You]X좌표 입력 : ");
				p2X = scan.nextInt();
				if(youMark[p2Y][p2X] == 0) {
					youMark[p2Y][p2X] = 1;
					turn += 1;
					
					for(int i=0; i<maxNum; i++) {
						for(int j=0; j<maxNum; j++) {
							if(you[p2Y][p2X] == me[i][j]) {
								if(meMark[i][j] == 0) {
									meMark[i][j] = 1;
								}
							}
						}
					}					
				}
			}
			
			// 승패결정
			// 가로 체크
			for(int i=0; i<maxNum; i++) {
				int cnt = 0;
				for(int j=0; j<maxNum; j++) {
					if(meMark[i][j] == 1) {
						cnt++;
					}
				}
				if(cnt == 5) {
					win = 1;
					break;
				}
			}
			for(int i=0; i<maxNum; i++) {
				int cnt = 0;
				for(int j=0; j<maxNum; j++) {
					if(youMark[i][j] == 1) {
						cnt++;
					}
				}
				if(cnt == 5) {
					win = 2;
					break;
				}
			}	
			
			// 세로 체크
			for(int j=0; j<maxNum; j++) {
				int cnt = 0;
				for(int i=0; i<maxNum; i++) {
					if(meMark[i][j] == 1) {
						cnt ++;
					}
				}
				if(cnt == 5) {
					win = 1;
					break;
				}
			}
			for(int j=0; j<maxNum; j++) {
				int cnt = 0;
				for(int i=0; i<maxNum; i++) {
					if(youMark[i][j] == 1) {
						cnt ++;
					}
				}
				if(cnt == 5) {
					win = 2;
					break;
				}
			}
			
			// 대각선 체크
			int cnt = 0;
			for(int i=0; i<maxNum; i++) {
				if(meMark[i][i] == 1) {
					cnt++;
				}
				if(cnt == 5) {
					win = 1;
					break;
				}
			}
			cnt = 0;
			for(int i=0; i<maxNum; i++) {
				if(youMark[i][i] == 1) {
					cnt++;
				}
				if(cnt == 5) {
					win = 2;
					break;
				}
			}
			
			// 대각선 체크
			cnt = 0;
			for(int i=0; i<maxNum; i++) {
				if(meMark[i][(maxNum-1)-i] == 1) {
					cnt++;
				}
				if(cnt == 5) {
					win = 1;
					break;
				}
			}
			cnt = 0;
			for(int i=0; i<maxNum; i++) {
				if(youMark[i][(maxNum-1)-i] == 1) {
					cnt++;
				}
				if(cnt == 5) {
					win = 2;
					break;
				}
			}
		}
	}

}
