package classes;

class Ex02 {
	String name;
	int score;
}

public class ClassTeory2 {

	public static void main(String[] args) {
		Ex02 hgd = new Ex02();
		hgd.name = "ȫ�浿";
		hgd.score = 100;

		System.out.println(hgd.score);

		// ���� ��Ű�� ���� Ŭ������ �ٸ� Ŭ�������� ����� �����ϴ�.
		Ex01 e = new Ex01();
		e.x = 10;
		e.y = 20;
	}

}
