package class_array;

class Product{
	String name;
	int price;
}
public class Class_ArrayTheory1 {

	public static void main(String[] args) {
		// 3칸짜리 배열이 2개 필요하면 2차원배열을 사용한다. 		
		int [] arr = new int[3];
		int [][] darr = new int[2][3];
				
		//-------------------------------------------------
		// 마찬가지로 클래스도 배열로 필요하면 2차원배열처럼 만들어야한다. 
		Product pr = new Product();
		pr.name = "감자깡";
		pr.price = 1000;

		//-------------------------------------------------		
		Product [] prList = new Product[2];
		prList[0] = new Product();
		prList[1] = new Product();
			
		prList[0].price = 10;
		prList[1].price = 20;

		prList[0].name = "새우깡";
		prList[1].name = "고래밥";		
	}

}
