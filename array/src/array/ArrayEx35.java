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
		 * JAVA에서 배열은 해당 값이 지정되어 있는 것이 아니라 heap에 배열을 만들어 놓고
		 * heap의 주소를 참조하여 가져오는 것이므로
		 * 위에서 temp는 arr의 값이 아닌 arr의 주소를 참조하는 것이다.
		 * 따라서 둘은 같은 주소를 참조하므로 temp의 값을 바꾸면
		 * arr과 같은 주소의 값이 바뀌는 것이므로 
		 * arr을 호출하면 heap에서 바뀐 값이 그대로 바뀌게 된다.
		 * 
		 */
	}

}
