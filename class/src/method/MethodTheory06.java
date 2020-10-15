package method;

class Test6{
	void changeValueInArray(int [] arr) {
		arr[1] = 100;
	}
}

public class MethodTheory06 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		Test6 t6  = new Test6();
		
		// 배열은 주소이기때문에 바뀐다.(아주중요하다.)
		t6.changeValueInArray(arr);		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("-----------------------");
		
		// 아래와 같은 상황이다.
		int testArr[] = {10,20,30,40};
		int temp[] = testArr;
		temp[1] = 100;
		for(int i = 0; i < testArr.length; i++) {
			System.out.print(testArr[i] + " ");
		}
		System.out.println();
	}

}
