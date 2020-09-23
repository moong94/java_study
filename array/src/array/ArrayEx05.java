package array;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		// 인덱스            0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};

		
		Scanner scan = new Scanner(System.in);
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		boolean opt = true;
		
		int index = 0;
		
		System.out.print("인덱스 입력 : ");
		while(opt) {
			
			int inputnum = scan.nextInt();
			if(inputnum < 0 || inputnum > 5) {
				System.out.println("1~5사이의 숫자 입력");
				System.out.print("인덱스 입력 : ");
			}
			else {
				index = inputnum;
				opt =false;
			}
		}
		
		System.out.println(" 성적 : " + arr[index] + "점");
		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		System.out.println("성적 입력 : ");
		int score = scan.nextInt();
		
		int cnt=0;
		
		for(int i = 0; i < 5; i++) {
			if(score == arr[i]) {
				System.out.println("인텍스 : " + i);
			}
			else {
				cnt++;
			}
		}
		if(cnt == 5) {
			System.out.println("존재하지 않는 성적.");
		}
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
				
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		System.out.println("학번 입력 : ");
		int sid = scan.nextInt();
		
		int cnt2 = 0;
		
		for(int i = 0; i < 5; i ++) {
			if(sid == hakbuns[i]) {
				System.out.println("성적 : " + scores[i]);
			}
			else {
				cnt2++;
			}
		}
		if(cnt2 == 5) {
			System.out.println("존재하지 않는 학번.");
		}
		
		
	}

}
