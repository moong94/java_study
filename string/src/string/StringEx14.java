package string;

import java.util.Scanner;

public class StringEx14 {

	public static void main(String[] args) {
		/*
		 * # 문자열 속 숫자검사
		 * 예) adklajsiod
		 * 	     문자만 있다.
		 * 예) 123123
		 *    숫자만 있다.
		 * 예) dasd12312asd
		 *    문자와 숫자가 섞여있다.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
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
			System.out.println("숫자만 있다.");
		}
		else if(cnt_c == text.length()) {
			System.out.println("문자만 있다.");
		}
		else {
			System.out.println("문자와 숫자가 섞여있다.");
		}

	}

}
