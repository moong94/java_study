package atm01_test;

public class Main {

	public static void main(String[] args) {
		
		Bank.instance.name = "Mega";
		BankManager.instance.play();
		
	}

}
