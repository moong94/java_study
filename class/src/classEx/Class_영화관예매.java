package classEx;

import java.util.Scanner;

class Ex07{
	int[] seat = new int[7];
	
	int cnt = 0;
	int money = 0;
}

public class Class_��ȭ������ {

	public static void main(String[] args) {
		/*
		 * # ��ȭ�� �¼����� : Ŭ���� + ����
		 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
		 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
		 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
		 * 4. �� �¼��� ���� ������ 12000���̴�.
		 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
		 * ��)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * �¼����� : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * �¼����� : 3
		 * seat = 0 1 0 1 0 0 0
		 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
		 * ----------------------
		 * ����� : 24000��
		 */
		
		Scanner scan = new Scanner(System.in);
		
		Ex07 e = new Ex07();
		
		while(true) {
			
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]�¼�����");
			System.out.println("[2]�����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("seat = ");
				for(int i = 0; i < e.seat.length; i++) {
					System.out.print(e.seat[i] + " ");
				}
				System.out.println();
				
				System.out.print("�¼� ���� : ");
				int select_seat = scan.nextInt();
				
				if(select_seat < 0 || select_seat >= e.seat.length) {
					System.out.println("�Է� ����");
					continue;
				}
				else if(e.seat[select_seat] == 1){
					System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
					continue;
				}
				else {
					
					e.seat[select_seat] = 1;
					e.cnt++;
					
					System.out.print("seat = ");
					for(int i = 0; i < e.seat.length; i++) {
						System.out.print(e.seat[i] + " ");
					}
					System.out.println();
				}
				
			}
			
			else if(sel == 2) {
				e.money = e.cnt * 12000;
				
				System.out.println("----------------------");
				System.out.println("����� : " + e.money + "��");
				break;
			}
		}
	}

}
