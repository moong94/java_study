package array;

import java.util.Scanner;

public class ArrayEx40 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스 2 입력 : ");
		int idx2 = scan.nextInt();
		
		System.out.println("값 출력 : " + arr[idx1][idx2]);
		
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		int idxx = 0;
		int idxy = 0;
		
		System.out.print("값 입력 : ");
		int val = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				if(arr[i][j] == val) {
					idxx = i;
					idxy = j;
				}
			}
		}
		System.out.println("인덱스1 출력 : " + idxx + "     인덱스2 출력 : " + idxy);
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max = 0;
		int idxx2 = 0;
		int idxy2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					idxx2 = i;
					idxy2 = j;
				}
			}
		}
		System.out.println(idxx2 + " " + idxy2);
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.print("값1 입력 : ");
		int val1 = scan.nextInt();
		
		int val1x = 0;
		int val1y = 0;
		
		System.out.print("값2 입력 : ");
		int val2 = scan.nextInt();

		int val2x = 0;
		int val2y = 0;
		
		int[][] tmp = new int[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				if(arr[i][j] == val1) {
					val1x = i;
					val1y = j;
				}
				else if(arr[i][j] == val2) {
					val2x = i;
					val2y = j;
				}
			}
		}
		
		tmp[val1x][val1y] = arr[val1x][val1y];
		tmp[val2x][val2y] = arr[val2x][val2y];
		
		arr[val1x][val1y] = tmp[val2x][val2y];
		arr[val2x][val2y] = tmp[val1x][val1y];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	

}
