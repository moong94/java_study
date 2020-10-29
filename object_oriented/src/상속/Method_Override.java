package 상속;

class MethodOverloding{
	void test(int a) {};
	void test(int a , int b) {};
	void test(String a) {};
}
class MethodOverride{
	void test() {
		System.out.println("testParent");
	}
	void overridTest() {
		System.out.println("overridTestParent");
	}
}
class Child extends MethodOverride{
	void overridTest() {
		System.out.println("overridTestChild");
	}
}


public class Method_Override {

	public static void main(String[] args) {
		// 1)매서드 오버로딩 , 2)매서드오버라이드 
		
		// 매서드 오버로딩은 같은 함수이름을 여러개 사용하수있는 기능이다. 
		
		// 메서드 오버라이드 는 부모에 있는 메서드를 자식이 같은이름으로 만들어서 사용하는것이다. 
		Child c = new Child();
		c.test(); // 당연히 부모의 메서드를 사용할수있다.
		c.overridTest(); // 부모의 메서드는 실행되지않고 자식의 메서드가 우선순위를 가져간다.
		
	}

}
