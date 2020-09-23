package whileex;

import java.util.Scanner;

public class WhileEx06 {

	public static void main(String[] args) {
		/*
		 * # 반복문 종료(-100)
		 * 1. 무한 반복을 하면서 숫자를 입력받는다.
		 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
		 */
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while(num != -100){
			num = scan.nextInt();
		}
		
	}

}
