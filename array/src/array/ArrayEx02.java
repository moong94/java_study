package array;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 1.�迭 ����(1)
				int[] arr = new int[3];
				arr[0] = 10;
				arr[1] = 20;
				arr[2] = 30;
				
				for(int i=0; i<3; i++) {
					System.out.println(arr[i]);
				}

				// 2.�迭 ����(2) : �����
				int[] temp = {10, 20, 30};

				for(int i=0; i<3; i++) {
					System.out.println(temp[i]);
				}

	}

}
