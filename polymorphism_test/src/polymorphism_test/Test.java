package polymorphism_test;

import java.util.Vector;
class User{
	public String id;
	public String pw;
	
}
class UserManager{
	public Vector<User> userList;
}

class Teacher extends User{
	public Vector<String> subjectList =  null;
	
	public void printSubject() {
		for(int i = 0; i < subjectList.size(); i++) {
			System.out.println(subjectList.get(i) + " ");
		}
		System.out.println();
	}
}
class Student extends User{
	public Vector<String> subjectList;
	public int point = 10;
	
	public void printSubject() {
		for(int i = 0; i < subjectList.size(); i++) {
			System.out.println(subjectList.get(i) + " ");
		}
		System.out.println();
	}
}

public class Test {

	public static void main(String[] args) {
		
		// ������û ������ 
		String data = "";
		data += "6\n"; // ���ο��� 
		data += "admin,admin,4,java,cpp,python,jsp\n"; // �������̵�,������й�ȣ,�����,�����,�����,�����,�����
		data += "st1,st1,2,java,cpp\n";  			   //�л�1���̵�,�л�1��й�ȣ,�����,�����������
		data += "st2,st2,2,cpp,python\n";  			   //�л�2���̵�,�л�2��й�ȣ,�����,�������� �����
		data += "st3,st3,1,java\n";		 			   //�л�3���̵�,�л�3��й�ȣ,�����,�������� �����
		data += "st4,st4,1,cpp\n";		 			   //�л�4���̵�,�л�4��й�ȣ,�����,�������� �����
		data += "st5,st5,3,java,python,cpp";	  	   //�л�5���̵�,�л�5��й�ȣ,�����,�������� �����
		System.out.println(data);
		// ���� Ŭ�������� ��Ʈ�� �����������̴� (��������)
		// ����1) �� �����͸� split() �ؼ�  ������ �����͸� ���� Ŭ������ ������ ��� ������ ��� 
		// ����� userManager ���� userList ��  
		// ������ ������ StudentŬ���� ���� subjectList , Teacher Ŭ����  ���� subjectList �� ���� 
		UserManager um = new UserManager();
		um.userList = new Vector<User>();
		
		Teacher teacher = new Teacher();
		teacher.subjectList = new Vector<String>();
		
		Student student = new Student();
		
		String line[] = data.split("\n");
		for(int i = 1; i < line.length; i++) {
			String str[] = line[i].split(",");
			User user = new User();
			user.id = str[0];
			user.pw = str[1];
			um.userList.add(user);
			
			if(i == 1) {
				for(int j = 3; j < str.length; j++) {
					teacher.subjectList.add(str[j]);
				}
			}
			else {
				for(int j = 3; j < str.length; j++) {
					if(str[0].equals(user.id))
					student.subjectList = new Vector<String>();
					student.subjectList.add(str[j]);
				}
			}
			
		}
		
		
		student.printSubject();
		
		// ����2) �л��� �������ִ� ������ �� 10���̴� ���� �л��� ���� ������� ������ �������ִ� �������� ��� (�Ѱ���� 3��)
		// ��) st1�� 2�������⶧���� 6���� �ҿ�ǰ� 4���� ����	
		
		// ����3) st3�� �߰���  python �� jsp�� ��û�ߴ� �����  �Ʒ� �� ���� String ���� ��ȯ �� ��� 
		//  ��)  st3���� �л������Ͱ� �����Ǿ��ִ�. 
		/*
		String data = "";
		data += "6\n"; // ���ο��� 
		data += "admin,admin,4,java,cpp,python,jsp\n"; // �������̵�,������й�ȣ,�����,�����,�����,�����,�����
		data += "st1,st1,2,java,cpp\n";  			   //�л�1���̵�,�л�1��й�ȣ,�����,�����������
		data += "st2,st2,2,cpp,python\n";  			   //�л�2���̵�,�л�2��й�ȣ,�����,�������� �����
		data += "st3,st3,3,java,python,jsp\n";		  //�л�3���̵�,�л�3��й�ȣ,�����,�������� �����
		data += "st4,st4,1,cpp\n";		 			   //�л�4���̵�,�л�4��й�ȣ,�����,�������� �����
		data += "st5,st5,3,java,python,cpp";	  	   //�л�5���̵�,�л�5��й�ȣ,�����,�������� �����
		*/	
		
		
	}

}
