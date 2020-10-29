package 상속;

class ExtendsTest1 extends Object{ // Object를 상속을 하던안하던 자동으로 상속된다. 
	int b;
}

class ExtendsTest2 {
	int a;
}


public class 상속2 {

	public static void main(String[] args) {
		ExtendsTest1 test1 = new ExtendsTest1();
		ExtendsTest2 test2 = new ExtendsTest2();
		// test1. 찍으면 초록색 함수들이 있다. 
		// test2. 찍으면 초록색 함수들이 있다. 
		// 만들지도않았는데 이미 존재하는 메서드 들은 무엇인가?
		// 자바는 어떤클래스던지 Object 클래스를 자동으로 상속받는다.
		// 초록색불이 들어오는 함수는 Object클래스 안에 만들어져있는 메서드 들이다. 
		
		//=============== toString ===============
		
		
		// toString()은 Object 클래스에 만들어져있는 메서드이다. 
		// 원형은 test1.toString() 이지만 편의상 toString() 은 생략할수있다. 
		// toString() 은  메모리 주소를 출력해준다. 
		
		System.out.println(test1.toString());// 둘다 같은 결과가 나온다. 
		System.out.println(test1); // 둘다 같은 결과가 나온다. 
	}

}
