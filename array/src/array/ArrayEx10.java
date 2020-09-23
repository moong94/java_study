package array;

import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		/*
		 * # �Ｎ����
		 * 1. ���� 7�� �������� 3�� �����ϸ�, ��÷�����̴�.
		 */

		Scanner scan = new Scanner(System.in);
		
		int[] lotto = {0, 0, 7, 7, 7, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 0, 0, 0, 0};
		//int[] lotto = {7, 0, 7, 7, 7, 0, 7, 0};
		
		int cnt = 0;
		
		boolean run = true;
		while(run) {			
			System.out.println("1) ���� ���Ȯ��");	
			System.out.println("2) ����");						
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				for(int i = 1; i < 6; i++) {
					if(lotto[i-1] + lotto[i] + lotto[i+1] == 21){
						cnt++;
					}
					
				}
				if(cnt > 0) {
					System.out.println("��÷.");
				}
				else {
					System.out.println("�̴�÷");
				}
		
			}	
			else if(sel == 2){
				run = false;
			}
		}

	}

}
