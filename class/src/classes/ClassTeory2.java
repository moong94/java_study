package classes;

class Ex02 {
	String name;
	int score;
}

public class ClassTeory2 {

	public static void main(String[] args) {
		Ex02 hgd = new Ex02();
		hgd.name = "홍길동";
		hgd.score = 100;

		System.out.println(hgd.score);

		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
		Ex01 e = new Ex01();
		e.x = 10;
		e.y = 20;
	}

}
