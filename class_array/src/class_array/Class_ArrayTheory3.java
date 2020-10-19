package class_array;

class Member{
	String name;
	int num;
}
class MemberManager{
	Member[] memberList =new Member[3];
}

public class Class_ArrayTheory3 {

	public static void main(String[] args) {
		MemberManager mg = new MemberManager();	
		Member m1 = new Member();
		mg.memberList[0] = m1;
		m1.name = "±èÃ¶¼ö";
		m1.num = 1001;
		m1 = new Member();
		mg.memberList[1] = m1;
		m1.name = "ÀÌ¸¸¼ö";
		m1.num = 1002;
		m1 = new Member();
		mg.memberList[2] = m1;
		m1.name = "¹Ú¿µÈñ";
		m1.num = 1003;
		Member temp = mg.memberList[0];
		System.out.println(temp.name);
		
		temp = mg.memberList[1];
		System.out.println(temp.name);
		
		temp = mg.memberList[2];
		System.out.println(temp.name);
	}

}
