package file;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileEx07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size = 5;		//���� ���� & ��й�ȣ ���� �ִ� 5��
		int count = 0;		//����Ǿ��ִ� ���� ����
		int log = -1;		//�α��� ���� ��ġ
		
		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];
		
		String fileName = "ATM.txt";
		
		while(true) {
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]ȸ������");
			System.out.println("[2]ȸ��Ż��");
			System.out.println("[3]�α���");
			System.out.println("[4]�α׾ƿ�");
			System.out.println("[5]�Ա�");
			System.out.println("[6]���");
			System.out.println("[7]��ü");
			System.out.println("[8]�ܾ���ȸ");
			System.out.println("[9]����");
			System.out.println("[10]�ε�");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			//ȸ������(5�̻� ���Ұ�)
			if(sel == 1) {
				
				int opt = -1;
				
				while(true) {
					//ȸ������ ���̵� �ʰ�
					if(count == 5) {
						System.out.println("�� �̻� ȸ�������� �� �� �����ϴ�.");
						continue;
					}
						System.out.print("������ ���̵� : ");
						String inputacc = scan.next();
					
						for(int i = 0; i < count; i++) {
							if(inputacc.equals(accs[i])) {
								opt = 1;
							}
						}
					if(opt == 1) {
						System.out.println("�̹� ������� ���̵� �Դϴ�.");
						break;
					}
						else {
						System.out.println("��й�ȣ �Է� : ");
						String inputpw = scan.next();
					
						accs[count] = inputacc;
						pws[count] = inputpw;
						count++;
						System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
						break;
					}
				}
				
			}
			
			//ȸ��Ż��(���� ������ ��� �Ұ�)
			else if(sel == 2) {
				
				int opt = -1;
				
				while(true) {
					//Ż���� ���̵� ���� ��
					if(count == 0) {
						System.out.println("������ ������ �����ϴ�.");
						break;
					}
					System.out.print("Ż���� ���̵� �Է� : ");
					String inputdelacc = scan.next();
					
					for(int i = 0; i < count; i++) {
						if(inputdelacc.equals(accs[i])) {
							opt = i;
						}
					}
					
					if(opt == -1) {
						System.out.println("���� �����Դϴ�.");
						break;
					}
					
					System.out.print("Ż���� ������ ��й�ȣ �Է� : ");
					String inputdelpw = scan.next();
					
					if(inputdelpw.equals(pws[opt])) {
						
						System.out.println(accs[opt] + "������ �����Ǿ����ϴ�.");
						
						String[] tmpac = accs;
						accs = new String[count];
						String[] tmppw = pws;
						pws = new String[count];
						int[] tmpmoney = moneys;
						moneys = new int[count];
						
						int j = 0;
						
						for(int i = 0; i < count; i++) {
							if(i == opt) {
								continue;
							}
							accs[j] = tmpac[i];
							pws[j] = tmppw[i];
							moneys[j] = tmpmoney[i];
							j++;
						}
						
						count--;
						break;
					}
					else {
						System.out.println("��й�ȣ�� Ʋ���ϴ�.");
						break;
					}
				
				}
			}
			
			//�α���(log -1�϶���)
			else if(sel == 3) {
				
				while(true) {
					
					int opt = -1;
				
					if(log != -1) {
						System.out.println("�α��� �� �̿��ϼ���.");
						break;
					}
					System.out.print("�α��� �� ���̵� �Է� : ");
					String logacc = scan.next();
					
					if(count == 0) {
						System.out.println("�α��� �Ұ�");
						break;
					}
					for(int i = 0; i < count; i++) {
						if(logacc.equals(accs[i])) {
							opt = i;
						}
					}
					
					if(opt == -1) {
						System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
						break;
					}
					
					System.out.print(accs[opt] + "��й�ȣ �Է� : ");
					String logpw = scan.next();
					
					if(logpw.equals(pws[opt])) {
						System.out.println("�α��� �Ǿ����ϴ�.");
						log = opt;
						break;
					}
					else {
						System.out.println("��й�ȣ�� Ʋ���ϴ�.");
						break;
					}
				}
			}
			
			//�α׾ƿ�(log -1�� �ƴ� ����)
			else if(sel == 4) {
				while(true) {
					if(log == -1) {
						System.out.println("�α��� �� ����ϼ���.");
						break;
					}
					
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					log = -1;
					break;
				}
				
			}
			
			//�Ա�(�α��� ���¿�����)
			else if(sel == 5) {
				while(true) {
					if(log == -1) {
						System.out.println("�α��� �� ����ϼ���.");
						break;
					}
					
					System.out.print("�Ա� �� �ݾ� �Է� : ");
					int inputmoney = scan.nextInt();
					
					moneys[log] += inputmoney;
					
					System.out.println(inputmoney + "�� �ԱݵǾ����ϴ�.");
					System.out.println("�ܾ� : " + moneys[log]);
					break;
				}
			}
			
			//���(�α��� ���¿�����)
			else if(sel == 6) {
				while(true) {
					if(log == -1) {
						System.out.println("�α��� �� ����ϼ���.");
						break;
					}
					
					System.out.print("����� �ݾ� �Է� : ");
					int outputmoney = scan.nextInt();
					
					if(moneys[log] < outputmoney) {
						System.out.println("�ѵ��ʰ��Դϴ�.");
						break;
					}
					
					System.out.println(outputmoney + "�� ��ݵǾ����ϴ�.");
					moneys[log] -= outputmoney;
					System.out.println("�ܾ� : " + moneys[log]);
					break;
				}
				
			}
			
			//��ü(�α��� ���¿�����)
			else if(sel == 7) {
				while(true) {
					
					int opt = -1;
					
					if(log == -1) {
						System.out.println("�α��� �� ����ϼ���.");
						break;
					}
					
					System.out.print("��ü�� ���� �Է� : ");
					String aacc = scan.next();
					
					for(int i = 0; i < count; i++) {
						if(aacc.equals(accs[i])) {
							opt = i;
						}
					}
					
					if(opt == -1) {
						System.out.println("���� �����Դϴ�.");
						break;
					}
					
					System.out.print("��ü�� �ݾ� �Է� : ");
					int amoney = scan.nextInt();
					
					if(moneys[log] < amoney) {
						System.out.println("�ѵ� �ʰ� �Դϴ�.");
						break;
					}
					
					moneys[log] -= amoney;
					moneys[opt] += amoney;
					
					System.out.println(accs[opt] + "�������� " + amoney + "�� ��ü�Ǿ����ϴ�.");
					System.out.println("�ܾ� : " + moneys[log]);
					break;
					
				}
				
			}
			
			//�ܾ� ��ȸ(�α��� ���¿�����)
			else if(sel == 8) {
				while(true) {
					if(log == -1) {
						System.out.println("�α��� �� ��� �����մϴ�.");
						break;
					}
					
					System.out.println("�ܾ� : " + moneys[log]);
					break;
				}
				
			}
			
			//����(��� ���� & ��й�ȣ & �ܾ�)
			else if(sel == 9) {
				
				if(count == 0) {
					System.out.println("������ ���� �����ϴ�.");
					continue;
				}
				
				FileWriter fw = null;
				
				String data = "";
				
				for(int i = 0; i < count; i++) {
					data += accs[i] + "/" + pws[i] + "/" + String.valueOf(moneys[i]) + "\n";
				}
				
				data = data.substring(0, data.length() - 1);
				
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
			}
			
			//�ε�(��� ���� & ��й�ȣ & �ܾ�)
			else if(sel == 10) {
				File file = new File(fileName);
				FileReader fr = null;
				BufferedReader br = null;
				
				String data = "";
				
				if(file.exists()) {
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
						
						data = data.substring(0, data.length() -1);
						System.out.println(data);
						
						fr.close();
						br.close();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
				else {
					System.out.println("�ε��� ������ �����ϴ�.");
					continue;
				}
				
			}
			
			//����
			else if(sel == 0) {
				System.out.println("�����մϴ�.");
				break;
			}
			
		}
	}

}
