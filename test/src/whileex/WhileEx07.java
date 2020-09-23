package whileex;

import java.util.Scanner;
import java.util.Random;

public class WhileEx07 {

	public static void main(String[] args) {
		/*
		 * # Up & Down ����[2�ܰ�]
		 * 1. ������ ���߸� ������ ����ȴ�.
		 * 2. 100������ ������ ������ �Է��� ������ 5���� �����ȴ�.
		 * 3. ���� ���� ��, ������ ����Ѵ�.
		 */

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int score = 100;
		boolean opt = true;
		int num = ran.nextInt(100) + 1;
		
		System.out.println("0~100������ ����.");
		while(opt) {
			System.out.print("���� �Է� : ");
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
				System.out.println("����! ���� : " + score);
				opt = false;
			}
			if(score == 0) {
				System.out.println("����. ���� ���� 0");
				opt = false;
			}
		}
	}

}
