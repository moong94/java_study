package whileex;

import java.util.Random;

public class WhileEx15 {

	public static void main(String[] args) {
		/*
		 * # �����л�
		 * 1. 10ȸ �ݺ��� �Ѵ�.
		 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
		 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
		 * ---------------------------------------
		 * . ������(10��)�� ������ ����� ����Ѵ�.
		 * . �հ��� ���� ����Ѵ�.
		 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
		 */

		Random ran = new Random();
		
		int i = 0;
		int isave = 0;
		int sum = 0;
		int max = 0;
		int passed = 0;
		
		while(i < 10) {
			
			int num = ran.nextInt(100) + 1;
			
			if(num >= 60) {
				passed++;
			}
			if(max <= num) {
				max = num;
				isave = i + 1;
				
			}
			System.out.println((i+1) + "��° �л� ���� : " + num);
			sum += num;
			i++;
		}
		System.out.println("������ ���� : " + sum);
		System.out.println("������ ��� : " + (sum / 10));
		System.out.println("1�� �л� ��ȣ : " + isave);
		System.out.println("1�� �л� ���� : " + max);
		System.out.println("�հ��� �� : " + passed);
		
	}

}
