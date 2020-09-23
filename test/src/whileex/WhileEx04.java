package whileex;

import java.util.Random;
import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		/*
		 * # 구구단 게임[3단계]
		 * 1. 구구단 게임을 5회 반복한다.
		 * 2. 정답을 맞추면 20점이다.
		 * 3. 게임 종료 후, 성적을 출력한다.
		 */

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		
		
		int i = 1;

		while(i <= 5) {
			int num1 = ran.nextInt(9) + 1;
			int num2 = ran.nextInt(9) + 1;
			int tot = num1 * num2;
			System.out.println(num1 + " X " + num2 + " = ?");
			System.out.println("정답 입력 :");
			int ans = scan.nextInt();
			if (tot == ans) {
				score += 20;
			}
			i += 1;
		}
		System.out.println("게임 종료.  성적 : " + score);
		
	}

}
