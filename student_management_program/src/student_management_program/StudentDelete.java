package student_management_program;

public class StudentDelete {
	private StudentDAO studentDAO;
	
	public StudentDelete(StudentDAO stDAO) {
		studentDAO = stDAO;
	}

	public void delete(Student student) {
		String id = student.getId();
		if(checkId(id)) {
			studentDAO.delete(student);
		}else {
			System.out.println("없는 계정 입니다");
		}
	}
	
	public boolean checkId(String id){
		Student student = studentDAO.select(id);
		return student == null? false:true;

	}
	
}
