package method;

class Student{
	int hakbun;
	int score;
	void print() {
		System.out.println(hakbun + " " + score);
	}
}

class StudentManager{
	// 1) 리턴사용하지않고 학생저장 
	Student student;	
	void setStudentValue1( int x, int  y) { 
		student = new Student();
		student.hakbun = x;
		student.score = y;
	}
	// 2) 리턴사용해서 학생저장 (별차이없다)
	Student setStudentValue2(int x , int y) {
		
		Student st =new Student();
		st.hakbun = x;
		st.score = y;
		return st;
	}
}

public class MethodReturnTheory06 {

	public static void main(String[] args) {

		StudentManager mng = new StudentManager();
		mng.setStudentValue1(10001, 30);
		mng.student.print();
		System.out.println("------------------------");	
		Student st = mng.setStudentValue2(10001, 30);
		st.print();
		
	}

}
