package polymorphism;

class Unit{
	int hp;
	int power;
}
class Wolf extends Unit{
	int leg; int bite;
}
class Bat extends Unit{
	int fly; int poison;
}

public class Polymorphism1 {

	public static void main(String[] args) {
		// === 다형성 === 
		
		// 서로 다른클래스는 배열에 저장불가능하기때문에
		// 공통부모를 상속받고
		// 부모의 클래스로 배열을 만들면 한배열에 서로다른클래스들을 저장할수있다.
		// 클래스를 배열로서 저장할 수 있는 기능.
		
		Unit [] unitList = new Unit[10];
		Wolf wolf =new Wolf();
		unitList[0] = wolf;
		Bat bat = new Bat();
		unitList[1] = bat;
	}

}
