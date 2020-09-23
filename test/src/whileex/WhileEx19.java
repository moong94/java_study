package whileex;

public class WhileEx19 {

	public static void main(String[] args) {
		/*
		 * # 반복문 for
		 * 1. 반복문의 조건 3가지
		 * 1) 초기식
		 * 2) 조건식
		 * 3) 증감식
		 * 2. for문의 구조
		 * for(초기식;조건식;증감식){
		 * 		조건식이 참일 동안 실행할 문장;
		 * }
		 * 3. for문의 실행순서
		 * 초기식 → 조건식 → 실행문 → 증감식 → 조건식 → 실행문 → 증감식 ...
		 */
		
		// 1~5까지 출력
		int x = 1;
		while (x <= 5) {
			System.out.println(x);
			x = x + 1;
		}

		System.out.println();

		for (int y = 1; y <= 5; y++) {
			System.out.println(y);
		}

		// 문제 1) 1부터 5까지 출력
		// 정답 1) 1, 2, 3, 4, 5
		
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
		}

		// 문제 2) 1부터 10까지 반복해, 5~9까지 출력
		// 정답 2) 5, 6, 7, 8, 9
		for(int j = 1; j < 10; j++) {
			if(j>=5) {
				System.out.println(j);
			}
		}
		

		// 문제 3) 1부터 10까지 반복해 6~3까지 출력
		// 정답 3) 6, 5, 4, 3
		for(int k = 10; k > 0; k--) {
			if(k <= 6 && k >= 3) {
				System.out.println(k);
			}
		}

		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1, 2, 7, 8, 9, 10
		for(int l = 1; l <= 10; l ++) {
			if(l <= 3 || l >=7) {
				System.out.println(l);
			}
		}
		
	}

}
