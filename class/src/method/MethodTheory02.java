package method;

class Test2{	
	
	void printSum() {
		int total = 0;
		for(int i = 1; i <= 5; i++) {
			total += i;
		}
		System.out.println(total);
	}
}
public class MethodTheory02 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		// 1~5의 합을 출력하는함수
		t2.printSum();
	}

}
