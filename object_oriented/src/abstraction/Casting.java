package abstraction;

class Base {
	String name;
	public void say() {
		System.out.println(name + "�� �ȳ��ϼ���");
	}
}

class Sub extends Base {
	int age;
	@Override
	public void say() {
		System.out.println(name + "���� " + age + "�� �Դϴ�.");
	}
}

public class Casting {

	public static void main(String[] args) {
		Base base = new Base();
		Sub sub = new Sub();
		
		// --- Ŭ���� ����ȭ  ---
		// [1]base ������ new �Ҷ� Base ���ִ� ���븸 �����ȴ�. 
		// [2]�ݸ�, sub ������ new �Ҷ� Base �� Sub �� �Ѵ� �����ȴ�. 
		// �ᱹ, 
		// [3] sub��  Base �� ����ȯ�����ϰ�, 		
		// [4] base �� Sub ���� ����ȯ �Ұ����ϴ�.	
				
		// === �Ʒ� ��� === 	
		Base test1 = (Base)sub; // sub�� �Ѵ� �������ֱ⶧���� �����ϴ�.
		//Sub test2 = (Sub)base; //base�� �Ѱ����������ִ�. ����������. 
		
		// === instanceof ===
		// �����ϰ� instanceof �Լ��� ����Ҽ��ִ�.
		
		Base baseTest = null;
		Sub subTest = null;
		if(sub instanceof Base) { // sub �ȿ��� Base ���ִ�. 
			 baseTest = (Base) sub; // �����ϴ�.
			 System.out.println("����ȯ ���� 1");
		}else {
			System.out.println("����ȯ �Ұ� 1 ");
		}
		
		if(base instanceof Sub) { // base �ȿ��� Sub �̾���.
			 subTest = (Sub) base;  // �Ұ����ϴ�.
			 System.out.println("����ȯ ���� 2"); 
		}else {
			System.out.println("����ȯ �Ұ� 2");
		}
	}

}
