package student_management_program;
public class StudentInsert {
	private StudentDAO studentDAO;
	
	public StudentInsert(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}	
	public void insert(Student student) {
		String id = student.getId();
		if(checkId(id)) {
			studentDAO.insert(student);
		}else {
			System.out.println("�ߺ����̵� �Դϴ�");
		}
	}
	public boolean checkId(String id) {
		Student student = studentDAO.select(id);
		return student == null? true:false;
	}
}
