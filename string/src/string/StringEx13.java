package string;

import java.util.Scanner;

public class StringEx13 {

	public static void main(String[] args) {
		/*
		 * # 문자열 비교
		 * . equals() 메서드 사용없이 문자의 일치여부 비교
		 * 예)
		 * 코끼리
		 * 입력 = 티라노사우루스
		 * 출력 = false
		 */
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		while(true) {
			System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
			String myName = scan.next();

			int cnt = 0;
			
			if(name.length() != myName.length()) {
				System.out.println("false");
				break;
			}
			else {
				for(int i = 0; i < name.length(); i++) {
					char ch = name.charAt(i);
					char mych = myName.charAt(i);
					
					if(ch == mych) {
						cnt++;
					}
				}
				
			}
			if(cnt == name.length()) {
				System.out.println("true");
				break;
			}
		}
		

	}

}
