package array;

import java.util.Random;

public class ArrayEx04 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		
		Random ran = new Random();
		
		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		for(int i = 0; i < 5; i++) {
			int rannum = ran.nextInt(100) + 1;
			
			arr[i] = rannum;
		} 
		for(int j = 0; j < 5; j++) {
			System.out.println(arr[j]);
		}
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int sum = 0;
		double avg = 0.0;
		
		for(int k = 0; k < 5; k++) {
			sum += arr[k];
		}
		
		avg = sum / 5;
		
		System.out.println("총점(" + sum + ") 평균(" + avg + ")");
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명

		int cnt = 0;
		
		for(int l = 0; l < 5; l++) {
			if(arr[l] >= 60) {
				cnt++;
			}
		}
		System.out.println(cnt + "명");
		
	}

}
