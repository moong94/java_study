package atm01_test;

import java.util.Scanner;
import java.util.Random;

public class AccountManager {
	
	static AccountManager instance = new AccountManager();
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
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
			account = ran.nextInt(900000) + 100000;
			result = UserManager.instance.getCheckAcc(account);
		}
		UserManager.instance.user[log].acc[cnt].number = account;
		UserManager.instance.user[log].accCnt++;
	}
	
	void deleteAcc(int log) {
		int cnt = UserManager.instance.user[log].accCnt;
		
		if(cnt == 0) {
			System.out.println("[메세지]더 이상 삭제할 계좌가 없습니다.");
			return;
		}
		System.out.print("[계좌 삭제]삭제할 계좌 입력 : ");
		int acc = scan.nextInt();
		int check = -1;
		for(int i = 0; i < cnt; i++) {
			if(UserManager.instance.user[log].acc[i].number == acc) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("[메세지]계좌 입력 오류.");
			return;
		}
		else {
			Account temp[] = UserManager.instance.user[log].acc;
			int j = 0;
			for(int i = 0; i < UserManager.instance.user[log].accCnt; i++) {
				if(i == check) {
					i++;
				}
				else {
					UserManager.instance.user[log].acc[j] = new Account();
					UserManager.instance.user[log].acc[j].number = temp[i].number;
					UserManager.instance.user[log].acc[j].money = temp[i].money;
					j++;
				}
			}
			UserManager.instance.user[log].accCnt--;
			System.out.println("계좌 삭제 완료.");
		}
	}
	
	void printAcc(int log) {
		User temp = UserManager.instance.user[log];
		System.out.println("ID : " + temp.id);
		System.out.println("PW : " + temp.pw);
		for(int i = 0; i < temp.accCnt; i++) {
			System.out.println(temp.acc[i].number + " : " + temp.acc[i].money);
		}
	}

}
