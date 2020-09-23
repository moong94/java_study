package array;

import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		/*
		 * # 즉석복권
		 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
		 */

		Scanner scan = new Scanner(System.in);
		
		int[] lotto = {0, 0, 7, 7, 7, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 0, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 7, 0, 7, 0};
		
		int cnt = 0;
		
		boolean run = true;
		while(run) {			
			System.out.println("1) 복권 결과확인");	
			System.out.println("2) 종료");						
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				for(int i = 1; i < 6; i++) {
					if(lotto[i-1] + lotto[i] + lotto[i+1] == 21){
						cnt++;
					}
					
				}
				if(cnt > 0) {
					System.out.println("당첨.");
				}
				else {
					System.out.println("미당첨");
				}
		
			}	
			else if(sel == 2){
				run = false;
			}
		}

	}

}
