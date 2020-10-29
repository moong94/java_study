package 상속;

class Parent{

	void test() {
		System.out.println("testParent()");
	}
}
class ChildTest extends Parent{

	void test() {
		// 자식의 변수나 함수와 부모의 변수나 함수가 이름이 같다면 super로 구분하면된다. 
		super.test(); // 자식 함수에서 부모의 test를 또 실행시키고싶다면 super를 사용한다.
		System.out.println("testChild()");
	}
}

public class Super {

	public static void main(String[] args) {
		ChildTest child = new ChildTest();
		child.test();
	}

}
