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
		// === ������ === 
		
		// ���� �ٸ�Ŭ������ �迭�� ����Ұ����ϱ⶧����
		// ����θ� ��ӹް�
		// �θ��� Ŭ������ �迭�� ����� �ѹ迭�� ���δٸ�Ŭ�������� �����Ҽ��ִ�.
		// Ŭ������ �迭�μ� ������ �� �ִ� ���.
		
		Unit [] unitList = new Unit[10];
		Wolf wolf =new Wolf();
		unitList[0] = wolf;
		Bat bat = new Bat();
		unitList[1] = bat;
	}

}
