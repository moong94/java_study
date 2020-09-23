package array;

import java.util.Scanner;

public class ArrayEx29 {

	public static void main(String[] args) {
		/*
		 * # ���� �߱� ����
		 * 1. me�� 1~9 ������ ���� 3���� ����
		 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
		 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
		 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
		 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
		 * ��)
		 * ���� : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */

		Scanner scan = new Scanner(System.in);
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];

		
		while(true) {
			
			//player���� �Է�
			for(int i = 0; i < 3; i++) {
				System.out.print((i+1) + " ��° ���� �Է� : ");
				int player = scan.nextInt();
			
				if(player < 1 || player > 9) {
					System.out.println("1~9������ ���ڸ� �Է����ּ���.");
					i--;
					continue;
				}
			
				me[i] = player;
				for(int j = 0; j < i; j++) {
					if(me[i] == me[j]) {
						System.out.println("�ߺ��� ���� �Դϴ�.");
						me[i] = 0;
						i--;
					}
				}
			}
		
			//com�� me�� ��
			int cnt = 0;
			int strike = 0;
			int ball = 0;
			
			for(int i = 0; i < 3; i++) {
				if(me[i] == com[i]) {
					cnt++;
				}
			}
		
			if(cnt == 3) {
				System.out.println("����!");
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
