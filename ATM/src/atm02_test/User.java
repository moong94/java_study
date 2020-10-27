package atm02_test;

public class User {
	String id;
	String password;
	Account[] accList;
	int accCount;
	
	public User() {
		
	}
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	public User(String id, String password, Account[] accList, int accCount) {
		this.id = id;
		this.password = password;
		this.accList = accList;
		this.accCount = accCount;
		
	}
	
	void printUserInfo() {
		if(accCount == 0) {
			System.out.println(id + "\t" + password + "\t계좌를 개설해주세요.");
		}
		else if(accCount > 0) {
			System.out.print(id + "\t" + password + "\t");
			for(int i = 0; i < accCount; i++) {
				System.out.print(accList[i].number + "/" + accList[i].money + "원/");
			}
			System.out.println();
		}
	}

}
