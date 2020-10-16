package method;

class TestReturn5{
	int result;
	int arr[];
	void plus(int a , int b) {
		result = a + b;
	}	
	void copyArr(int arr[]) {
		this.arr =arr;
	}	
	int rePlus(int a, int b) {
		return a + b;
	}
	int[] reArr() {
		arr = new int[4];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i +1)* 10;
		}		
		return arr;
	}
}

public class MethodReturnTheory05 {

	public static void main(String[] args) {
		
		TestReturn5 r = new TestReturn5();
		
		r.plus(10, 3);
		System.out.println(r.result);
		
		int result = r.rePlus(10, 3);
		System.out.println(result);
	
		System.out.println("=======================");
		
		int arr[] = {10,20,30,40};
		r.copyArr(arr);
		for(int i =0; i < r.arr.length; i++) {
			System.out.print(r.arr[i] + " ");
		}
		System.out.println();
	
		int arr2[] = r.reArr();
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " " );
		}
		System.out.println();
	}

}
