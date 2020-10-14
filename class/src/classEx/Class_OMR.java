package classEx;

import java.util.Random;

class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
}

public class Class_OMR {

	public static void main(String[] args) {
		/*
		 * # OMR카드 : 클래스 + 변수
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
		Ex06 omr = new Ex06();
		
		Random ran = new Random();
		
		System.out.print("answer \t= ");
		for(int i = 0; i < omr.answer.length; i++) {
			System.out.print(omr.answer[i] + " ");
		}
		System.out.println();
		
		System.out.print("hge \t= ");
		for(int i = 0 ; i < omr.hgd.length; i++) {
			omr.hgd[i] = ran.nextInt(5) + 1;
			System.out.print(omr.hgd[i] + " ");
		}
		System.out.println();
		
		
		System.out.print("정오표 \t= ");
		for(int i = 0; i < omr.answer.length; i++) {
			if(omr.answer[i] == omr.hgd[i]) {
				System.out.print("O ");
				omr.cnt++;
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println();
		
		omr.score = omr.cnt * 20;
		System.out.println("성적 \t= " + omr.score + "점");

	}

}
