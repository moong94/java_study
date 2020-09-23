package array;

import java.util.Scanner;

public class ArrayEx14 {

	public static void main(String[] args) {
		/*
		 * # 숫자이동[1단계]
		 * 1. 숫자2는 캐릭터이다.
		 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
		 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
		 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
		 */

		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;
		
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player = i;
			}
			System.out.print(game[i] + " ");
		}
		System.out.println();
		
		boolean opt = true;
		
		while(opt) {
			System.out.println("숫자 1 입력시 왼 쪽으로, 숫자 2 입력시 오른 쪽으로 이동.");
			int sel = scan.nextInt();
			
			
			if(sel == 1) {
				if(player == 0) {
					System.out.println("왼 쪽에 벽이 있어 움직일 수 없습니다.");
					continue;
				}
				else {
					game[player] = 0;
					player -= 1;
					game[player] = 2;
				}
			}
			else if (sel == 2) {
				if(player == 6) {
					System.out.println("오른 쪽에 벽이 있어 움직일 수 없습니다.");
					continue;
				}

				game[player] = 0;
				player += 1;
				game[player] = 2;
			}
			
			else {
				System.out.println("숫자를 정확히 입력하세요.");
				continue;
			}
			
			
			
			for(int i = 0; i < 7; i++) {
				System.out.print(game[i] + " ");
			}
			
		}

	}

}
