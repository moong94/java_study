package ���;

class ExtendsTest1 extends Object{ // Object�� ����� �ϴ����ϴ� �ڵ����� ��ӵȴ�. 
	int b;
}

class ExtendsTest2 {
	int a;
}


public class ���2 {

	public static void main(String[] args) {
		ExtendsTest1 test1 = new ExtendsTest1();
		ExtendsTest2 test2 = new ExtendsTest2();
		// test1. ������ �ʷϻ� �Լ����� �ִ�. 
		// test2. ������ �ʷϻ� �Լ����� �ִ�. 
		// ���������ʾҴµ� �̹� �����ϴ� �޼��� ���� �����ΰ�?
		// �ڹٴ� �Ŭ�������� Object Ŭ������ �ڵ����� ��ӹ޴´�.
		// �ʷϻ����� ������ �Լ��� ObjectŬ���� �ȿ� ��������ִ� �޼��� ���̴�. 
		
		//=============== toString ===============
		
		
		// toString()�� Object Ŭ������ ��������ִ� �޼����̴�. 
		// ������ test1.toString() ������ ���ǻ� toString() �� �����Ҽ��ִ�. 
		// toString() ��  �޸� �ּҸ� ������ش�. 
		
		System.out.println(test1.toString());// �Ѵ� ���� ����� ���´�. 
		System.out.println(test1); // �Ѵ� ���� ����� ���´�. 
	}

}
