package classEx;

import java.util.Scanner;
import java.util.Random;

class Ex15{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];	
	int total = 0;
}
public class Class_���ϱ���� {

	public static void main(String[] args) {
		/*
		 * # ���ϱ� ����
		 * 1. 1���� 10 ������ ������ ���� �ߺ� ���� game �迭�� 6�� �����Ѵ�.
		 * 2. 0���� 5������ ���� �� 3���� �ߺ� ���� ������ �� ���� ���� ����Ѵ�. 
		 * 3. ����ڴ� �ߺ����� 3���� �ε����� ��� �� ���� ���ߴ� �����̴�.
		 */
		
		Ex15 e = new Ex15();
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		for(int i = 0; i < e.game.length; i++) {
			int random = ran.nextInt(10) + 1;
			e.game[i] = random;
			for(int j = 0; j < i; j++) {
				if(e.game[i] == e.game[j]) {
					i--;
				}
			}
		}
		for(int i = 0; i < e.idx.length; i++) {
			int random = ran.nextInt(6);
			e.idx[i] = random;
			for(int j = 0; j < i; j++) {
				if(e.idx[i] == e.idx[j]) {
					i--;
				}
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i < e.idx.length; i++) {
			sum += e.game[e.idx[i]];
		}
		
		System.out.print("GAME : ");
		for(int i = 0; i < e.game.length; i++) {
			System.out.print(e.game[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("3�� ������ �� : " + sum);
		
		for(int i = 0; i < e.myIdx.length; i++) {
			System.out.print((i + 1) + "��° �Է� : ");
			int input = scan.nextInt();
			
			if(input < 0 || input > e.game.length - 1) {
				System.out.println("�Է� ����");
				i--;
			}
			else {
				e.myIdx[i] = input;
			}
		}
		
		int cnt = 0;
		
		for(int i = 0; i < e.idx.length; i++) {
			for(int j = 0; j < e.myIdx.length; j++) {
				if(e.myIdx[j] == e.idx[i]) {
					cnt++;
				}
			}
		}
		if(cnt == 3) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		
		
		
	}

}
