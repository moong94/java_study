package atm01;

import java.util.Random;
import java.util.Scanner;

public class UserManager {
	
	static UserManager instance = new UserManager();
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	static final int ACC_MAX_CNT = 3;			// �ִ� ���� ������ ���� ��
	User[] user = null;							// ��ü ȸ������
	int userCnt = 0;							// ��ü ȸ�� ��
	
	void setDummy() {
		String[] ids = {"qwer", "abcd", "javaking", "megait", "success"};
		String[] pws = {"1111", "2222",     "3333",   "4444",    "5555"};
		int[] mons   = { 87000,  12000,      49000,    34000,    128000};
		int[] accs   = { 12345,  23456,      78912,    89123,     91234};
		
		userCnt = 5;
		user = new User[userCnt];
		for(int i=0; i<userCnt; i++) {
			user[i] = new User();
			user[i].id = ids[i];
			user[i].pw = pws[i];
			user[i].acc[0] = new Account();
			user[i].acc[0].number = accs[i];
			user[i].acc[0].money = mons[i];
			user[i].accCnt += 1;
		}
	}
	
	void printAllUser() {
		for(int i=0; i<userCnt; i++) {
			System.out.print((i+1) + ".ID(" + user[i].id + ")\tPW(" + user[i].pw + ")\t");
			if(user[i].accCnt != 0) {
				for(int j=0; j<user[i].accCnt; j++) {
					System.out.print("(" + user[i].acc[j].number + ":" + user[i].acc[j].money + ")");
				}
			}
			System.out.println();
		}
	}
	
	boolean getCheckAcc(int account) {
		boolean result = false;
		for(int i=0; i<userCnt; i++) {
			for(int j=0; j<user[i].accCnt; j++) {
				if(account == user[i].acc[j].number) {
					result = true;
				}
			}
		}
		return result;
	}
	
	int logUser() {
		int log = -1;
		
		System.out.print("[�α���]���̵� �Է��ϼ��� : ");
		String id = scan.next();
		System.out.print("[�α���]�н����带 �Է��ϼ��� : ");
		String pw = scan.next();
		for(int i=0; i<UserManager.instance.userCnt; i++) {
			if(user[i].id.equals(id) && user[i].pw.equals(pw)) {
				log = i;
			}
		}
		
		return log;
	}
	
	boolean checkId(String id) {
		boolean result = false;
		for(int i=0; i<userCnt; i++) {
			if(user[i].id.equals(id)) {
				result = true;
			}
		}
		return result;
	}
	
	void joinMember() {
		
		System.out.print("[ȸ������]���̵� �Է��ϼ��� : ");
		String id = scan.next();
		System.out.print("[ȸ������]�н����带 �Է��ϼ��� : ");
		String pw = scan.next();
		
		boolean result = checkId(id);
		if(result) {
			System.out.println("[�޼���]���̵� �ߺ��˴ϴ�.");
			return;
		}
		
		if(userCnt == 0) {
			user = new User[userCnt + 1];
			user[userCnt] = new User();
		}else {
			User[] tmp = user;
			user = new User[userCnt + 1];
			user[userCnt] = new User();
			
			for(int i=0; i<userCnt; i++) {
				user[i] = tmp[i];
			}
			tmp = null;
		}
		user[userCnt].id = id;
		user[userCnt].pw = pw;
		
		userCnt += 1;
		System.out.println("[�޼���]ȸ�������� �����մϴ�.");
		
		FileManager.instance.save();
	}

	int deleteMember(int log) {
		User[] tmp = user;
		user = new User[userCnt - 1];
		
		int j = 0;
		for(int i=0; i<userCnt; i++) {
			if(i != log) {
				user[j] = tmp[i];
				j += 1;
			}
		}
		
		userCnt -= 1;
		tmp = null;
		log = -1;
		System.out.println("[�޼���]Ż��Ǿ����ϴ�.");
		FileManager.instance.save();
		return log;
	}
}











