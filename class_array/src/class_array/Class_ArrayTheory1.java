package class_array;

class Product{
	String name;
	int price;
}
public class Class_ArrayTheory1 {

	public static void main(String[] args) {
		// 3ĭ¥�� �迭�� 2�� �ʿ��ϸ� 2�����迭�� ����Ѵ�. 		
		int [] arr = new int[3];
		int [][] darr = new int[2][3];
				
		//-------------------------------------------------
		// ���������� Ŭ������ �迭�� �ʿ��ϸ� 2�����迭ó�� �������Ѵ�. 
		Product pr = new Product();
		pr.name = "���ڱ�";
		pr.price = 1000;

		//-------------------------------------------------		
		Product [] prList = new Product[2];
		prList[0] = new Product();
		prList[1] = new Product();
			
		prList[0].price = 10;
		prList[1].price = 20;

		prList[0].name = "�����";
		prList[1].name = "����";		
	}

}
