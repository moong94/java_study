package array;

public class ArrayEx34 {

	public static void main(String[] args) {
		/*
		 * # 석차 출력
		 * . 성적 순으로 이름 출력
		 */

		String[] name = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		final int SIZE = 5;
		
		int idx = 0;
		int maxidx = 0;
		int maxscore = 0;
		int tmp = 0;
		String nametmp;
		
		while(idx < SIZE) {
			
			//초기값 지정
			maxscore = score[idx];
			
			for(int i = idx; i < SIZE; i++) {
				if(maxscore <= score[i]) {
					maxidx = i;
					maxscore = score[i];
				}
			}
			
			tmp = score[maxidx];
			score[maxidx] = score[idx];
			score[idx] = tmp;
			
			nametmp = name[maxidx];
			name[maxidx] = name[idx];
			name[idx] = nametmp;
			
			idx++;
		}
		//석차와 함께 모두 출력
		for(int i = 0; i < SIZE; i++) {
			System.out.println((i + 1) +"등 : " + name[i] + " 성적 : " + score[i]);
		}

	}

}
