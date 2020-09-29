package string;

import java.util.Scanner;

public class StringEx14 {

	public static void main(String[] args) {
		/*
		 * # ���ڿ� �� ���ڰ˻�
		 * ��) adklajsiod
		 * 	     ���ڸ� �ִ�.
		 * ��) 123123
		 *    ���ڸ� �ִ�.
		 * ��) dasd12312asd
		 *    ���ڿ� ���ڰ� �����ִ�.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = scan.next();
		
		int cnt_i = 0;
		int cnt_c = 0;
		
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if(ch >= '0' && ch <= '9') {
				cnt_i++;
			}
			else {
				cnt_c++;
			}
		}
		
		if(cnt_i == text.length()) {
			System.out.println("���ڸ� �ִ�.");
		}
		else if(cnt_c == text.length()) {
			System.out.println("���ڸ� �ִ�.");
		}
		else {
			System.out.println("���ڿ� ���ڰ� �����ִ�.");
		}

	}

}
