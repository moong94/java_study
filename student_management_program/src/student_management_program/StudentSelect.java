package student_management_program;

public class StudentSelect {
	
	private StudentDAO studentDAO;
	public StudentSelect(StudentDAO stDAO) {
		studentDAO = stDAO;
	}
	public Student select(String id) {
		if(checkId(id)) {
			return studentDAO.select(id);
		}else {
			System.out.println("������ �����ϴ�.");
		}
		return null;
	}
	public boolean checkId(String id) {
		Student student = studentDAO.select(id);
		return student != null? true:false;
	}
}
