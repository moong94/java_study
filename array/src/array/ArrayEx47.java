package array;

import java.util.Scanner;

public class ArrayEx47 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30};
		arr =null;
		
		int darr[][] = new int[3][3];
		darr[1] = arr;
		
		/*
		 * # 2차원배열[삭제]
		 * . 이름과 번호를 입력받아 삭제하기
		 * 예)
		 * 입력 : 철수	1
		 * 삭제 : 김밥
		 * 
		 * 입력 : 철수 2
		 * 삭제 : 바나나
		 */

		String[][] jang = {
				{"철수", "소고기"},
				{"철수", "김밥"},
				{"영희", "김치"},
				{"철수", "바나나"},
				{"철수", "새우깡"},
				{"영희", "오징어"},
				{"영희", "맛밤"}
			};

		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String inputname = scan.next();
		
		System.out.print("번호 입력 : ");
		int inputnum = scan.nextInt();
		
		int count = -1;
		
		for(int i = 0; i < jang.length; i++) {
			if(jang[i][0].equals(inputname)) {
				count++;
			}
			if(count == inputnum) {
				System.out.println("삭제 : " + jang[i][1]);
				
				String tmp[][] = jang;
				jang = new String[tmp.length - 1][2];

				System.out.println("jang.length : " + jang.length);
				System.out.println("tmp.length : " + tmp.length);
				
				int l = 0;
				for(int j = 0; j < jang.length; j++) {
					if(j == count) {
						
						l++;
					}	
					for(int k = 0; k < jang[j].length; k++) {
						jang[j][k] = tmp[l][k];
					}
					l++;
					System.out.println();
				}
				
				
//				jang[jang.length - 1] = null;
//				
//				break;
			}
				
		}
		if(count == -1) {
			System.out.println("이름 입력 오류.");
		}		
		
		for(int i = 0; i < jang.length; i++) {
			for(int j = 0; j < jang[i].length; j++) {
				System.out.print(jang[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
