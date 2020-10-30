package student_management_program;

public class StudentDelete {
	private StudentDAO studentDAO;
	
	public StudentDelete(StudentDAO stDAO) {
		studentDAO = stDAO;
	}

	public Student delete(String id) {
		if(checkId(id)) {
			return studentDAO.delete(id);
		}else {
			System.out.println("정보가 없습니다.");
		}
		return null;
	}
	
	public boolean checkId(String id){
		Student student = studentDAO.select(id);
		return student == null? true:false;

	}
	
}
