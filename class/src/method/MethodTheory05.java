package method;

class Test5{
	void setValue(int a) {
		// ���� a�� main a�� �̸��� ���Ƶ� �ƹ� �������.
		a = 100;
	}
}

public class MethodTheory05 {

	public static void main(String[] args) {
		
		int a = 56;
		Test5 t1 = new Test5();
		
		// �ż���� ���� �����ϴ°��̱� ������ main���� a�� ������ ����.
		t1.setValue(a);
		System.out.println(a);
		
		System.out.println("--------------");

		// �Ʒ� ������ ���� ��Ȳ�̴�.
		int b = 20;
		int c = b;
		c = 100;
		System.out.println(b); 
	}

}
