package string;

import java.util.Scanner;

public class StringEx11 {

	public static void main(String[] args) {
		/*
		 * # �����ձ� ����
		 * ���þ� : ������
		 * �Է� : �Ź�
		 * ���þ� : �Ź�
		 * �Է� : �̼�
		 * ...
		 */

		String start = "������";
		System.out.println("���þ� : " + start);
		
		Scanner scan = new Scanner(System.in);
		
		char ch = start.charAt(2);
		
		while(true) {
			System.out.print("�Է� : ");
			String input = scan.next();
			
			if(input.charAt(0) != ch) {
				System.out.println("lose");
				break;
			}
			else {
				ch = input.charAt(input.length() - 1);
			}
		}

	}

}
