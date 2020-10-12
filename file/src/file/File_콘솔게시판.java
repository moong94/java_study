package file;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class File_�ְܼԽ��� {

	public static void main(String[] args) {
		/*
		 * # �ܼ� �Խ���
		 * 1. [����] �Ǵ� [����] ��ư�� ������ ������ ��ȣ�� ����ȴ�.
		 * 2. ���� ������ ��ȣ�� �ش�Ǵ� �Խñ۸� �� �� �ִ�.
		 * 3. 2���� �迭 board�� 0������ ������ 1������ �Խñ��� ������ �����Ѵ�.
		 * 4. �Խñ��� �߰��ϰ� ������ ������ ����������� ���� �����Ͱ� �ٷιٷ� ����ȴ�.
		 * 5. ����� ����Ǿ� �ִ� ������ �����Ѵٸ�, �ٷ� ������ �ҷ������� �����Ѵ�.
		 */

			Scanner scan = new Scanner(System.in);
			
	        String fileName = "board.txt";

			String[][] board = null;
			int count = 0;				// ��ü �Խñ� ��
			int pageSize = 5;			// �� �������� ������ �Խñ� ��
			int curPageNum = 1;			// ���� ������ ��ȣ
			int pageCount = 0;			// ��ü ������ ����
			int startRow = 0;			// ���� �������� �Խñ� ���� ��ȣ
			int endRow = 0;				// ���� �������� �Խñ� ������ ��ȣ
			
			File file = new File(fileName);
			FileWriter fw = null;
			
			FileReader fr = null;
			BufferedReader br = null;
			
			if(file.exists()) {
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					
					count = Integer.parseInt(br.readLine());
					
					String data = "";
					for(int i = 0 ; i < count; i++) {
						data += br.readLine();
						if(i != count - 1) {
							data += "\n";
						}
					}
					
					if(count > 0) {
						
						board = new String[count][2];
						
						String[] info = data.split("\n");
						
						for(int i = 0; i < count; i++) {
							String tmp[] = info[i].split("/");
							board[i][0] = tmp[0];
							board[i][1] = tmp[1];
						}
						
					}
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			
			while(true) {
				
				System.out.println("�Խ��� (" + count + "��");
				System.out.println("���� ������ : " + curPageNum);
				
				System.out.println("[1]����");
				System.out.println("[2]����");
				System.out.println("[3]�߰��ϱ�");
				System.out.println("[4]�����ϱ�");
				System.out.println("[5]����Ȯ��");

				int choice = scan.nextInt();
				
				//����
				if(choice == 1) {
					
				}
				
				//����
				else if(choice == 2) {
					
				}
				
				//�߰��ϱ�
				else if(choice == 3) {
					System.out.print("�Խñ� ���� �Է� : ");
					String sub = scan.next();
					
					System.out.print("�Խñ� ���� �Է� : ");
					String data = scan.next();
					
					board[count][0] = sub;
					board[count][1] = data;
					count++;
					
					try {
						fw = new FileWriter(file);
						
						fw.write(count);
						for(int i = 0; i < count; i++) {
							fw.write(sub + "/" + data);
							}
						
						fw.close();
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					
					
				}
				
				//�����ϱ�
				else if(choice == 4) {
					
				}
				
				//����Ȯ��
				else if(choice == 5) {}
			}

	}

}
