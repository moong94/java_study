package public_private;

class PrivateTest{
	private int a; 
	public int b;
	int c;
}
// ���������� : public , private 

public class Private {

	public static void main(String[] args) {
		// Ŭ���� ��� ������ public �̳� , private �� ���ϼ��ִ�.
		
		PrivateTest test = new PrivateTest();
		// private �� ���κ����� Ŭ���� ���ο����� ��밡���ϴ� �ٸ�Ŭ���������� �����Ѵ�.
		// ����� main �̱⶧���� a�� ���������� ����Ҽ�����.
		
		// private �� ���κ����� test. �Ҷ� �������ʴ´�. 
		
		// �ƹ��͵� ������ ���� c �� public �� ���ΰſͰ���. 
	}

}
