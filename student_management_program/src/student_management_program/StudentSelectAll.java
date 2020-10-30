package student_management_program;

import java.util.Iterator;
import java.util.Map;

public class StudentSelectAll {
	
	private StudentDAO studentDAO;
	public StudentSelectAll(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	public Map<String , Student> allSelect(){
		return studentDAO.getStudentDB();
	}
	
	public void printAll() {
		Map<String , Student> map = studentDAO.getStudentDB();
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			map.get(key).print();
		}
	}
}
