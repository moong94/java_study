package random;

import java.util.Scanner;
import java.util.Random;

public class RandomEx05 {

	public static void main(String[] args) {
		/*
		 * # ������ ����[2�ܰ�]
		 * 1. ������ ������ �����ϱ� ����, ���� 2���� �����ϰ� �����Ѵ�.
		 * 2. ����� ���ڸ� ���� ������ ������ ����Ѵ�.
		 * ��)	3 x 7 = ?
		 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
		 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = ran.nextInt(9) + 1;
		int num2 = ran.nextInt(9) + 1;
		
		System.out.println(num1 + "X" + num2 + "= ?");

		System.out.println("���� �Է� : ");
		
		int ans = scan.nextInt();
		
		int result = num1 * num2;
		
		if(result == ans) {
			System.out.println("����");
		}
		if(result != ans) {
			System.out.println("��");
		}
		
		
		
		
	}

}
