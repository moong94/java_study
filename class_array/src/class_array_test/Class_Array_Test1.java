package class_array_test;

class Member{
	int no;
	int point;
	String name;
	boolean best;
	void print() {
		System.out.print("사원번호 : " + no + " 이름 : " + name + " 판매실적 : " + point);
		if(best) {
			System.out.print(" 우수사원 ");
		}
		System.out.println();
	}
	
}

public class Class_Array_Test1 {

	public static void main(String[] arg) {
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/이만수,1002/김철수,1003/신민아,1004/박상아";
		
		// data1 은 사원번호와 판매실적이다.
		// data2 는 사원번호와 이름이다.
		// 판매실적이 4이상인사원은 best를 true로 저장하세요.
		
		// 위데이터를 파싱 해서 Member 클래스 배열을 완성후 출력해보세요.
		Member[] memberList = null;
		
		String no_point[] = data1.split(",");
		String no_name[] = data2.split(",");
		
		memberList = new Member[no_name.length];
		
		for(int i = 0; i < memberList.length; i++) {
			String tmp[] = no_name[i].split("/");
			memberList[i] = new Member();
			
			memberList[i].no = Integer.parseInt(tmp[0]);
			memberList[i].name = tmp[1];	
		}
		
		for(int i =0; i < memberList.length; i++) {
			for(int j = 0; j < no_point.length; j++) {
				String tmp[] = no_point[j].split("/");
				
				if(memberList[i].no == Integer.parseInt(tmp[0])) {
					memberList[i].point += Integer.parseInt(tmp[1]);
				}
				
			}
		}
		
		for(int i = 0; i < memberList.length; i++) {
			if(memberList[i].point >= 4) {
				memberList[i].best = true;
			}
		}
		for(int i = 0; i < memberList.length; i++) {
			memberList[i].print();
		}
		
	}
}
