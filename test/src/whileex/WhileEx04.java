package whileex;

import java.util.Random;
import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		/*
		 * # ������ ����[3�ܰ�]
		 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
		 * 2. ������ ���߸� 20���̴�.
		 * 3. ���� ���� ��, ������ ����Ѵ�.
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
			System.out.println("���� �Է� :");
			int ans = scan.nextInt();
			if (tot == ans) {
				score += 20;
			}
			i += 1;
		}
		System.out.println("���� ����.  ���� : " + score);
		
	}

}
