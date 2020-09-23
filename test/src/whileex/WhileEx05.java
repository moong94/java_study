package whileex;

import java.util.Scanner;

public class WhileEx05 {

	public static void main(String[] args) {
		/*
		 * # ������ ���[2�ܰ�]
		 * 1. 5�� �ֹ��� �޴´�.
		 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
		 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
		 * 
		 * ��)
		 * �޴� ���� : 1
		 * �޴� ���� : 1
		 * �޴� ���� : 2
		 * �޴� ���� : 2
		 * �޴� ���� : 3
		 * �� �ݾ� = 31300��
		 * ���� �Է� : 32000
		 * === �Ե����� ������ ===
		 * 1. �Ұ�� ���� : 2��
		 * 2. ����    ���� : 2��
		 * 3. ��         �� : 1��
		 * 4. ��   ��   �� : 31300��
		 * 5. ��         �� : 700��
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		int i = 1;
		int sum = 0;
		int choice1 = 0 , choice2 = 0, choice3 = 0;
		
		while(i <= 5) {
			System.out.print("�޴� ���� : ");
			int num = scan.nextInt();
			if(num == 1) {
				sum += price1;
				choice1 += 1;
			}
			else if(num == 2) {
				sum += price2;
				choice2 += 1;
			}
			else if(num == 3) {
				sum += price3;
				choice3 += 1;
			}
			i += 1;
		}
		System.out.println("�� �ݾ� : " + sum + "��");
		
		System.out.print("���� �Է� : ");
		int pay = scan.nextInt();
		if(pay < sum) {
			while(pay <= sum) {
				System.out.println("������ �����մϴ�. �ٽ� �Է����ּ���.");
				pay = scan.nextInt();
			}
		}
		System.out.println("=== �Ե����� ������ ===");
		System.out.println("1.�Ұ�� ���� : " + choice1 + "��");
		System.out.println("2.����    ���� : " + choice2 + "��");
		System.out.println("3.��          �� : " + choice3 + "��");
		System.out.println("4.��    ��   �� : " + sum + "��");
		System.out.println("5.��          �� : " + (pay - sum) + "��");
		
	}

}
