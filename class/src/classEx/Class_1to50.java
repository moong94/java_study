package classEx;

import java.util.Scanner;
import java.util.Random;

class Ex11{
	final int SIZE = 9;	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];	
	int cnt = 1;
}


public class Class_1to50 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50[3�ܰ�] : 1 to 18
		 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
		 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
		 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
		 * 4. ���� 1~9�� front �迭�� �����ϰ�,
		 *    ���� 10~18�� back �迭�� �����Ѵ�.
		 */
		
		Ex11 e = new Ex11();
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		
		
		for(int i = 0; i < e.SIZE; i++) {
			int random = ran.nextInt(9);
			
			if(e.front[random] != 0) {
				i--;
			}
			else {
				e.front[random] = i + 1;
			}
		}
		
		for(int i = 0; i < e.SIZE; i++) {
			int random = ran.nextInt(9);
			
			if(e.back[random] != 0) {
				i--;
			}
			else {
				e.back[random] = i + 10;
			}
		}
		
		while(true) {
			
			for(int i = 0 ; i < e.SIZE; i++) {
				System.out.print(e.front[i] + " ");
			}
			System.out.println();
			
			if(e.cnt == 19) {
				System.out.println("clear");
				break;
			}
			
			System.out.print("�Է� : ");
			int input = scan.nextInt();
			if(e.cnt <= 9) {
				if(e.front[input] == e.cnt) {
					e.front[input] = e.back[input];
					e.cnt++;
				}
			}
			else {
				if(e.front[input] == e.cnt) {
					e.front[input] = 0;
					e.cnt++;
				}
			}
			
			
		}
		
		
		
	}

}
