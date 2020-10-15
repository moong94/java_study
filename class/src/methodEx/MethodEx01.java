package methodEx;

class Test1 {
	void printEvenOrOdd(int x) {
		if(x % 2 == 0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
	}
	void sumBetweenValues(int x, int y) {
		
		int sum = 0;
		
		for(int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	void printPrimeNums(int primeNumber) {
		for(int i = 2; i <= primeNumber; i++) {
			int primeCounter = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					primeCounter++;
				}
			}
			if(primeCounter == 0) {
				System.out.print(i + " ");
			}
			
		}
		
	}
}

public class MethodEx01 {

	public static void main(String[] args) {
		Test1 test = new Test1();
		// ���� 1) a �� Ȧ������ ¦������ ��� 
		int a = 19;
		test.printEvenOrOdd(a);

		// ���� 2) x���� y������ ���� ����ϴ� �޼���
		int x = 1;
		int y = 10;
		test.sumBetweenValues(x, y);

		// ����3) ���� 1���� ���ڷ� ����ؼ� 2���� ���ڱ�����  �Ҽ� ���� ��� 
		int primeNumber = 20;
		test.printPrimeNums(primeNumber);
	}

}
