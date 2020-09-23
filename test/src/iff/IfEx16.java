package iff;

import java.util.Random;
import java.util.Scanner;

public class IfEx16 {

	public static void main(String[] args) {
		/*
		 * # 가운데 숫자 맞추기 게임
		 * 1. 150~250 사이의 랜덤 숫자 저장
		 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
		 * 예)
		 * 		249		: 4
		 */
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = ran.nextInt(101) + 150;
		
		int num2 = num / 10;
		int ans = num2 % 10;
		
		System.out.println("입력 :");
		int myans = scan.nextInt();
		if (ans != myans) {
			System.out.println("오답. 다시 입력 :");
			myans = scan.nextInt();
		}
		else {
			System.out.println(num + "    :    " + myans);
		}
		
	}

}
