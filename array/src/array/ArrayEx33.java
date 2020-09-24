package array;

public class ArrayEx33 {

	public static void main(String[] args) {
		/*
		 * # 정렬하기
		 * 1. 인덱스 0번이 나머지를 검사한다.
		 * 2. 제일 큰 값을 찾아 교환한다.
		 * 3. 인덱스 1증가한다.
		 * 4. [1~3]을 끝까지 반복한다.
		 * 예)
		 * 10, 50, 30, 40, 80, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 40, 30, 10, 7
		 */

		int[] score = {10, 50, 30, 40, 80, 7};
		
		final int SIZE = 6;
		
		int idx = 0;
		
		while(idx < SIZE) {
			int maxidx = 0;
			int max = 0;
			int tmp = 0;
			
			//초기값 저장
			max = score[idx];
			
			for(int i = idx; i < SIZE; i++) {	
				if(max <= score[i]) {
					max = score[i];
					maxidx = i;

				}
			}
			
			tmp = score[maxidx];
			score[maxidx] = score[idx];
			score[idx] = tmp;
	
			
			for(int i = 0; i < SIZE; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println();
			idx++;
			
			
		}
		

	}

}
