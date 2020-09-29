package array_test;

public class Test10 {

	public static void main(String[] args) {
		/*
		 * 	삼각형 그리기
		 */
		
		for (int i = 0; i < 9 ; i++) {
		
			for(int j = 9 - i; j > 0; j--) {
				System.out.print(" ");
			
			}
			for(int k = 0; k < i + 1; k++) {
			System.out.print((i + 1) + " ");
			}
			System.out.println();
		}
	}

}
