package array;

import java.util.Scanner;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		
		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
			
		System.out.print("인덱스2 입력 : ");
		int idx2 = scan.nextInt();
		
		int change = 0;
		
		change = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = change;
		
		for(int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
				
		}
		
		System.out.println();
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 40
		//        값2 입력 : 20
		//		  {10, 20, 30, 40, 50}
		System.out.print("값1 입력 : ");
		int cal1 = scan.nextInt();
			
		System.out.print("값2 입력 : ");
		int cal2 = scan.nextInt();
		
		int change2 = 0;
		
		idx1 = 0;
		idx2 = 0;
		
		for(int j = 0; j < 5; j++) {
			if(arr[j] == cal1) {
				idx1 = j;
			}
			else if(arr[j] == cal2) {
				idx2 = j;
			}
		}
		
		change2 = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = change2;
		
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		
		System.out.print("학번1 입력 : ");
		int sid1 = scan.nextInt();
			
		System.out.print("학번2 입력 : ");
		int sid2 = scan.nextInt();
		
		idx1=0;
		idx2=0;
		
		change = 0;
		
		for(int i = 0; i < 5; i++) {
			if(hakbuns[i] == sid1) {
				idx1 = i;
			}
			else if(hakbuns[i] == sid2) {
				idx2 = i;
			}
		}
		
		change = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = change;
		
		for(int i = 0; i < 5; i++) {
			System.out.print(scores[i] + " ");
		}

	}

}
