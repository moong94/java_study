package string;

import java.util.Scanner;

public class StringEx11 {

	public static void main(String[] args) {
		/*
		 * # 끝말잇기 게임
		 * 제시어 : 자전거
		 * 입력 : 거미
		 * 제시어 : 거미
		 * 입력 : 미술
		 * ...
		 */

		String start = "자전거";
		System.out.println("제시어 : " + start);
		
		Scanner scan = new Scanner(System.in);
		
		char ch = start.charAt(2);
		
		while(true) {
			System.out.print("입력 : ");
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
