package public_private;

class PrivateTest{
	private int a; 
	public int b;
	int c;
}
// 접근제어자 : public , private 

public class Private {

	public static void main(String[] args) {
		// 클래스 멤버 변수에 public 이나 , private 을 붙일수있다.
		
		PrivateTest test = new PrivateTest();
		// private 을 붙인변수는 클래스 내부에서만 사용가능하다 다른클래스에서는 사용못한다.
		// 여기는 main 이기때문에 a를 직접적으로 사용할수없다.
		
		// private 을 붙인변수는 test. 할때 보이지않는다. 
		
		// 아무것도 붙이지 않은 c 는 public 을 붙인거와같다. 
	}

}
