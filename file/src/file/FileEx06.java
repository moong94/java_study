package file;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileEx06 {

	public static void main(String[] args) {
		
		// # ���� ��Ʈ�ѷ�[1�ܰ�] : ����

		Scanner scan = new Scanner(System.in);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		int[] vector = null;
		int count = 0;
		
		String fileName = "vector.txt";
		
		while(true) {
			
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰��ϱ�");
			System.out.println("[2]�����ϱ�");
			System.out.println("[3]�����ϱ�");
			System.out.println("[4]�ε��ϱ�");
			System.out.println("[5]�����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			//�߰�
			if(sel == 1) {
				if(count == 0) {
					vector = new int[count + 1];
				}
				else if(count > 0) {
					int[] tmp = vector;
					vector = new int[count + 1];
					
					for(int i = 0; i < count; i++) {
						vector[i] = tmp[i];
					}
					tmp = null;
				}
				System.out.print("������ �Է� : ");
				int input = scan.nextInt();
				
				vector[count] = input;
				count++;
				
				for(int i = 0; i < vector.length; i++) {
					System.out.print(vector[i] + " ");
						
				}
				
			}
			
			//����
			else if(sel == 2) {
				
				int opt = -1;
				
				if(count == 0) {
					System.out.println("������ �����Ͱ� �����ϴ�.");
					continue;
				}
				else {
					System.out.print("������ ������ �Է� : ");
					int delnum = scan.nextInt();
					
					for(int i = 0; i < count; i++) {
						if(vector[i] == delnum) {
							opt = i;
						}
					}
					if(opt == -1) {
						System.out.println("�Է��� �����ʹ� ���� ������ �Դϴ�.");
						continue;
					}
					else if(opt == 0 && count == 1) {
						vector = null;
						count--;
						continue;
					}
					else {
						int tmp2[] = vector;
						vector = new int[count - 1];
						for(int i = 0; i < opt; i++) {
							vector[i] = tmp2[i];
						}
						for(int i = opt; i < count - 1; i++) {
							vector[i] = tmp2[i + 1];
						}
						count--;
					}
					
				}
				for(int i = 0; i < vector.length; i++) {
					System.out.print(vector[i] + " ");
				}
			}
			
			//����
			else if(sel == 3) {
				FileWriter fw = null;
				
				String data = "";
				
				if(count == 0) {
					System.out.println("������ �����Ͱ� �����ϴ�.");
					continue;
				}
				
				for(int i = 0; i < count; i++) {
					data += vector[i] + " ";
				}
				data = data.substring(0, data.length() - 1);
				
				try {
					fw = new FileWriter(fileName);
					
					fw.write(data);
					fw.close();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			//�ε�
			else if(sel == 4) {}
			
			//����
			else if(sel == 5) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}

	}

}
