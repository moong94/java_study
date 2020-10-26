package atm01;

import java.util.Random;
import java.util.Scanner;

public class AccountManager {

	static AccountManager instance = new AccountManager();
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	// 계좌번호 랜덤 생성(중복금지)
	void createAcc(int log) {
		
		int cnt = UserManager.instance.user[log].accCnt;
		
		if(cnt == 3) {
			System.out.println("[메세지]계좌개설은 3개까지만 가능합니다.");
			return;
		}
		
		UserManager.instance.user[log].acc[cnt] = new Account();
		
		boolean result = true;
		int account = 0;
		while(result) {
			account = ran.nextInt(900000) + 100000;		// [0 ~ 89999] + 10000
			result = UserManager.instance.getCheckAcc(account);
		}
		UserManager.instance.user[log].acc[cnt].number = account;
		UserManager.instance.user[log].accCnt += 1;
	}
	
	// 계좌조회
	void printAcc(int log) {
		User temp = UserManager.instance.user[log];
		System.out.println("ID : " + temp.id);
		System.out.println("PW : " + temp.pw);
		for(int i=0; i<temp.accCnt; i++) {
			System.out.println(temp.acc[i].number + " : " + temp.acc[i].money);
		}
	}
	
}
