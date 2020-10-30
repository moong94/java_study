package interface_;


//표시(marker) 인터페이스
interface Repairble {

}

//모든 유닛의 최고 조상 클래스
class Unit {
//상수는 반드시 선언과 동시에 초기화를 시켜야 한다.
//상수를 초기화 시키는 방법은 선언시 "="을 사용해서 초기화 시키는 방법과 생성자에서 초기화 시키는 방법이 있다.
	final int MAX_HP; // 최대 HP
	int hp; // 현재 HP
//유닛 생성시 최대 HP를 넘겨받아 MAX_HP를 초기화 시키는 생성자
//GroundUnit 클래스가 150을 인수로 넘겨서 Unit 클래스의 생성자를 호출한다.

	public Unit(int hp) {
//	GroundUnit 클래스에서 넘겨받은 150으로 MAX_HP를 초기화 시킨다.
		MAX_HP = hp;
	}
}

//Unit 클래스를 상속받아 모든 육상 유닛의 조상 클래스 GroundUnit 클래스를 만든다.
class GroundUnit extends Unit {
//Tank 클래스가 150을 인수로 넘겨서 GroundUnit 클래스의 생성자를 호출한다.
	public GroundUnit(int hp) {
//	Tank 클래스에서 넘겨받은 150을 인수로 부모 클래스의 생성자를 호출한다.
		super(hp);
	}
}

//Unit 클래스를 상속받아 모든 공중 유닛의 조상 클래스 AirUnit 클래스를 만든다.
class AirUnit extends Unit {
	public AirUnit(int hp) {
		super(hp);
	}
}

//GroundUnit 클래스를 상속받아 Tank, Marine, SCV 클래스를 만든다.
class Tank extends GroundUnit implements Repairble {
	public Tank() {
//	Tank 클래스의 기본 생성자가 실행되면 150을 인수로 부모 클래스의 생성자를 호출한다.
		super(150);
//	부모 클래스의 생성자를 호출해서 MAX_HP를 초기화 시켰으므로 현재 hp도 MAX_HP로 초기화 시킨다.
		hp = MAX_HP;
		System.out.println("Tank의 현재 hp는 " + hp + " 입니다.");
	}

	@Override
	public String toString() {
		return "Tank [hp=" + hp + "]";
	}
}

class Marine extends GroundUnit {
	public Marine() {
		super(70);
		hp = MAX_HP;
		System.out.println("Marine의 현재 hp는 " + hp + " 입니다.");
	}

	@Override
	public String toString() {
		return "Marine [hp=" + hp + "]";
	}
}

class SCV extends GroundUnit implements Repairble {
	public SCV() {
		super(100);
		hp = MAX_HP;
		System.out.println("SCV의 현재 hp는 " + hp + " 입니다.");
	}

//수리하는 메소드는 유닛별로 각각 만들지 않고 실제 수리 기능을 담당하는 유닛인 이곳이만 만든다.
//메소드의 인수로 클래스 또는 인터페이스의 객체를 사용하면 인수로 사용되는 클래스를 상속받은 모든 클래스의 객체와
//인터페이스를 구현받은 모든 클래스의 객체를 인수로 받을 수 있다.
	public void repair(Repairble repairble) {
		
		
//	수리할 객체를 넘겨받은 Repairble 인터페이스에는 아무런 내용이 없으므로 인수로 넘겨받은 객체를 구현한 내용이
//	들어있는 클래스로 형변환 시킨 후 사용해야 한다.
		Unit unit = (Unit) repairble;
		while (unit.hp != unit.MAX_HP) {
			unit.hp++;
		}
		System.out.println(unit + " 수리 완료");
	}

	@Override
	public String toString() {
		return "SCV [hp=" + hp + "]";
	}
}

//AirUnit 클래스를 상속받아 DropShip 클래스를 만든다.
class DropShip extends AirUnit implements Repairble {
	public DropShip() {
		super(120);
		hp = MAX_HP;
		System.out.println("DropShip의 현재 hp는 " + hp + " 입니다.");
	}

	@Override
	public String toString() {
		return "DropShip [hp=" + hp + "]";
	}
}


class A{
	void test() {
		System.out.println("aa");
	}
}
class B extends A{
	void test() {
		System.out.println("bb");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		
		B b = new B();
		b.test();
		
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip dropShip = new DropShip();
	//	System.out.println(scv.toString());
	//	System.out.println(scv);
		scv.repair(dropShip);

	}

}
