package string;

import java.sql.Date;

public class StringEx06 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 30세
		
		String year = jumin.substring(0,2);
		
		int age = Integer.parseInt(year);
		System.out.println((2020 - age - 1899) + "세" );
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		char sex = jumin.charAt(7);
		
		if(sex == '1' || sex == '3') {
			System.out.println("남성");
		}
		else if(sex == '2' || sex == '4') {
			System.out.println("여성");
		}
	}

}
