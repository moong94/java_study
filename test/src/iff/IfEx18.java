package iff;

import java.util.Scanner;

public class IfEx18 {

	public static void main(String[] args) {
		/*
		 * # 지하철 요금 계산
		 * 1. 이용할 정거장 수를 입력받는다.
		 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
		 * 3. 요금표
		 * 1) 1~5	: 500원
		 * 2) 6~10	: 600원
		 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)
		 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
		 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
		 * ... 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이용할 정거장 수 입력 : ");
		int num = scan.nextInt();
		
		int defcharge = 500;
		
		if(num >= 1 && num <= 5) {
			System.out.println(defcharge + "원");
		}
		else if(num <= 10) {
			System.out.println((defcharge+100) + "원");	
		}
		else {
			int extra = (num - 11) / 2 + 1;
			System.out.println((defcharge + 100 + (50 * extra)) + "원");
		}
		
	}

}
