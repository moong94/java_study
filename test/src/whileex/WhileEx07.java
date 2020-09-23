package whileex;

import java.util.Scanner;
import java.util.Random;

public class WhileEx07 {

	public static void main(String[] args) {
		/*
		 * # Up & Down 게임[2단계]
		 * 1. 정답을 맞추면 게임은 종료된다.
		 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
		 * 3. 게임 종료 후, 점수를 출력한다.
		 */

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int score = 100;
		boolean opt = true;
		int num = ran.nextInt(100) + 1;
		
		System.out.println("0~100까지의 숫자.");
		while(opt) {
			System.out.print("숫자 입력 : ");
			int ans = scan.nextInt();
			if(ans > num) {
				System.out.println("Down");
				score -= 5;
			}
			else if(ans < num) {
				System.out.println("Up");
				score -= 5;
			}
			else if(ans == num) {
				System.out.println("정답! 점수 : " + score);
				opt = false;
			}
			if(score == 0) {
				System.out.println("실패. 남은 점수 0");
				opt = false;
			}
		}
	}

}
