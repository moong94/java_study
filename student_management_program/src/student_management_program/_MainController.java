package student_management_program;
import java.util.Scanner;
public class _MainController {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] ids = {"test" , "koreait" , "stst" , "jsp" };
		String[] names = {"이만수" , "김철수" ,"이영희" , "유재석"};
		int [] nums = {1001, 1002, 1003 , 1004};
		
		StudentController controller = new StudentController();		
		StudentInsert stInsert = controller.getInsert();	
		StudentDelete stDelete = controller.getDelete();
		
		for(int i = 0; i < ids.length; i++) {
			Student st = new Student(nums[i] , ids[i] , names[i]);
			stInsert.insert(st);
		}	
		boolean run = true;
		while(run) {
			System.out.println("1.추가 2.삭제 3.출력 4.전체출력");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("번호를 입력하세요.");
				int num = scan.nextInt();
				System.out.println("아이디를 입력하세요.");
				String id = scan.next();
				System.out.println("이름을 입력하세요.");
				String name = scan.next();
				Student st = new Student(num , id ,name);
				stInsert.insert(st);			
			}
			else if(sel == 2) {
				System.out.println("아이디를 입력하세요.");
				String id = scan.next();
				Student st = stDelete.delete(id);
			}
			else if(sel == 3) {
				System.out.println("아이디를 입력하세요.");
				String id = scan.next();
				StudentSelect stSelect = controller.getSelect();
				Student st = stSelect.select(id);
				if(st != null) st.print();
			}
			else if(sel == 4) {
				StudentSelectAll stAll = controller.getSelectAll();
				stAll.printAll();
			}
		}
			
	}

}
