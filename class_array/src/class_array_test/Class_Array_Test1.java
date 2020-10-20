package class_array_test;

class Member{
	int no;
	int point;
	String name;
	boolean best;
	void print() {
		System.out.print("�����ȣ : " + no + " �̸� : " + name + " �ǸŽ��� : " + point);
		if(best) {
			System.out.print(" ������ ");
		}
		System.out.println();
	}
	
}

public class Class_Array_Test1 {

	public static void main(String[] arg) {
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/�̸���,1002/��ö��,1003/�Źξ�,1004/�ڻ��";
		
		// data1 �� �����ȣ�� �ǸŽ����̴�.
		// data2 �� �����ȣ�� �̸��̴�.
		// �ǸŽ����� 4�̻��λ���� best�� true�� �����ϼ���.
		
		// �������͸� �Ľ� �ؼ� Member Ŭ���� �迭�� �ϼ��� ����غ�����.
		Member[] memberList = null;
		
		String no_point[] = data1.split(",");
		String no_name[] = data2.split(",");
		
		memberList = new Member[no_name.length];
		
		for(int i = 0; i < memberList.length; i++) {
			String tmp[] = no_name[i].split("/");
			memberList[i] = new Member();
			
			memberList[i].no = Integer.parseInt(tmp[0]);
			memberList[i].name = tmp[1];	
		}
		
		for(int i =0; i < memberList.length; i++) {
			for(int j = 0; j < no_point.length; j++) {
				String tmp[] = no_point[j].split("/");
				
				if(memberList[i].no == Integer.parseInt(tmp[0])) {
					memberList[i].point += Integer.parseInt(tmp[1]);
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
