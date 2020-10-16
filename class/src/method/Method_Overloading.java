package method;

class MethodOverloading{
	int add(int x, int y) {
		return x + y;
	}
	int add(int x, int y, int z) {
		return x + y + z;
	}
	int add(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
}

public class Method_Overloading {
	public static void main(String[] arg) {
		
		// 매서드오버로딩이란? 메서드를 같은이름으로 만들어도 
		// 전달되는값이 다르면 서로 다른 매서드로 인식하겠다. 이런뜻 
		
		
		MethodOverloading mol = new MethodOverloading();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int r1 = mol.add(10, 3);
		int r2 = mol.add(10, 3, 1);
		int r3 = mol.add(arr);
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
	}
}
