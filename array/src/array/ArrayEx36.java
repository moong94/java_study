package array;

import java.util.Scanner;

public class ArrayEx36 {

	public static void main(String[] args) {
		/*
		 * # 배열 컨트롤러[2단계] : 벡터(Vector)
		 * 1. 추가
		 * . 값을 입력받아 순차적으로 추가
		 * 2. 삭제(인덱스)
		 * . 인덱스를 입력받아 해당 위치의 값 삭제
		 * 3. 삭제(값)
		 * . 값을 입력받아 삭제
		 * . 없는 값 입력 시 예외처리
		 * 4. 삽입
		 * . 인덱스와 값을 입력받아 삽입
		 */
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int count = 0;
		
		while(true) {
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			for(int i = 0; i < count; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println();
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			//배열의 값을 입력받아 순차적으로 추가
			if(sel == 1) {
				if(count == 0) {
					score = new int[count +  1];
				}
				else if(count > 0) {
					int[] tmp = score;
					score = new int[count + 1];
					
					for(int i = 0; i < count; i++) {
						score[i] = tmp[i];
					}
					
					tmp = null;
				}
				
				System.out.print("추가할 값 입력 : ");
				int inputnum = scan.nextInt();
				score[count] = inputnum;
				count++;
			}
			
			//인덱스를 입력받아 해당 위치의 값 삭제
			else if(sel == 2) {
				if(count == 0) {
					System.out.println("배열에 값이 없습니다.");
					continue;
				}
				
				System.out.print("삭제할 값의 인덱스 입력 : ");
				int delidx = scan.nextInt();
				
				if(delidx < 0 || delidx > count - 1) {
					System.out.println("값이 존재하지 않는 인덱스입니다.");
					continue;
				}
				else {
					if(count == 1) {
						score = null;
					}
					else if(count >= 1) {
						int[] tmp = score;
						score = new int[count - 1];
						for(int i = 0; i < delidx; i++) {
							score[i] = tmp[i];
						}
						for(int i = delidx + 1; i < count; i++) {
							score[i - 1] = tmp[i];
						}
						tmp = null;
					}
					count--;
				}
			}
			
			//값을 입력받아 삭제 (없는 값 입력시 예외 처리)
			else if(sel == 3) {
				int exc = -1;
				
				if(count == 0) {
					System.out.println("배열에 값이 없습니다.");
					continue;
				}
				
				System.out.print("삭제할  값 입력 : ");
				int delval = scan.nextInt();
				
				for(int i = 0; i < count; i++) {
					if(delval == score[i]) {
						exc = i;
					}
				}
				if(exc == -1) {
					System.out.println("입력한 값이 존재하지 않습니다.");
					continue;
				}
				
				else {
					if(count == 1) {
						score = null;
					}
					else if (count > 1) {
						int[] tmp = score;
						score = new int[count - 1];
						
						for(int i = 0; i < exc; i++) {
							score[i] = tmp[i];
						}
						for(int i = exc + 1; i < count; i++) {
							score[i - 1] = tmp[i];
						}
					}
				}
				count--;
			}
			
			//인덱스와 값을 입력받아 삽입
			else if(sel == 4) {
				System.out.print("추가시킬 값의 인덱스 입력 : ");
				int insertidx = scan.nextInt();
				
				if(insertidx < 0 || insertidx > count - 1) {
					System.out.println("범위밖의 인덱스입니다.");
					continue;
				}
				else {
					System.out.print("삽입할 값 입력 : ");
					int insertval = scan.nextInt();
					
					if(count == 0) {
						score = new int[count + 1];
					}
					else if(count > 0) {
						int[] tmp = score;
						score = new int[count + 1];
						
						for(int i = 0; i < insertidx; i++) {
							score[i] = tmp[i];
						}
						score[insertidx] = insertval;
						
						for(int i = insertidx + 1; i < count + 1; i++) {
							score[i] = tmp[i - 1];
						}
						
						tmp = null;
					}
					count++;
				}
				
			}
			
			//종료
			else if(sel == 0) {
				break;
			}
		}
	}
}
