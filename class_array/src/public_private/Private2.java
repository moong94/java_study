package public_private;

class PrivateProduct{
	private String time;
	private String name;
	private int price;
	PrivateProduct(String time , String name , int price){
		this.time = time;
		this.name = name;
		this.price =price;
	}
	String getTime() {
		return time;
	}
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
	String getData() {
		return time + " " + name + " " + price;
	}
	
}

public class Private2 {

	public static void main(String[] args) {
		PrivateProduct test = new PrivateProduct("20200920" , "��ġ" , 1000);
		// private ���� �����⶧���� �ѹ�����ϸ� �������� �Ұ��ϴ�. ������ �������°͸� �����ϴ�.
		System.out.println(test.getData());
		
		//�Ұ���
//		test.time = "asdf";
//		public�� ������ ����
	}

}
