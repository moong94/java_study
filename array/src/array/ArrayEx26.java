package array;

import java.util.Scanner;

public class ArrayEx26 {

	public static void main(String[] args) {
		/*
		 * # 숫자이동[2단계]
		 * 1. 숫자2는 캐릭터이다.
		 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
		 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
		 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
		 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
		 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
		 */

		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		int player = 4;
		
		while(true) {
			for(int i = 0; i < 8; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();
			System.out.println("(1):왼쪽          (2):오른쪽          (3):벽 격파");
			System.out.print("커맨드 입력 : ");
			int command = scan.nextInt();
			
			
			if(command == 1) {
				player--;
				if(player == -1) {
					System.out.println("더 이상 왼쪽으로 갈 수 없습니다.");
					player++;
					continue;
				}
				if(game[player] == 1) {
					System.out.println("벽이 있어 이동할 수 없습니다.");
					player++;
				}
				game[player + 1] = 0;
				game[player] = 2;
				
				
			}
			else if(command == 2) {
				player++;
				if(player == 8) {
					System.out.println("더 이상 오른쪽으로 갈 수 없습니다.");
					player--;
					continue;
				}
				if(game[player] == 1) {
					System.out.println("벽이 있어 이동할 수 없습니다.");
					player--;
				}
				game[player - 1] = 0;
				game[player] = 2;
				
				
			}
			else if(command == 3) {
				if(game[player + 1] == 1) {
					System.out.println("벽을 격파했습니다!");
					game[player + 1] = 0;
				}
				else if(game[player - 1] == 1) {
					System.out.println("벽을 격파했습니다!");
					game[player - 1] = 0;
				}
				else {
					System.out.println("격파할 벽이 없습니다.");
				}
			}
		}
		
	}

}
