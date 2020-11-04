package polymorphism_test;

import java.util.Vector;

class User{
	public String id;
	public String pw;
	public String[] sub;
	
}
class UserManager{
	public Vector<User> userList = new Vector<User>();
	
	public void printUser() {
		for(int i = 0; i < userList.size(); i++) {
			System.out.print(userList.get(i).id + " ");
		}
		System.out.println();
	}
}

class Teacher extends User{
	public Vector<String> subjectList = new Vector<String>();
	
	public void printSubject() {
		for(int i = 0; i < subjectList.size(); i++) {
			System.out.print(subjectList.get(i) + " ");
		}
		System.out.println();
	}
}
class Student extends User{
	public Vector<String> subjectList = new Vector<String>();
	public int point = 10;
	
	public void printSubject() {
		for(int i = 0; i < subjectList.size(); i++) {
			System.out.print(subjectList.get(i) + " ");
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
		
		String line[] = data.split("\n");

		User userList[] = new User[Integer.parseInt(line[0])];
		Teacher teacher = new Teacher();	
		Student student = new Student();
		
		for(int i = 1; i < line.length; i++) {
			String str[] = line[i].split(",");
			userList[i - 1] = new User();
			
			userList[i - 1].id = str[0];
			userList[i - 1].pw = str[1];
			userList[i - 1].sub = new String[Integer.parseInt(str[2])];
			
			for(int j = 0; j < userList[i - 1].sub.length; j++) {
				userList[i - 1].sub[j] = str[j + 3];
			}
			um.userList.add(userList[i - 1]);
			
			if(i == 1) {
				for(int j = 3; j < str.length; j++) {
					userList[0] = teacher;
					teacher.subjectList.add(str[j]);
				}
			}
			else {
				for(int j = 3; j < str.length; j++) {
					userList[i - 1] = student;
					student.subjectList.add(str[j]);
				}
			}
			
		}
		
		System.out.println();
		um.printUser();
		teacher.printSubject();
		student.printSubject();
		System.out.println();
		
		// ����2) �л��� �������ִ� ������ �� 10���̴� ���� �л��� ���� ������� ������ �������ִ� �������� ��� (�Ѱ���� 3��)
		// ��) st1�� 2�������⶧���� 6���� �ҿ�ǰ� 4���� ����	
		
		for(int i = 0; i < userList.length - 1; i++) {
			int rest = student.point - um.userList.get(i +  1).sub.length * 3;
			
			System.out.println(um.userList.get(i + 1).id + "�л� ���� ���� : " + rest);
			
		}
		System.out.println();
		
		
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
		String s = um.userList.get(3).sub[0];
		um.userList.get(3).sub = new String[3];
		um.userList.get(3).sub[0] = s;
		um.userList.get(3).sub[1] = "python";
		um.userList.get(3).sub[2] = "jsp";
		
		
		String newData = "";
		newData += um.userList.size() + "\n";
		for(int i = 0; i < um.userList.size(); i++) {
			newData += um.userList.get(i).id + ",";
			newData += um.userList.get(i).pw + ",";
			newData += um.userList.get(i).sub.length + ",";
			for(int j = 0; j < um.userList.get(i).sub.length; j++) {
				newData += um.userList.get(i).sub[j];
				if(j == um.userList.get(i).sub.length -1) {
					if(i != um.userList.size() - 1) {
						newData += "\n";
					}
				}
				else {
					newData += ",";
				}
			}
		}
		
		System.out.print(newData);
		
	}

}
