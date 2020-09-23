package array;

import java.util.Scanner;

public class ArrayEx29 {

	public static void main(String[] args) {
		/*
		 * # 숫자 야구 게임
		 * 1. me에 1~9 사이의 숫자 3개를 저장
		 *    (단, 중복되는 숫자는 저장 불가)
		 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
		 * 3. 숫자와 자리가 같으면 		strike += 1
		 *    숫자만 같고 자리가 틀리면 	ball += 1
		 * 예)
		 * 정답 : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */

		Scanner scan = new Scanner(System.in);
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];

		
		while(true) {
			
			//player숫자 입력
			for(int i = 0; i < 3; i++) {
				System.out.print((i+1) + " 번째 숫자 입력 : ");
				int player = scan.nextInt();
			
				if(player < 1 || player > 9) {
					System.out.println("1~9까지의 숫자만 입력해주세요.");
					i--;
					continue;
				}
			
				me[i] = player;
				for(int j = 0; j < i; j++) {
					if(me[i] == me[j]) {
						System.out.println("중복된 숫자 입니다.");
						me[i] = 0;
						i--;
					}
				}
			}
		
			//com과 me를 비교
			int cnt = 0;
			int strike = 0;
			int ball = 0;
			
			for(int i = 0; i < 3; i++) {
				if(me[i] == com[i]) {
					cnt++;
				}
			}
		
			if(cnt == 3) {
				System.out.println("정답!");
				break;
			}
		
			//strike & ball;
			for(int i = 0; i < 3; i++) {
				if(me[i] == com[i]) {
					strike++;
					continue;
				}
				for(int j = 0; j <= i; j++) {
					if(me[i] == com [j] && me[j] == com[i]) {
						ball += 2;
						continue;
					}
					if(me[i] == com [j] || me[j] == com[i]) {
						ball++;
						continue;
					}
				}
			}
			for(int i = 0; i < 3; i++) {
				System.out.print(me[i] + " ");
			}
			System.out.print("      : ");
			
			if(strike > 0 && ball > 0) {
				System.out.println(strike + "S " + ball + "B");
			}
			else if(strike == 0 && ball == 0) {
				System.out.println("X");
			}
			else if(strike == 0) {
				System.out.println(ball + "B");				
			}
			else if(ball == 0) {
				System.out.println(strike + "S");
			}	
		
		}
	}

}
