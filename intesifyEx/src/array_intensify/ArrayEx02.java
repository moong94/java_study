package array_intensify;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 옷이 이동숫자를 입력받을때마다 이동 하는데 
				// 외각으로만 이동 아래그림참조 
				
				/*
				 * # 나만의 마블
				 * 옷 □ □ □ □ 
				 * □ ■ ■ ■ □ 
				 * □ ■ ■ ■ □ 
				 * □ ■ ■ ■ □ 
				 * □ □ □ □ □
				 */
				 //입력 ==> 3 
				
				/*
				 * # 나만의 마블
				 * □ □ □ 옷 □ 
				 * □ ■ ■ ■ □ 
				 * □ ■ ■ ■ □ 
				 * □ ■ ■ ■ □ 
				 * □ □ □ □ □
				 */
				 //입력 ==> 3 
				
				/*
				 * # 나만의 마블
				 * □ □ □ □ □ 
				 * □ ■ ■ ■ □ 
				 * □ ■ ■ ■ 옷 
				 * □ ■ ■ ■ □ 
				 * □ □ □ □ □
				 */
		Scanner scan = new Scanner(System.in);
			
//			00 01 02 03 04 14 24 34 44 43 42 41 40 30 20 10 00 
			
		int [][] marble = new int[5][5];
		
		//벽
		for(int i = 1; i < 4; i++) { 
			for(int j = 1; j < 4; j++) {
				marble[i][j] = 2;
			}
		}
		int x = 0;
		int y = 0;
		System.out.println("나만의 마블");
		System.out.println("옷 □ □ □ □");
		System.out.println("□ ■ ■ ■ □");
		System.out.println("□ ■ ■ ■ □");
		System.out.println("□ ■ ■ ■ □");
		System.out.println("□ □ □ □ □");
		
			
		while(true) {
			marble[y][x] = 0;
		System.out.print("숫자 입력 : ");
		int input = scan.nextInt();
			
		for(int i = 0; i < input; i++) {
			if(x < 4 && y == 0) {
				x++;
			}
			else if(x == 4 && y < 4) {
				y++;
			}
			else if(x > 0 && y == 4) {
				x--;
			}
			else if(x == 0 &&  y > 0) {
				y--;
			}
		}
		marble[y][x] = 1;
		
		for(int i = 0 ; i < marble.length; i++) {
			for(int j = 0; j < marble[i].length; j++) {
				if(marble[i][j] == 1) {
					System.out.print("옷 ");
				}
				else if(marble[i][j] == 2) {
					System.out.print("■ ");
				}
				else {
					System.out.print("□ ");
				}
			}
			System.out.println();
		}
		
		}
	}

}
