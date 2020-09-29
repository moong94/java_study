package string;

import java.util.Scanner;

public class StringEx15 {

	public static void main(String[] args) {
		/*
		 * # nextLine()과 next()의 차이
		 * 1. nextLine() : 문장 한라인 전체를 입력받는다. 
		 * 2. next() : 공백을 기준으로 한단어씩 입력받는다.
		 */
		Scanner scan = new Scanner(System.in);
		
		/*
		 * # hello java 입력시,
		 * nextLine() 메서드는 Hello Java 모두 출력되지만,
		 * next() 메서드는 Hello만 출력된다.
		 */
		System.out.print("이름 입력 : ");
		String name = scan.nextLine();	
		System.out.println(name);
		
		System.out.print("이름 입력 : ");
		name = scan.next();	
		System.out.println(name);

	}

}
