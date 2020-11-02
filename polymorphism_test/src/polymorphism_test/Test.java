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
		
		// 수강신청 데이터 
		String data = "";
		data += "6\n"; // 총인원수 
		data += "admin,admin,4,java,cpp,python,jsp\n"; // 교수아이디,교수비밀번호,과목수,과목명,과목명,과목명,과목명
		data += "st1,st1,2,java,cpp\n";  			   //학생1아이디,학생1비밀번호,과목수,나머지과목명
		data += "st2,st2,2,cpp,python\n";  			   //학생2아이디,학생2비밀번호,과목수,나머지는 과목명
		data += "st3,st3,1,java\n";		 			   //학생3아이디,학생3비밀번호,과목수,나머지는 과목명
		data += "st4,st4,1,cpp\n";		 			   //학생4아이디,학생4비밀번호,과목수,나머지는 과목명
		data += "st5,st5,3,java,python,cpp";	  	   //학생5아이디,학생5비밀번호,과목수,나머지는 과목명
		System.out.println(data);
		// 위에 클래스들은 힌트로 만들어놓은것이다 (수정가능)
		// 문제1) 위 데이터를 split() 해서  각각의 데이터를 전부 클래스에 저장후 모든 데이터 출력 
		// 사람은 userManager 안의 userList 에  
		// 각각의 과목은 Student클래스 안의 subjectList , Teacher 클래스  안의 subjectList 에 저장 
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
		
		// 문제2) 학생이 들을수있는 학점은 총 10점이다 각각 학생이 들은 과목수를 제외한 들을수있는 남은학점 출력 (한과목당 3점)
		// 예) st1은 2과목들었기때문에 6점이 소요되고 4점이 남음	
		
		// 문제3) st3은 추가로  python 과 jsp를 신청했다 결과를  아래 와 같이 String 으로 변환 후 출력 
		//  예)  st3번의 학생데이터가 수정되어있다. 
		/*
		String data = "";
		data += "6\n"; // 총인원수 
		data += "admin,admin,4,java,cpp,python,jsp\n"; // 교수아이디,교수비밀번호,과목수,과목명,과목명,과목명,과목명
		data += "st1,st1,2,java,cpp\n";  			   //학생1아이디,학생1비밀번호,과목수,나머지과목명
		data += "st2,st2,2,cpp,python\n";  			   //학생2아이디,학생2비밀번호,과목수,나머지는 과목명
		data += "st3,st3,3,java,python,jsp\n";		  //학생3아이디,학생3비밀번호,과목수,나머지는 과목명
		data += "st4,st4,1,cpp\n";		 			   //학생4아이디,학생4비밀번호,과목수,나머지는 과목명
		data += "st5,st5,3,java,python,cpp";	  	   //학생5아이디,학생5비밀번호,과목수,나머지는 과목명
		*/	
		
		
	}

}
