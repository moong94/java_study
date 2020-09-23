package whileex;

import java.util.Scanner;

public class WhileEx23 {

	public static void main(String[] args) {
		/*
		 * # 소수찾기[2단계]
		 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
		 * 예)
		 * 입력 : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int inputnum = scan.nextInt();
		
		
		for(int i = 2; i <= inputnum; i++) {
			int cnt = 0;
			
			for(int j = 2; j <= i; j++) {
				if((i % j) == 0) {
					cnt++;
				}
			} 
			if(cnt == 1) {
				System.out.print(i + ", ");
				
			}
		}
		
	}

}
