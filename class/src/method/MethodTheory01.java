package method;

class Test{		
	void testPrint() {
		System.out.println("!!");
	}
}

public class MethodTheory01 {

	public static void main(String[] args) {
		//�ż��� �⺻���� 
		// ����
		// 1) void 				==> Ű����
		// 2) testPrint() 		==> �̸�
		// 3) {���}             ==> ����Ǵ� ���� 
			
		// ����
		// t1.testPrint();
		// 1) t1     ==> Ŭ����������
		// 2) .testPrint(); ==> .�Լ��̸�();
		
		Test test = new Test();
		test.testPrint();
		test.testPrint();
		test.testPrint();
		test.testPrint();
	}

}
