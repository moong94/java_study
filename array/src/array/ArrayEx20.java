package array;

import java.util.Scanner;

public class ArrayEx20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		
		int check = 0;
		
		boolean run = true;
		while(run) {
			
			System.out.println("[2]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 2) {
				
				if(cnt == 0) {
					System.out.println("������ ���� �����ϴ�.");
					break;
				}
				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();
				
				for(int i = 0; i < 5; i++) {
					if(data == arr[i]) {
						arr[i] = 0;
						cnt--;
						for(int j = 0; j < 5; j++) {
							System.out.print(arr[j] + " ");
						}
						System.out.println();
						check--;
						break;
					}
					check++;
					if(check == 5) {
						System.out.println("�������� �ʴ� ���Դϴ�.");
						break;
					}
					
				}
			}
			
		}

	}

}
