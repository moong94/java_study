package constructor;

class Product_ex{
	String name;
	int price;
	Product_ex(){
		name = "�ڽ�";
		price = 1000;
		System.out.println("�⺻������ ");
	}
	Product_ex(String n , int p){
		name = n; price = p;
	}
	
	void printProduct() {
		System.out.println(name + " : " + price);
	}
}
public class Class_Array_Constructor_Overloading {

	public static void main(String[] args) {
		// ������ �����ε� 
		// �����ڵ� �޼����̱⶧���� �����̸����� ������ ������ִ�.
		// �� �ٸ� �޼��� �� ���������� ���޵Ǵ� ���ڰ��� ���� �ٸ��� �ϸ�ȴ�.
		Product_ex p = new Product_ex(); // �̷��� �⺻������ȣ��
		p.printProduct();
		Product_ex p1 = new Product_ex("��ڽ�" , 2000); // �޼��� �����ε� 
		p1.printProduct();
	}

}
