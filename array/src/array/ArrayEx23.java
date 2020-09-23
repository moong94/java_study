package array;

import java.util.Scanner;

public class ArrayEx23 {

	public static void main(String[] args) {
		/*
		 * # ATM[3�ܰ�]
		 * 1. ����
		 * . ���¹�ȣ�� ��й�ȣ�� �Է¹޾� ����
		 * . ���¹�ȣ �ߺ��˻�
		 * 2. Ż��
		 * . ���¹�ȣ�� �Է¹޾� Ż��
		 */
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		
		
		
		boolean run = true;
		while(run) {
			
			for(int i = 0; i < 5; i++) {
				System.out.print(accs[i] + " ");
			}
			System.out.println();
			for(int i = 0; i < 5; i++) {
				System.out.print(pws[i] + " ");
			}
			System.out.println();
			
			System.out.println("1.����");
			System.out.println("2.Ż��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				int rel = -1;
				int acccheck = -1;
				
				System.out.println("���¹�ȣ �Է� : ");
				int inputacc = scan.nextInt();
				
				if(cnt == 0) {
					accs[cnt] = inputacc;
				}
				
				for(int i = 0; i < cnt; i++) {
					
					if(inputacc == accs[i]) {
						System.out.println("�ߺ��� ���¹�ȣ�Դϴ�.");
						rel = 0;
						break;
						
					}
					else {
						acccheck++;
					}
				}
				if(acccheck == (cnt - 1)) {
					accs[cnt] = inputacc;
				}
				if(rel == -1) {
				System.out.println("��й�ȣ �Է� : ");
				int inputpw = scan.nextInt();
				
				pws[cnt] = inputpw;
				
				cnt++;
				}
			}
			else if(sel == 2) {
				int check = 0;
				int pos = cnt;
				
				if(cnt == 0) {
					System.out.println("���°� �������� �ʽ��ϴ�.");
					continue;
				}
				System.out.println("Ż���� ���¹�ȣ �Է� : ");
				int acc = scan.nextInt();
				
				for(int i = 0; i < cnt; i++) {
					if(acc == accs[i]) {
						accs[i] = 0;
						pws[i] = 0;
						for(int j = 0; j < cnt - i; j++) {
							accs[i] = accs[i + 1];
							pws[i] = pws[i + 1];
						} 
						accs[cnt - 1] = 0;
						pws[cnt - 1] = 0;
						cnt--;
						System.out.println("Ż��Ǿ����ϴ�.");
						break;
					}
					else {
						check++;
					}
					
				}
				if(check == cnt && cnt != 0 && check != pos) {
					System.out.println("�������� �ʴ� ���¹�ȣ�Դϴ�.");
				}
				
			}		
		}
			
	}

}


