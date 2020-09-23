package whileex;

import java.util.Scanner;

public class WhileEx20 {

	public static void main(String[] args) {
		/*
		 * # 보조제어문
		 * 1. break
		 * . 반복문 1개를 즉시 종료
		 * 2. continue
		 * . 반복문의 조건식으로 바로 이동
		 * . 아래식을 실행시키고 싶지 않을 때 사용
		 */

		// break
		for(int i=0; i<15; i++) {
			if(i > 3) {
				break;
			}
			System.out.println(i);
		}
				
		// continue
		Scanner scan = new Scanner(System.in);
				
		boolean run = true;
		while(run) {
			System.out.println("1.햄버거");
			System.out.println("2.콜라");
			System.out.println("3.감자");
					
			int sel = scan.nextInt();
					
			if(sel != 1 && sel != 2 && sel != 3) {
				continue;
			}
					
			if(sel == 1) {}
			else if(sel == 2) {}
			else if(sel == 3) {}
		}

			
	}

}
