package array;

public class Test09 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};		
		int temp4[] = new int[5];
		
		//����1) arr�� ���� temp4�� �Ųٷ� ������ ��� 
		// ��) temp4 ==> {50,40,30,20,10}

		int j = 4;
		
		for(int i = 0; i < 5; i++) {
			temp4[j] = arr[i];
			j--;
		}
		for(int k = 0; k < 5; k++) {
			System.out.print(temp4[k] + ", ");
		}
	}

}
