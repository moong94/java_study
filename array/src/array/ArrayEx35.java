package array;

public class ArrayEx35 {

	public static void main(String[] args) {
		int[] arr = {87, 100, 24, 11, 79};
		
		int[] temp = arr;
		temp[1] = 0;
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.print(temp[i] + " ");
		}

		/*
		 * JAVA���� �迭�� �ش� ���� �����Ǿ� �ִ� ���� �ƴ϶� heap�� �迭�� ����� ����
		 * heap�� �ּҸ� �����Ͽ� �������� ���̹Ƿ�
		 * ������ temp�� arr�� ���� �ƴ� arr�� �ּҸ� �����ϴ� ���̴�.
		 * ���� ���� ���� �ּҸ� �����ϹǷ� temp�� ���� �ٲٸ�
		 * arr�� ���� �ּ��� ���� �ٲ�� ���̹Ƿ� 
		 * arr�� ȣ���ϸ� heap���� �ٲ� ���� �״�� �ٲ�� �ȴ�.
		 * 
		 */
	}

}
