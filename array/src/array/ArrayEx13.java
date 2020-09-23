package array;

public class ArrayEx13 {

	public static void main(String[] args) {
		/*
		 * # 4의 배수만 저장
		 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
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
