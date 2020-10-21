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
		PrivateProduct test = new PrivateProduct("20200920" , "김치" , 1000);
		// private 으로 막혔기때문에 한번등록하면 값변조가 불가하다. 오로지 가져오는것만 가능하다.
		System.out.println(test.getData());
		
		//불가능
//		test.time = "asdf";
//		public이 없으면 가능
	}

}
