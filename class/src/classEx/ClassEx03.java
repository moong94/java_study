package classEx;

import java.util.Scanner;

class Ex05{	
	String name = "������ȸ";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}

public class ClassEx03 {

	public static void main(String[] args) {
		
		Ex05 mega = new Ex05();
		
		while(true) {
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
		
			Scanner scan = new Scanner(System.in);
		
			System.out.print("�Է� : ");
			int input = scan.nextInt();
		
			
			//������ ����Ȯ��
			if(input == 1) {
				for(int i = 0; i < mega.arHakbun.length; i++) {
					System.out.println("�й� : " + mega.arHakbun[i] + ", ���� : " + mega.arScore[i]);
				}
			}
		
			//1�� ����Ȯ��
			else if(input == 2) {
				int max = 0;
				int maxidx = -1;
				for(int i = 0 ; i < mega.arScore.length; i++) {
					if(max < mega.arScore[i]) {
						max = mega.arScore[i];
						maxidx = i;
					}
				}
				System.out.println("1�� : " + mega.arHakbun[maxidx] + ", ���� : " + max);
			}
			
			//�õ��л� ����Ȯ��
			else if(input == 3) {
				int min = mega.arScore[0];
				int minidx = -1;
				for(int i = 0 ; i < mega.arScore.length; i++) {
					if(min > mega.arScore[i]) {
						min = mega.arScore[i];
						minidx = i;
					}
				}
				System.out.println("�õ� : " + mega.arHakbun[minidx] + ", ���� : " + min);
			
			}
		
			//����Ȯ���ϱ�
			else if(input == 4) {
				System.out.print("�й� �Է� : ");
				int inputHakbun = scan.nextInt();
				
				int check = -1;
				for(int i = 0; i < mega.arHakbun.length; i++) {
					if(inputHakbun == mega.arHakbun[i]) {
						System.out.println(mega.arHakbun[i] + "�� ���� : " + mega.arScore[i]);
						check = 0;
					}
				}
				if(check == -1) {
					System.out.println("�й��Է� ����");
					continue;
				}
			
			}
		
			//�����ϱ�
			else if(input == 5) {
				break;
			
			}
		}
		
		
	}

}
