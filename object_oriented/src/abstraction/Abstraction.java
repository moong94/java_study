package abstraction;

//추상화 ==> 부모클래스를 상속받은  자식클래스에  특정메서드를 만들도록 강제하는것 
//abstract 위치 ==> 1. 키워드 강제할 메서드 앞에 와 2. 클래스 앞에 붙여준다.
class A{
	int a;
	void test() {
	}
}
class B extends A{
	int b;
}
abstract class C{ // 1) abstract 클래스 앞에 붙여줌 
	int c;
	abstract void test();  // 2) abstract 메서드 앞에 붙여줌 (이름만만들고 구현은 자식이한다.)
}
class D extends C{
	int d;
	void test() { // 강제로 만들어야하는 메서드
		
	}
}

public class Abstraction {

	public static void main(String[] args) {

	}

}
