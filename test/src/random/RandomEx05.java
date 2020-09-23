package random;

import java.util.Scanner;
import java.util.Random;

public class RandomEx05 {

	public static void main(String[] args) {
		/*
		 * # 구구단 게임[2단계]
		 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 랜덤하게 저장한다.
		 * 2. 저장된 숫자를 토대로 구구단 문제를 출력한다.
		 * 예)	3 x 7 = ?
		 * 3. 문제에 해당하는 정답을 입력받는다.
		 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = ran.nextInt(9) + 1;
		int num2 = ran.nextInt(9) + 1;
		
		System.out.println(num1 + "X" + num2 + "= ?");

		System.out.println("정답 입력 : ");
		
		int ans = scan.nextInt();
		
		int result = num1 * num2;
		
		if(result == ans) {
			System.out.println("정답");
		}
		if(result != ans) {
			System.out.println("땡");
		}
		
		
		
		
	}

}
