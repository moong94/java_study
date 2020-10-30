package student_management_program;
import java.util.Scanner;
public class _MainController {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] ids = {"test" , "koreait" , "stst" , "jsp" };
		String[] names = {"�̸���" , "��ö��" ,"�̿���" , "���缮"};
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
			System.out.println("1.�߰� 2.���� 3.��� 4.��ü���");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("��ȣ�� �Է��ϼ���.");
				int num = scan.nextInt();
				System.out.println("���̵� �Է��ϼ���.");
				String id = scan.next();
				System.out.println("�̸��� �Է��ϼ���.");
				String name = scan.next();
				Student st = new Student(num , id ,name);
				stInsert.insert(st);			
			}
			else if(sel == 2) {
				System.out.println("���̵� �Է��ϼ���.");
				String id = scan.next();
				Student st = stDelete.delete(id);
			}
			else if(sel == 3) {
				System.out.println("���̵� �Է��ϼ���.");
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
