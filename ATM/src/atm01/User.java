package atm01;

public class User {
	String id = "";											// 아이디
	String pw = "";											// 비밀번호
	
	Account[] acc = new Account[UserManager.ACC_MAX_CNT];	// 계좌정보
	int accCnt = 0;											// 개인 보유 계좌 수
}


