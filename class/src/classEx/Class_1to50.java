package classEx;

import java.util.Scanner;
import java.util.Random;

class Ex11{
	final int SIZE = 9;	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];	
	int cnt = 1;
}


public class Class_1to50 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50[3단계] : 1 to 18
		 * 1. 구글에서 1 to 50 이라고 검색한다.
		 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
		 * 4. 숫자 1~9는 front 배열에 저장하고,
		 *    숫자 10~18은 back 배열에 저장한다.
		 */
		
		Ex11 e = new Ex11();
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		
		for(int i = 0; i < e.SIZE; i++) {
			int random = ran.nextInt(9);
			
			if(e.front[random] != 0) {
				i--;
			}
			else {
				e.front[random] = i + 1;
			}
		}
		
		for(int i = 0; i < e.SIZE; i++) {
			int random = ran.nextInt(9);
			
			if(e.back[random] != 0) {
				i--;
			}
			else {
				e.back[random] = i + 10;
			}
		}
		
		while(true) {
			
			for(int i = 0 ; i < e.SIZE; i++) {
				System.out.print(e.front[i] + " ");
			}
			System.out.println();
			
			if(e.cnt == 19) {
				System.out.println("clear");
				break;
			}
			
			System.out.print("입력 : ");
			int input = scan.nextInt();
			if(e.cnt <= 9) {
				if(e.front[input] == e.cnt) {
					e.front[input] = e.back[input];
					e.cnt++;
				}
			}
			else {
				if(e.front[input] == e.cnt) {
					e.front[input] = 0;
					e.cnt++;
				}
			}
			
			
		}
		
		
		
	}

}
