package classEx;

import java.util.Scanner;

class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	int player = -1;
}

public class Class_숫자이동 {

	public static void main(String[] args) {
		/*
		 * # 숫자이동[3단계] : 클래스 + 변수
		 * 1. 숫자2는 캐릭터이다.
		 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
		 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
		 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
		 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
		 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
		 * 예) 
		 *  0 0 0 0 0 0 0 2 
		 *  왼쪽(1) 오른쪽(2) : 2
		 *  
		 *  2 0 0 0 0 0 0 0 
		 */
		
		Ex08 e = new Ex08();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			for(int i = 0 ; i < e.game.length; i++) {
				System.out.print(e.game[i] + " ");
				if(e.game[i] == 2) {
					e.player = i;
				}
			}
			System.out.println();
			
			System.out.print("왼쪽(1) 오른쪽(2) 격파(3) : ");
			int input = scan.nextInt();
			
			if(input == 1) {
				if(e.player != 0) {
					if(e.game[e.player - 1] == 1) {
						System.out.println("벽이 있어 움직이지 못 합니다.");
						continue;
					}
				}
				if(e.player == 0) {
					e.game[e.player] = 0;
					e.player = e.game.length - 1;
					e.game[e.player] = 2;
				}
				else {
					e.game[e.player] = 0;
					e.player--;
					e.game[e.player] = 2;
				}
				
			}
			
			else if(input == 2) {
				if(e.player != e.game.length - 1) {
					if(e.game[e.player + 1] == 1) {
						System.out.println("벽이 있어 움직이지 못 합니다.");
						continue;
					}
				}
				if(e.player == e.game.length - 1) {
					e.game[e.player] = 0;
					e.player = 0;
					e.game[e.player] = 2;
				}
				else {
					e.game[e.player] = 0;
					e.player++;
					e.game[e.player] = 2;
				}
				
			}
			
			else if(input == 3) {
				if(e.player == 0) {
					if(e.game[e.player + 1] == 1) {
						e.game[e.player + 1] = 0;
					}
				}
				else if(e.player == e.game.length - 1) {
					if(e.game[e.player - 1] == 1) {
						e.game[e.player - 1] = 0;
					}
				}
				else {
					if(e.game[e.player - 1] == 1 || e.game[e.player + 1] == 1) {
						e.game[e.player - 1] = 0;
						e.game[e.player + 1] = 0;
					}
					
				}
				
			}
		
		}
		
	}

}
