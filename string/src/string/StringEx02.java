package string;

import java.util.Scanner;

public class StringEx02 {

	public static void main(String[] args) {
		/*
		 * # 문자열 [비교]
		 * . 문자열 비교는 equals() 메서드를 통해 확인할 수 있다.
		 */
		Scanner scan = new Scanner(System.in);
		
		String name = "홍길동";

		System.out.print("이름을 입력하세요 : ");
		String myName = scan.next();
		
		if(name == myName) {
			System.out.println("== 연산자 : 일치");
		}else {
			System.out.println("== 연산자 : 불일치");
		}
		
		if(name.equals(myName)) {
			System.out.println("equals() 메서드 : 일치");
		}else {
			System.out.println("equals() 메서드 : 불일치");
		}

	}

}
