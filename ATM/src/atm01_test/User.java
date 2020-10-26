package atm01_test;

public class User {
	String id = "";
	String pw = "";
	
	Account[] acc = new Account[UserManager.ACC_MAX_CNT];
	//인당 계좌 세 개 까지
	
	
	int accCnt = 0;

}
