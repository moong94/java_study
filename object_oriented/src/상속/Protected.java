package ���;

class TestParent{
	 private int a;
	 protected int b;
	 int c;
	 public int d;
}
class TestChild extends TestParent{
	
}
//���������� ���� 
//private   ==> 1) �ڽ�Ŭ�����ȿ����� ��밡��
//protected ==> 1) ��Ű���� �ٸ��� �ڽ�Ŭ������ �ڽ�Ŭ���� ������ ��밡��  2) ��Ű���������� public ������. 
//default   ==> 1) �ƹ��͵��Ⱦ��� ����Ʈ �̴�.  2) ��Ű���� �ٸ��� private ��Ű���� ������ public ������. 
//public    ==> 1) ��𼭵� ��밡���ϴ�. 


public class Protected {

	public static void main(String[] args) {
		TestChild test = new TestChild();
		
//		test.a = 10; 		//private�� ����Ŭ�������� ��� �Ұ�.
		test.b = 20;		//��Ű���� ���� ��뿩�� ����. �� ��Ű�� ���� �����Ƿ� public�� ����.
		test.c = 30;		//��Ű���� ���� ��뿩�� ����.
		test.d = 40;		//��𼭵� ��� ����.
		
	}

}
