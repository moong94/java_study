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
		int[][] jang = new int[MAX_SIZE][3];

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
					System.out.println("�α��� �� �̿��ϼ���.");
					continue;
				}
				
				for(int i = 0; i < items.length; i++) {
					System.out.println((i + 1) + ". " + items[i]);
				}
				System.out.print("������ ��ǰ : ");
				int itemnum = scan.nextInt();
				
				if(itemnum < 1 || itemnum > 3) {
					System.out.println("���� ��ǰ��ȣ �Դϴ�..");
					continue;
				}
				else {
					for(int i = 0; i < 3; i++) {
						if(i == (itemnum - 1)) {
							jang[count][i] = (log + 1);
						}
						else {
							jang[count][i] = 0;
						}
					}
					count++;
					continue;
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
					for(int j = 0; j < ids.length; j++) {
						if(jang[i][j] == (log + 1)) {
							System.out.print(opt + ". ");
							if(j == 0) {
								System.out.println("���");
							}
							else if(j == 1) {
								System.out.println("�ٳ���");
							}
							else if(j == 2) {
								System.out.println("����");
							}
							opt++;
						}
						else {
							continue;
						}
					}
				}
			}
			
			//����
			else if (sel == 5) {
				FileWriter fw = null;
				
				String data = "";
				
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < count; j++) {
						
						if(jang[j][i] == 0) {
							continue;
						}
						
						if(jang[j][i] == 1) {
							data += "qwer : ";
							if( == 1 ) {
								data += "���\n";
							}
							else if(jang[j][i] == 1) {
								data += "��� : ";
							}
						}
						else if(i == 1) {
							data += "javaking : ";
						}
						else if(i == 2) {
							data += "abcd : ";
						}
					}
					data += "\n";
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
			else if (sel == 6) {
				
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < count; j++) {
						System.out.print(jang[j][i]);
					}
					System.out.println();
				}
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
