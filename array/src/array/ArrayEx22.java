package array;

import java.util.Scanner;

public class ArrayEx22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		int delcnt = 0;
		
		boolean run = true;
		while(run) {
			
			for(int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.println("[1]추가");
			System.out.println("[2]삭제");
			System.out.println("[3]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			//추가
			if(sel == 1) {
				if(cnt == 5) {
					System.out.println("더이상 추가할 수 없습니다.");
					continue;
				}
				
				System.out.print("추가할 값 입력 : ");
				int data = scan.nextInt();
				
				arr[cnt] = data;
				cnt++;
				
			}
			
			
			//삭제
			else if(sel == 2) {
				
				if(sel == 2) {
					
					System.out.print("삭제할 값 입력 : ");
					int data = scan.nextInt();
					
					int delIdx = -1;
					for(int i=0; i<cnt; i++) {
						if(arr[i] == data) {
							delIdx = i;
						}
					}
					
					if(delIdx == -1) {
						System.out.println("입력하신 값은 존재하지 않습니다.");
					}else {
						int temp[] = new int[5];
						int tempIdx = 0;

						for (int i = 0; i < cnt; i++) {
							if (i != delIdx) {
								temp[tempIdx] = arr[i];
								tempIdx += 1;
							}
						}
						for(int i = 0; i < cnt; i++) {
							arr[i] = temp[i];
						}		
	                    						
						cnt -= 1;
					}								
				}

				
			}
			
			//삽입
			else if(sel == 3) {
				
				if(cnt == 5) {
					System.out.println("더이상 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("삽입할 위치 입력 : ");
				int idx = scan.nextInt();
				
				if(cnt < idx || idx < 0) {
					System.out.println("해당 위치에는 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("삽입할 값 입력 : ");
				int data = scan.nextInt();
				
				int [] temp = new int[cnt + 1];
				int tempIndex = 0;
				
				for(int i = 0; i < cnt + 1; i++) {
					if(idx != i) {
						temp[i] = arr[tempIndex];
						tempIndex +=1;
					}
				}
				
				for(int i = 0; i < cnt + 1; i++) {
					arr[i] = temp[i];
				}
				arr[idx] = data;
				cnt += 1;
				
			}

			
		}

	}

}
