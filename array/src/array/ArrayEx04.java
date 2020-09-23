package array;

import java.util.Random;

public class ArrayEx04 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		
		Random ran = new Random();
		
		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		
		for(int i = 0; i < 5; i++) {
			int rannum = ran.nextInt(100) + 1;
			
			arr[i] = rannum;
		} 
		for(int j = 0; j < 5; j++) {
			System.out.println(arr[j]);
		}
		
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		int sum = 0;
		double avg = 0.0;
		
		for(int k = 0; k < 5; k++) {
			sum += arr[k];
		}
		
		avg = sum / 5;
		
		System.out.println("����(" + sum + ") ���(" + avg + ")");
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��

		int cnt = 0;
		
		for(int l = 0; l < 5; l++) {
			if(arr[l] >= 60) {
				cnt++;
			}
		}
		System.out.println(cnt + "��");
		
	}

}
