package classEx;

import java.util.Scanner;

class Ex09{
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// 정답을 맞춘 횟수
}

public class Class_기억력게임 {

	public static void main(String[] args) {
		/*
		 * # 기억력 게임 : 클래스 + 변수
		 * 1. front 배열 카드 10장을 섞는다.
		 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
		 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
		 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
		 */
		
		Ex09 e = new Ex09();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			for(int i = 0; i < e.back.length; i++) {
				System.out.print(e.back[i] + " ");
			}
			System.out.println();
			
			if(e.cnt == 5) {
				System.out.println("clear");
				break;
			}
			
			System.out.print("첫 번째 위치 입력 : ");
			int input1 = scan.nextInt();
			
			if(e.back[input1] != 0) {
				System.out.println("이미 확인 된 카드");
				continue;
			}
			
			if(input1 < 0 || input1 >= e.back.length) {
				System.out.println("입력 오류");
				continue;
			}
			
			System.out.print("두 번째 위치 입력 : ");
			int input2 = scan.nextInt();
			
			if(e.back[input2] != 0) {
				System.out.println("이미 확인 된 카드");
				continue;
			}
			
			if(input1 == input2 || input2 < 0 || input2 >= e.back.length) {
				System.out.println("입력 오류");
				continue;
			}
			
			if(e.front[input1] == e.front[input2]) {
				e.back[input1] = e.front[input1];
				e.back[input2] = e.front[input2];
				e.cnt++;
			}
			
			else {
				continue;
			}
			
		}
	}

}
