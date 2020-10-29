package date;

class MySingleTon{
	private MySingleTon() {
		// 이렇게 하면  new 를 할수없다.
	}
	// 내부에서 new 를 한다. 
	static private MySingleTon instance = new MySingleTon();
	// 
	static public MySingleTon getMySingleTon() {
		return instance;
	}
}

public class 싱글톤패턴 {

	public static void main(String[] args) {
		//싱글톤 패턴이란 
		//클래스를 딱하나만 만들고싶을때 사용한다.
		// (주로 배열을 가지고있는 ManagerClass 들)
		
		// ===  만드는법 ===
		// 1) 생성자를 private 으로 만든다 . 그러면 new 를할수없다. 
		// 2) 내부에서 new 를 한다. static 필요
		// 3) public 을 get함수에만 적용한다. static 필요
		
//		MySingleTon test = new MySingleTon();// 에러가난다.
		MySingleTon test = MySingleTon.getMySingleTon();
	}
}
