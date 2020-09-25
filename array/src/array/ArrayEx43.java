package array;

import java.util.Scanner;

public class ArrayEx43 {

	public static void main(String[] args) {
		/*
		 * # 사다리 게임
		 * 1. 0을 만나면 아래로 내려간다.
		 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
		 * 3. x의 위치를 입력받고 사다리를 표현한다.
		 * 		x = 0	x = 4
		 * 		x = 1	x = 2
		 * 		x = 2	x = 1
		 * 		x = 3	x = 3
		 * 		x = 4	x = 0
		 */
		
		
		int ladder[][]= {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}};
		
		//사다리그리기
		for(int i = 0; i < ladder.length; i++) {
			for(int j = 0; j < ladder[i].length; j++) {
				if(ladder[i][j] == 0) {
					System.out.print("│");
				}
				else if(ladder[i][j] == 1) {
					if(j == 0) {
						System.out.print("├");
					}
					else if(j == ladder[i].length) {
						System.out.print("┤");
					}
					else if(ladder[i][j - 1] == 1) {
						System.out.print("┤");
					}
					else if(ladder[i][j + 1] == 1) {
						System.out.print("├");
					}
				}
			}
			System.out.println();
		}
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x 입력 : ");
		int input = scan.nextInt();
		
		for(int i = 0; i < ladder.length; i++) {
			for(int j = 0; j < ladder[i].length; j++) {
				if(ladder[i][input] == 0) {
					break;
				}
				else if(ladder[i][input] == 1) {
					
					//왼쪽 끝에 있을 때
					if(input == 0) {
						input++;
					}
					//오른쪽 끝에 있을 때
					else if(input == ladder[i].length) {
						input--;
					}
					
					//좌우 비교해서 1이 있는 곳으로 이동 
					else if(ladder[i][input - 1] == 1) {
						input--;
					}
					else if(ladder[i][input + 1] == 1) {
						input++;
					}
					
				}
			}
		}
		
		System.out.println("도착지 : " + input);
		
	}

}
