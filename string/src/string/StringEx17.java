package string;

import java.util.Scanner;

public class StringEx17 {

	public static void main(String[] args) {
		/*
		 * # 단어 교체하기(replace)
		 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
		 * 2. 교체해주는 기능을 구현한다.
		 * 예)
		 * 		Life is too short.
		 * 		변경하고 싶은 단어입력 : Life
		 * 		바꿀 단어입력 : Time
		 * 
		 * 		Time is too short.
		 */
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		String str[] = text.split(" ");
		
		int cnt = 0;
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(word)) {
				System.out.print("바꿀 단어 입력 : ");
				String input = scan.nextLine();
				str[i] = input;
			}
			else {
				cnt++;
			}
			if(cnt == str.length) {
				System.out.println("해당 단어가 존재하지 않습니다.");
			}
		}
		
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		

	}

}
