package array;

import java.util.Scanner;
import java.util.Random;

public class Test09_ex {

	public static void main(String[] args) {
		/*
		 * # 즉석복권
		 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
		 */
		//추가 문제) lotto 에 처음부터 값이 있는게 아니라 
		//         랜덤으로 7이나 0 을  넣은후 매번 다른 결과가 나오도록 만들어보세요

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int lotto[] = new int[7];

		for(int i = 0; i < 7;i ++) {
			int rannum = ran.nextInt(2);
			if(rannum == 0) {
				lotto[i] = 0;
			}
			else if(rannum == 1) {
				lotto[i] = 7;
			}
		}
		
		for (int i = 0; i < 7; i++) {
			System.out.print(lotto[i] + " ");
		}
		
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
