package classEx;

import java.util.Scanner;

class Ex05{	
	String name = "성적조회";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}

public class ClassEx03 {

	public static void main(String[] args) {
		
		Ex05 mega = new Ex05();
		
		while(true) {
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
		
			Scanner scan = new Scanner(System.in);
		
			System.out.print("입력 : ");
			int input = scan.nextInt();
		
			
			//전교생 성적확인
			if(input == 1) {
				for(int i = 0; i < mega.arHakbun.length; i++) {
					System.out.println("학번 : " + mega.arHakbun[i] + ", 성적 : " + mega.arScore[i]);
				}
			}
		
			//1등 성적확인
			else if(input == 2) {
				int max = 0;
				int maxidx = -1;
				for(int i = 0 ; i < mega.arScore.length; i++) {
					if(max < mega.arScore[i]) {
						max = mega.arScore[i];
						maxidx = i;
					}
				}
				System.out.println("1등 : " + mega.arHakbun[maxidx] + ", 성적 : " + max);
			}
			
			//꼴등학생 성적확인
			else if(input == 3) {
				int min = mega.arScore[0];
				int minidx = -1;
				for(int i = 0 ; i < mega.arScore.length; i++) {
					if(min > mega.arScore[i]) {
						min = mega.arScore[i];
						minidx = i;
					}
				}
				System.out.println("꼴등 : " + mega.arHakbun[minidx] + ", 성적 : " + min);
			
			}
		
			//성적확인하기
			else if(input == 4) {
				System.out.print("학번 입력 : ");
				int inputHakbun = scan.nextInt();
				
				int check = -1;
				for(int i = 0; i < mega.arHakbun.length; i++) {
					if(inputHakbun == mega.arHakbun[i]) {
						System.out.println(mega.arHakbun[i] + "의 성적 : " + mega.arScore[i]);
						check = 0;
					}
				}
				if(check == -1) {
					System.out.println("학번입력 오류");
					continue;
				}
			
			}
		
			//종료하기
			else if(input == 5) {
				break;
			
			}
		}
		
		
	}

}
