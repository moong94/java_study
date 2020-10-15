package classEx;

import java.util.Scanner;

class Ex14{
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,0,0,0,0},
			{0,0,1,1,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	String[] menu = {"죠스떡볶이", "CU편의점", "마라탕", "김밥천국", "명인만두"};
}

public class Class_사다리 {

	public static void main(String[] args) {
		/*
		 * # 사다리 게임
		 * 1. 0을 만나면 아래로 내려간다.
		 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
		 * 3. x의 위치를 입력받고 사다리를 표현한다.

		 */
		
		Ex14 e = new Ex14();		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("12345");
		for(int i = 0 ; i < e.ladder.length; i++) {
			for(int j = 0; j < e.ladder[i].length; j++) {
				if(e.ladder[i][j] == 0) {
					System.out.print("│");
				}
				else if(j == 0 && e.ladder[i][j] == 1) {
					System.out.print("├");
				}
				else if(j == e.ladder[i].length -1 && e.ladder[i][j] == 1) {
					System.out.print("┤");
				}
				else if(e.ladder[i][j] == 1 && e.ladder[i][j + 1] == 1) {
					System.out.print("├");
				
				}
				else if(e.ladder[i][j] == 1 && e.ladder[i][j - 1] == 1) {
					System.out.print("┤");
				
				}
				
				
				
			}
			System.out.println();
		}
		
		System.out.println("㉠㉡㉢㉣㉤");
		System.out.println("㉠죠스떡볶이 ㉡CU편의점 ㉢마라탕 ㉣김밥천국 ㉤명인만두");		
		
		System.out.print("번호 선택 : ");
		int input = scan.nextInt();
	
		e.x = input - 1;
		
		while(true) {
			
			if(e.y == e.ladder.length) {
				System.out.println(e.menu[e.x]);
				break;
			}
		
			if(e.ladder[e.y][e.x] == 0) {
				e.y++;
			}
			else if(e.x == 0 && e.ladder[e.y][e.x] == 1) {
				e.x++;
				e.y++;
			}
			else if(e.x == e.ladder[e.x].length -1 && e.ladder[e.y][e.x] == 1) {
				e.x--;
				e.y++;
				
			}
			else if(e.ladder[e.y][e.x] == 1 && e.ladder[e.y][e.x + 1] == 1) {
				e.x++;
				e.y++;
			}
			else if(e.ladder[e.y][e.x] == 1 && e.ladder[e.y][e.x - 1] == 1) {
				e.x--;
				e.y++;
			}
		}
	}

}
