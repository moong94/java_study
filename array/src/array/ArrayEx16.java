package array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx16 {

	public static void main(String[] args) {
		/*
		 * # 1 to 50[1단계] : 1 to 4
		 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
		 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
		 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
		 * 예)
		 * 4 2 3 1
		 * 입력 : 3
		 * 4 2 3 9
		 * 입력 : 1
		 * 4 9 3 9
		 * ...
		 */

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		int num = 1;
		
		
		for(int i = 0; i < 4; i++) {
			
			int rannum = ran.nextInt(4);
				
			if(arr[rannum] == 0) {
				arr[rannum] = num;
				num++;
			}
			else {
				i--;
			}
		}
		for(int i = 0; i < 4; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int checknum = 0;
		
		while(checknum < 4) {
			System.out.print("입력 : ");
			int input = scan.nextInt();
			
			if(arr[input] == checknum + 1) {
				arr[input] = 9;
				checknum++;
				for(int i = 0; i < 4; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
			else {
				System.out.println("오답");
				continue;
			}
			
		}
		System.out.println("CLEAR");
		
		

	}

}
