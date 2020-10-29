package 상속;

class TestParent{
	 private int a;
	 protected int b;
	 int c;
	 public int d;
}
class TestChild extends TestParent{
	
}
//접근제어자 종류 
//private   ==> 1) 자신클래스안에서만 사용가능
//protected ==> 1) 패키지가 다르면 자신클래스와 자식클래스 에서만 사용가능  2) 패키지가같으면 public 과같다. 
//default   ==> 1) 아무것도안쓰면 디폴트 이다.  2) 패키지가 다르면 private 패키지가 같으면 public 과같다. 
//public    ==> 1) 어디서든 사용가능하다. 


public class Protected {

	public static void main(String[] args) {
		TestChild test = new TestChild();
		
//		test.a = 10; 		//private라 메인클래스에서 사용 불가.
		test.b = 20;		//패키지에 따라 사용여부 결정. 한 패키지 내에 있으므로 public과 같다.
		test.c = 30;		//패키지에 따라 사용여부 결정.
		test.d = 40;		//어디서든 사용 가능.
		
	}

}
