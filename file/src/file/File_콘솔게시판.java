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
				
				pageCount = ((count - 1) / pageSize) + 1;
				
				System.out.println("�Խ��� (" + count + ")��");
				System.out.println("���� ������ : " + curPageNum + " Page / " + pageCount + " Pages");
				//���۹�ȣ
				startRow = ((curPageNum - 1) * pageSize) + 1;
				
				
				//����ȣ
				endRow = count;
				
				for(int i = 0; i < pageSize; i++) {
					if((startRow + i - 1) >= count) {
						continue;
					}
					System.out.println((i + 1) + ") " + board[startRow + i - 1][0]);
				}
				
				
				System.out.println("[1]����");
				System.out.println("[2]����");
				System.out.println("[3]�߰��ϱ�");
				System.out.println("[4]�����ϱ�");
				System.out.println("[5]����Ȯ��");

				int choice = scan.nextInt();
				
				//����
				if(choice == 1) {
					if(curPageNum == 1) {
						System.out.println("ù�� ° ������ �Դϴ�.");
						continue;
					}
					else {
						curPageNum--;
					}
				}
				
				//����
				else if(choice == 2) {
					if(curPageNum == pageCount) {
						System.out.println("������ ������ �Դϴ�.");
						continue;
					}
					else {
						curPageNum++;
					}
				}
				
				//�߰��ϱ�
				else if(choice == 3) {
					
					System.out.print("�Խñ� ���� �Է� : ");
					String sub = scan.next();
					
					System.out.print("�Խñ� ���� �Է� : ");
					String text = scan.next();
					
					String tmp[][] = board;
					
					board = new String[count+1][2];
					
					for(int i = 0; i < count; i++) {
						board[i][0] = tmp[i][0];
						board[i][1] = tmp[i][1];
					}
					
					board[count][0] = sub;
					board[count][1] = text;
					count++;
					
					String data = "";
					data += count + "\n";
					
					for(int i = 0; i < count; i++) {
						data += board[i][0] + "/" + board[i][1] + "\n";
					}
					
					data = data.substring(0,data.length() - 1);
					
					try {
						fw = new FileWriter(file);
						
						fw.write(data);						
						fw.close();
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					
					
				}
				
				//�����ϱ�
				else if(choice == 4) {
					
					
					System.out.print("������ ��ȣ �Է� : ");
					int del = scan.nextInt();
					
					
					if(del < 1 || del > count) {
						System.out.println("��ȣ ���� ����");
						continue;
					}
					
					String tmp[][] = board;
					
					board = new String[count - 1][2];
					
					int j = 0;
					
					for(int i = 0; i < tmp.length; i++) {
						if(i == (del - 1)) {
							continue;
						}
						board[j][0] = tmp[i][0];
						board[j][1] = tmp[i][1];
						j++;
					}
					count--;
					
					String data = "";
					data += count + "\n";
					
					for(int i = 0; i < board.length; i++) {
						data += board[i][0] + "/" + board[i][1] + "\n";
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
				
				//����Ȯ��
				else if(choice == 5) {
					System.out.print("Ȯ���� ���� ��ȣ �Է� : ");
					int sel = scan.nextInt();
					
					System.out.println(sel + ") " + board[sel - 1][0]);
					System.out.println("���� : "+ board[sel - 1][1]);
					
				}
			}

	}

}
