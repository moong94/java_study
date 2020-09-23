package array;

import java.util.Scanner;
import java.util.Random;

public class ArrayEx30 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50[3�ܰ�] : 1 to 18
		 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
		 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
		 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
		 * 4. ���� 1~9�� front �迭�� �����ϰ�,
		 *    ���� 10~18�� back �迭�� �����Ѵ�.
		 */
		
		final int SIZE = 9;
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];
		
		//���ʷ� �迭����
		for(int i = 0; i < 9; i++) {
			front[i] = i + 1;
			back[i] = i + 10;
		}
		//����
		
		for(int i = 0; i < 1000; i++) {
			int suffle1 = ran.nextInt(SIZE);
			int suffle2 = ran.nextInt(SIZE);
			int temp[] = new int[SIZE];
			
			temp[0] = front[suffle1];
			front[suffle1] = front[0];
			front[0] = temp[0];

			temp[0] = back[suffle2];
			back[suffle2] = back[0];
			back[0] = temp[0];
		}
		
		//ī��Ʈ�� ���� �ش� ī��Ʈ�� �ش� ���ڰ� �����ϸ� �н�
		int cnt = 1;
		
		//���ӽ���
		while(true) {
			for(int i = 0; i < SIZE; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			for(int i = 0; i < SIZE; i++) {
				System.out.print(front[i] + "\t");
			}
			System.out.println();
			
			//back�迭�� �μ����� front�迭�� �Ű��ش�.
			//back�迭�� �μ����� �Ű����� �� 0���� �ٲ��
			//back�迭�� ��� �μ����� front�� �Ű����� ��� back���� 0�� ���� �ȴ�.
			while(cnt < 19) {
				System.out.print("��ġ �Է� : ");
				int input = scan.nextInt();
				
				if(front[input] == cnt) {
					cnt++;
					front[input] = back[input];
					back[input] = 0;
					break;
				}
			}
			
			if(cnt == 19) {
				System.out.println("CLEAR!");
				break;
			}
		}
		
	}

}
