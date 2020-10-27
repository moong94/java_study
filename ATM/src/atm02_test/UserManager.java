package atm02_test;

public class UserManager {
	static UserManager instance = new UserManager();
	
	User[] userList;
	int userCount;
	
	void printAllUserInfo() {
		System.out.println("아이디\t패스워드\t계좌정보");
		for(int i = 0; i < userCount; i++) {
			userList[i].printUserInfo();
		}
		System.out.println("----------------------");
	}
	void setDummy() {
		userCount = 5;
		userList = new User[userCount];
		for(int i = 0; i < userCount; i++) {
			userList[i] = new User();
		}
		
		String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
		String[] b = {"l", "b", "c", "m", "e", "f", "g", "n", "i", "p", "k"};
		String[] c = {"s", "t", "u", "w", "v", "o", "x", "n", "q", "p", "r"};
		
		for(int i = 0; i < userCount; i++) {
			String id = "";
			int rNum = ATM.ran.nextInt(a.length);
			id += a[rNum];
			rNum = ATM.ran.nextInt(b.length);
			id += b[rNum];
			rNum = ATM.ran.nextInt(c.length);
			id += c[rNum];
			
			userList[i].id = id;
		}
		
		String[] d = {"1", "8", "9", "4"};
		String[] e = {"2", "7", "0", "6"};
		String[] f = {"5", "3", "2", "7"};
		
		for(int i = 0; i < userCount; i++) {
			String pw = "";
			int rNum = ATM.ran.nextInt(d.length);
			pw += d[rNum];
			rNum = ATM.ran.nextInt(e.length);
			pw += e[rNum];
			rNum = ATM.ran.nextInt(f.length);
			pw += f[rNum];
			
			userList[i].password = pw;
			
		}
		
		System.out.println("[메세지]더미 파일이 추가되었습니다.");
		printAllUserInfo();
	}
	
	int checkId(String id) {
		int check = -1;
		for(int i = 0; i < userCount; i++) {
			if(userList[i].id.equals(id)) {
				check = i;
			}
		}
		return check;
	}
	void joinUser() {
		System.out.print("[가입]아이디를 입력하세요 : ");
		String id = ATM.scan.next();
		
		int result = checkId(id);
		
		if(result != -1) {
			System.out.println("[메세지]아이디가 중복됩니다.");
			return;
		}
		
		System.out.print("[가입]패스워드를 입력하세요 : ");
		String password = ATM.scan.next();
		
		if(userCount == 0) {
			userList = new User[1];
			userList[0] = new User(id, password);
		}
		else if(userCount > 0) {
			User[] temp = userList;
			
			userList = new User[userCount + 1];
			for(int i = 0; i < userCount; i++) {
				userList[i] = temp[i];
			}
			
			userList[userCount] = new User(id, password);
			
			temp = null;
			
		}
		
		userCount++;
		System.out.println("[메세지]회원가입을 완료하였습니다.");
		
		FileManager.instance.saveData();
		
		printAllUserInfo();
		
		FileManager.instance.saveData();
	}
	
	void createAccount() {
		User loginUser = userList[ATM.log];
		int accCount = loginUser.accCount;
		
		if(accCount == 3) {
			System.out.println("[메세지]더 이상 계좌를 생성할 수 없습니다.");
			return;
		}
		
		if(accCount == 0) {
			loginUser.accList = new Account[accCount + 1];
		}
		else if(accCount > 0) {
			Account[] temp = loginUser.accList;
			
			loginUser.accList = new Account[accCount + 1];
			
			for(int i = 0; i < accCount; i++) {
				loginUser.accList[i] = temp[i];
			}
			temp = null;
		}
		loginUser.accList[accCount] = new Account();
		
		int rNum = ATM.ran.nextInt(10000) + 1;
		loginUser.accList[accCount].number = rNum + "";
		loginUser.accList[accCount].money = 1000;
		
		accCount = accCount + 1;
		loginUser.accCount = accCount;
		System.out.println("[메세지]계좌가 생성되었습니다.");
		
		FileManager.instance.saveData();
	}
	
	int showAccList(String msg) {
		int loginAccIndex = -1;
		
		User temp = userList[ATM.log];
		int accCount = temp.accCount;
		
		if(accCount > 0) {
			for(int i = 0; i < accCount; i++) {
				System.out.println("[" + (i + 1) + "]" + temp.accList[i].number);
			}
			
			System.out.print("[" + msg + "]" + "계좌를 선택하세요 : ");
			loginAccIndex = ATM.scan.nextInt();
			loginAccIndex = loginAccIndex - 1;
		}
		
		return loginAccIndex;
	}
	void income() {
		int loginAccIndex = showAccList("입금");
		if(loginAccIndex == -1) {
			System.out.println("[메세지]계좌를 먼저 생성해주세요.");
			return;
		}
		
		System.out.print("[입금]금액을 입력하세요 : ");
		int money = ATM.scan.nextInt();
		
		userList[ATM.log].accList[loginAccIndex].money += money;
		System.out.println("[메세지]입금을 완료하였습니다.");
		
		FileManager.instance.saveData();
	}
	
	void withdraw() {
		int loginAccIndex = showAccList("출금");
		if(loginAccIndex == -1) {
			System.out.println("[메세지]계좌를 먼저 생성해주세요.");
			return;
		}
		
		System.out.print("[출금]금액을 입력하세요 : ");
		int money = ATM.scan.nextInt();
		
		if(userList[ATM.log].accList[loginAccIndex].money < money) {
			System.out.println("[메세지]잔액이 부족합니다.");
			return;
		}
		
		userList[ATM.log].accList[loginAccIndex].money -= money;
		System.out.println("[메세지]출금을 완료하였습니다.");
		
		FileManager.instance.saveData();
	}
	
	void transfer() {
		int loginAccIndex = showAccList("이체");
		if(loginAccIndex == -1) {
			System.out.println("[메세지]계좌를 먼저 생성해주세요.");
			return;
		}
		
		System.out.print("[이체]계좌번호를 입력하세요 : ");
		String transAccount = ATM.scan.next();
		
		int transUserIndex = checkAcc(transAccount);
		if(transUserIndex == -1) {
			System.out.println("[메세지]계좌번호를 확인해주세요.");
			return;
		}
		
		int transAccIndex = getAcc(transUserIndex, transAccount);
		
		System.out.print("[이체]금액을 입력하세요 : ");
		int money = ATM.scan.nextInt();
		
		if(money > userList[ATM.log].accList[loginAccIndex].money) {
			System.out.println("[메세지]계좌 잔액이 부족합니다.");
			return;
		}
		
		userList[ATM.log].accList[loginAccIndex].money -= money;
		userList[transUserIndex].accList[transAccIndex].money += money;
		System.out.println("[메세지]이체를 완료하였습니다.");
		
		FileManager.instance.saveData();
	}
	
	int checkAcc(String transAccount) {
		int check = -1;
		
		for(int i = 0; i < userList.length; i++) {
			if(userList[i].accList != null) {
				for(int j = 0; j < userList[i].accCount; j++) {
					if(transAccount.equals(userList[i].accList[j].number)) {
						check = i;
					}
				}
			}
		}
		return check;
	}
	
	int getAcc(int transUserIndex, String transAccount) {
		int accIndex = 0;
		
		for(int i = 0; i < userList[transUserIndex].accCount; i++) {
			if(transAccount.equals(userList[transUserIndex].accList[i].number)) {
				accIndex = i;
			}
		}
		
		return accIndex;
	}
	
	void lookupAcc() {
		userList[ATM.log].printUserInfo();
	}
	
	void deleteAcc() {
		int loginAccIndex = showAccList("삭제");
		if(loginAccIndex == -1) {
			System.out.println("[메세지]계좌를 먼저 생성해주세요.");
			return;
		}
		
		User temp = userList[ATM.log];
		int accCount = temp.accCount;
		
		if(accCount == 1) {
			temp.accList = null;
		}
		else if(accCount > 1) {
			Account[] acc = temp.accList;
			
			temp.accList = new Account[accCount - 1];
			
			int j = 0;
			for(int i = 0; i < accCount; i++) {
				if(i != loginAccIndex) {
					temp.accList[j] = acc[i];
					j++;
				}
			}
			
			acc = null;
		}
		
		accCount--;
		
		temp.accCount = accCount;
		System.out.println("[메세지]계좌삭제를 완료하였습니다.");
		
		FileManager.instance.saveData();
	}
	
	void leave() {
		if(userCount == 1) {
			userList = null;
		}
		else if(userCount > 1) {
			User[] temp = userList;
			
			userList = new User[userCount - 1];
			
			int j = 0;
			for(int i = 0; i < userCount; i++) {
				if(i != ATM.log) {
					userList[j] = temp[i];
					j++;
				}
			}
			
		}
		userCount--;
		
		ATM.log = -1;
		System.out.println("[메세지]탈퇴되었습니다.");
		
		FileManager.instance.saveData();
	}
}
