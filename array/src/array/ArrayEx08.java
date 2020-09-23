package array;

import java.util.Random;

public class ArrayEx08 {

	public static void main(String[] args) {
		/*
		 * # OMR카드
		 * 1. 배열 answer는 시험문제의 정답지이다.
		 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
		 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
		 * 4. 한 문제당 20점이다.
		 * 예)
		 * answer = {1, 3, 4, 2, 5}
		 * hgd    = {1, 1, 4, 4, 3}
		 * 정오표     = {O, X, O, X, X}
		 * 성적        = 40점
		 */

		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		
		int score = 0;
		
		Random ran = new Random();
		
		for(int i = 0; i < 5; i++) {
			
			int num = ran.nextInt(5) + 1;
			hgd[i] = num;
		
			if(hgd[i] == answer[i]) {
				score += 20;
			}
		}
		System.out.print("answer = { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("hgd =    { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(hgd[i] + " ");
		}
		System.out.println("}");

		System.out.print("정오표 =    { ");
		for(int i = 0; i < 5; i++) {
			if(answer[i] == hgd[i]) {
				System.out.print("O ");
			}
			else
				System.out.print("X ");
		}
		System.out.println("}");
		
		System.out.println("성적 = " + score + "점");
	}

}
