package method;

class Data{
	int result;
}
class Calc{
	void plus(Data data , int a , int b) {
		data.result = a + b;
	}
	void minus(Data data , int a , int b) {
		data.result = a - b;
	}
}

public class MethodTheory07 {

	public static void main(String[] arg) {
		
		Data data = new Data();		
		Calc calc = new Calc();	
		
		// data �� new Data() �� �ּҰ� ����ֱ⶧���� �����ϴ�. 
		calc.plus(data, 10, 3);
		System.out.println(data.result);		
		calc.minus(data, 10, 3);
		System.out.println(data.result);
	}
}
