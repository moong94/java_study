package date;

class MySingleTon{
	private MySingleTon() {
		// �̷��� �ϸ�  new �� �Ҽ�����.
	}
	// ���ο��� new �� �Ѵ�. 
	static private MySingleTon instance = new MySingleTon();
	// 
	static public MySingleTon getMySingleTon() {
		return instance;
	}
}

public class �̱������� {

	public static void main(String[] args) {
		//�̱��� �����̶� 
		//Ŭ������ ���ϳ��� ���������� ����Ѵ�.
		// (�ַ� �迭�� �������ִ� ManagerClass ��)
		
		// ===  ����¹� ===
		// 1) �����ڸ� private ���� ����� . �׷��� new ���Ҽ�����. 
		// 2) ���ο��� new �� �Ѵ�. static �ʿ�
		// 3) public �� get�Լ����� �����Ѵ�. static �ʿ�
		
//		MySingleTon test = new MySingleTon();// ����������.
		MySingleTon test = MySingleTon.getMySingleTon();
	}
}
