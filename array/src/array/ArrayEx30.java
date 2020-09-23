package array;

import java.util.Scanner;
import java.util.Random;

public class ArrayEx30 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50[3단계] : 1 to 18
		 * 1. 구글에서 1 to 50 이라고 검색한다.
		 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
		 * 4. 숫자 1~9는 front 배열에 저장하고,
		 *    숫자 10~18은 back 배열에 저장한다.
		 */
		
		final int SIZE = 9;
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];
		
		//차례로 배열선언
		for(int i = 0; i < 9; i++) {
			front[i] = i + 1;
			back[i] = i + 10;
		}
		//셔플
		
		for(int i = 0; i < 1000; i++) {
			int suffle1 = ran.nextInt(SIZE);
			int suffle2 = ran.nextInt(SIZE);
			int temp[] = new int[SIZE];
			
			temp[0] = front[suffle1];
			front[suffle1] = front[0];
			front[0] = temp[0];

			temp[0] = back[suffle2];
			back[suffle2] = back[0];
			back[0] = temp[0];
		}
		
		//카운트를 세며 해당 카운트에 해당 숫자가 존재하면 패스
		int cnt = 1;
		
		//게임실행
		while(true) {
			for(int i = 0; i < SIZE; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			for(int i = 0; i < SIZE; i++) {
				System.out.print(front[i] + "\t");
			}
			System.out.println();
			
			//back배열의 인수들을 front배열로 옮겨준다.
			//back배열의 인수들은 옮겨지고난 후 0으로 바뀌고
			//back배열의 모든 인수들이 front로 옮겨졌을 경우 back에는 0만 남게 된다.
			while(cnt < 19) {
				System.out.print("위치 입력 : ");
				int input = scan.nextInt();
				
				if(front[input] == cnt) {
					cnt++;
					front[input] = back[input];
					back[input] = 0;
					break;
				}
			}
			
			if(cnt == 19) {
				System.out.println("CLEAR!");
				break;
			}
		}
		
	}

}
