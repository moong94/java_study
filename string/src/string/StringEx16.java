package string;

import java.util.Scanner;

public class StringEx16 {

	public static void main(String[] args) {
		/*
		 * # �ܾ� �˻�
		 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
		 * 2. �ܾ �����ϸ� true
		 *    �ܾ ������ false�� ����Ѵ�.
		 */

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = scan.next();
		
		String str[] = text.split(" ");

		int check = -1;
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(word)) {
				System.out.println("true");
				check = 1;
				break;
			}
		}
		
		if(check == -1) {
			System.out.println("false");
		}
	}

}
