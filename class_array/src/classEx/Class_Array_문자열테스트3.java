package classEx;

class Member{
	int no;
	int point;
	String name;
	boolean best;
	
	void print() {
		System.out.print("�����ȣ : " + no + " �̸� : " + name + " point : " + point);
		if(best == true) {
			System.out.print("  \"������\"  ");
		}
		System.out.println();
	}
}

public class Class_Array_���ڿ��׽�Ʈ3 {

	public static void main(String[] args) {

		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/�̸���,1002/��ö��,1003/�Źξ�,1004/�ڻ��";
		
		// data1 �� �����ȣ�� �ǸŽ����̴�.
		// data2 �� �����ȣ�� �̸��̴�.
		// �ǸŽ����� 4�̻��λ���� best�� true�� �����ϼ���.
		
		// �������͸� �Ľ� �ؼ� Member Ŭ���� �迭�� �ϼ��� ����غ�����.
		Member[] memberList = null;
		
		String line1[] = data1.split(",");
		String line2[] = data2.split(",");
		
		memberList = new Member[line2.length];
		
		for(int i = 0; i < memberList.length; i++) {
			memberList[i] = new Member();
		}
		
		
		for(int i = 0; i < memberList.length; i++) {
			String tmp[] = line2[i].split("/");
			memberList[i].no = Integer.parseInt(tmp[0]);
			memberList[i].name = tmp[1];
		}
		
		for(int i = 0; i < line1.length; i++) {
			String tmp[] = line1[i].split("/");
			for(int j = 0; j < memberList.length; j++) {
				if(Integer.parseInt(tmp[0]) == memberList[j].no) {
					memberList[j].point += Integer.parseInt(tmp[1]);
				}
			}
		}
		
		for(int i = 0; i < memberList.length; i++) {
			if(memberList[i].point >= 4) {
				memberList[i].best = true;
			}
		}
		for(int i = 0; i < memberList.length; i++) {
			memberList[i].print();
			
		}
		
	}

}
