package method;

class Test5{
	void setValue(int a) {
		// 여기 a는 main a와 이름이 같아도 아무 상관없다.
		a = 100;
	}
}

public class MethodTheory05 {

	public static void main(String[] args) {
		
		int a = 56;
		Test5 t1 = new Test5();
		
		// 매서드는 값을 복사하는것이기 떄문에 main안의 a에 영향이 없다.
		t1.setValue(a);
		System.out.println(a);
		
		System.out.println("--------------");

		// 아래 예제와 같은 상황이다.
		int b = 20;
		int c = b;
		c = 100;
		System.out.println(b); 
	}

}
