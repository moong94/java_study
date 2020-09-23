package array;

import java.util.Scanner;

public class ArrayEx21 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			
			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.println("[3]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 3) {
				
				if(cnt == 5) {
					System.out.println("���̻� ������ �� �����ϴ�.");
					continue;
				}
				
				System.out.print("������ ��ġ �Է� : ");
				int idx = scan.nextInt();
				
				if(cnt < idx || idx < 0) {
					System.out.println("�ش� ��ġ���� ������ �� �����ϴ�.");
					continue;
				}
				
				System.out.print("������ �� �Է� : ");
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
