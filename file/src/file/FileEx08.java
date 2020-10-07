package file;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;

public class FileEx08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		String[] items = { "���", "�ٳ���", "����" };

		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		String fileName = "jang.txt";

		int count = 0;
		int log = -1;

		while (true) {

			System.out.println("[MEGA SHOP]");
			System.out.println("[1]�α���");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]����");
			System.out.println("[4]��ٱ���");
			System.out.println("[5]����");
			System.out.println("[6]�ε�");
			System.out.println("[0]����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			//�α���
			if (sel == 1) {
				
				int opt = -1;
				
				if(log != -1) {
					System.out.println("�α׾ƿ� �� ����ϼ���.");
					continue;
				}
				
				System.out.print("�α��� ���̵� �Է� : ");
				String logid = scan.next();
				
				for(int i = 0; i < ids.length; i++) {
					if(logid.equals(ids[i])) {
						opt = i;
					}
				}
				
				if(opt == -1) {
					System.out.println("���� ���̵� �Դϴ�.");
					continue;
				}
				
				System.out.print("��й�ȣ �Է� : ");
				String logpw = scan.next();
				
				if(logpw.equals(pws[opt])) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					log = opt;
					continue;
				}
				else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�.");
					continue;
				}
				
			}
			
			//�α׾ƿ�
			else if (sel == 2) {
				if(log == -1) {
					System.out.println("�α��� �� ����ϼ���.");
					continue;
				}
				else {
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					log = -1;
				}
			}
			
			//����
			else if (sel == 3) {
				if(log == -1) {
					System.out.println("�α��� �� ����ϼ���.");
					continue;
				}
				
				System.out.print("1. ��� \n2. �ٳ���\n3. ����\n���� : ");
				int choice = scan.nextInt();
				
				if(choice < 1 || choice > 3) {
					System.out.println("�Է¿���");
					continue;
				}
				else {
					jang[count][0] = log;
					jang[count][1] = choice;
					count++;
				}
				
			}
			
			//��ٱ���
			else if (sel == 4) {
				
				if(log == -1) {
					System.out.println("�α��� �� �̿��ϼ���.");
					continue;
				}
				
				int opt = 1;
				
				System.out.println(ids[log] + "�� ��ٱ���");
				
				for(int i = 0; i < count; i++) {
					if(jang[i][0] == log) {
						System.out.print(opt + ". ");
						if(jang[i][1] == 1) {
							System.out.println("���");
						}
						else if(jang[i][1] == 2) {
							System.out.println("�ٳ���");
						}
						else if(jang[i][1] == 3) {
							System.out.println("����");
						}
						opt++;
					}
					else {
						continue;
					}
				}
			}
			
			//����
			else if (sel == 5) {
//				jang[count][0] = log;
//				jang[count][1] = choice;
				
				FileWriter fw = null;
				
				String data1 = "qwer : ";
				String data2 = "javaking : ";
				String data3 = "abcd : ";
				String data = "";
				
				for(int i = 0; i < jang.length; i++) {
					if(jang[i][0] == 0) {
						if(jang[i][1] == 1) {
							data1 += "���/";
						}
						else if(jang[i][1] == 2) {
							data1 += "�ٳ���/";
						}
						else if(jang[i][1] == 3) {
							data1 += "����/";
						}
					}
					else if(jang[i][0] == 1) {
						if(jang[i][1] == 1) {
							data2 += "���/";
						}
						else if(jang[i][1] == 2) {
							data2 += "�ٳ���/";
						}
						else if(jang[i][1] == 3) {
							data2 += "����/";
						}
					}
					else if(jang[i][0] == 2) {
						if(jang[i][1] == 1) {
							data3 += "���/";
						}
						else if(jang[i][1] == 2) {
							data3 += "�ٳ���/";
						}
						else if(jang[i][1] == 3) {
							data3 += "����/";
						}
					}
					
				}
				data1 = data1.substring(0, data1.length() - 1);
				data2 = data2.substring(0, data2.length() - 1);
				data3 = data3.substring(0, data3.length() - 1);
				
				data += data1 + "\n" + data2 + "\n" + data3;
				
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
			else if (sel == 6) {
				
				File file = new File(fileName);
				FileReader fr = null;
				BufferedReader br = null;
				
				String data = "";
				
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					
					while(true) {
					String line = br.readLine();
						if(line == null) {
							break;
						}
						data += line + "\n";
					}
					
					System.out.println(data);
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
			//����
			else if (sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}

		}
	}

}
