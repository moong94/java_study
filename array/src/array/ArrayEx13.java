package array;

public class ArrayEx13 {

	public static void main(String[] args) {
		/*
		 * # 4�� ����� ����
		 * - arr �迭���� 4�� ����� ��� temp �迭�� ����
		 */

		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
	
		int cnt = 0;
		
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		
		temp = new int[cnt];
		
		cnt = 0;
		
		for(int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0) {
				temp[cnt] = arr[i];
				cnt++;
			}
			else {
				continue;
			}
		}
		
		for(int i = 0; i < cnt ; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
