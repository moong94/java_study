package 상속;

class A {
	int aa;
}

class B extends A {
	int bb;
}

class C {
	A a = new A();
	int cc;
}


public class 상속1 {

	public static void main(String[] args) {
		// 상속이란?
		// B 라는 클래스 가 A 클래스를 상속받으면
		// B 가 new 를 할때 A클래스도 같이 생성된다.

		// 상속받는법
		// 1) class B 옆에 extends 부모클래스
		
		B b = new B(); // B는 A를 상속받았으므로 aa , bb 둘다 사용가능하다.
		b.aa = 100;
		b.bb = 200;
		// 상속받지않고 상속같은 관계만들기
		// C는 A를 상속받지않았지만 내부에 변수를 따로 만들어서 상속받은것과 같은상황이나 
		// .을 2번 찍어야한다. 
		C c = new C();
		c.cc = 100;
		c.a.aa = 200; // 이와같이 . 을 2번찍어야한다.
		
	}

}
