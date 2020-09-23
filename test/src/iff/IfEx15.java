package iff;

import java.util.Scanner;

public class IfEx15 {

	public static void main(String[] args) {
		/*
		 * # ATM[1단계] : 이체하기
		 * 1. 이체할 계좌번호를 입력받는다.
		 * 2. 계좌번호가 일치하면,
		 * 3. 이체할 금액을 입력받는다.
		 * 4. 이체할 금액 <= myMoney	: 이체가능
		 * 			myMoney   - 이체할 금액
		 * 			yourMoney + 이체할 금액
		 *    이체할 금액  > myMoney 	: 이체불가
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
		System.out.println("이체할 계좌번호 입력 : ");
		int inputAcc = scan.nextInt();

			if(inputAcc == myAcc) {
				System.out.println("이체할 금액 입력 : ");
				int inputMoney = scan.nextInt();
				
				if(inputMoney <= myMoney) {
					System.out.println("이체 가능");
					System.out.println("myMoney - " + inputMoney);
					System.out.println("yourMoney - " + inputMoney);
					System.out.println("myMoney : " + (myMoney - inputMoney));
					System.out.println("yourMoney : " + (yourMoney + inputMoney));
				}
				else {
					System.out.println("이체 불가");
				}
			}
		
		else {
			System.out.println("계좌번호 입력 오류.");
		}

	}

}
