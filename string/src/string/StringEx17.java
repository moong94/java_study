package string;

import java.util.Scanner;

public class StringEx17 {

	public static void main(String[] args) {
		/*
		 * # �ܾ� ��ü�ϱ�(replace)
		 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
		 * 2. ��ü���ִ� ����� �����Ѵ�.
		 * ��)
		 * 		Life is too short.
		 * 		�����ϰ� ���� �ܾ��Է� : Life
		 * 		�ٲ� �ܾ��Է� : Time
		 * 
		 * 		Time is too short.
		 */
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		
		String str[] = text.split(" ");
		
		int cnt = 0;
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(word)) {
				System.out.print("�ٲ� �ܾ� �Է� : ");
				String input = scan.nextLine();
				str[i] = input;
			}
			else {
				cnt++;
			}
			if(cnt == str.length) {
				System.out.println("�ش� �ܾ �������� �ʽ��ϴ�.");
			}
		}
		
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		

	}

}
