package whileex;

import java.util.Scanner;

public class WhileEx14 {

	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�[2�ܰ�]
		 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
		 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
		 */

		int max = 0;
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(i < 3) {
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			if(max <= num) {
				max = num;
			}
			i++;
		}
		System.out.println("�ִ밪 : " + max);
	}

}
