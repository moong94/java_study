package atm01;

public class User {
	String id = "";											// ���̵�
	String pw = "";											// ��й�ȣ
	
	Account[] acc = new Account[UserManager.ACC_MAX_CNT];	// ��������
	int accCnt = 0;											// ���� ���� ���� ��
}


