package array;

import java.util.Scanner;
import java.util.Random;

public class Test09_ex {

	public static void main(String[] args) {
		/*
		 * # �Ｎ����
		 * 1. ���� 7�� �������� 3�� �����ϸ�, ��÷�����̴�.
		 */
		//�߰� ����) lotto �� ó������ ���� �ִ°� �ƴ϶� 
		//         �������� 7�̳� 0 ��  ������ �Ź� �ٸ� ����� �������� ��������

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int lotto[] = new int[7];

		for(int i = 0; i < 7;i ++) {
			int rannum = ran.nextInt(2);
			if(rannum == 0) {
				lotto[i] = 0;
			}
			else if(rannum == 1) {
				lotto[i] = 7;
			}
		}
		
		for (int i = 0; i < 7; i++) {
			System.out.print(lotto[i] + " ");
		}
		
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
