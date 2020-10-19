package class_array;

import java.util.Scanner;


public class Class_Array_�л��߰���Ʈ�ѷ� {

	public static void main(String[] args) {
		Student[] st = new Student[3];

		Scanner scan = new Scanner(System.in);
	
		// # �л� �߰� ���� ��Ʈ�ѷ�
		//   => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
		//   ��ö�� : ����3�� ���� 50 ����50 ���� 60 
		//   �̸��� : ����2�� ���� 20 ���� 30 
		//   �̿��� : ����1�� ���� 100

		int count = 0; // �л� ��

		while (true) {
			System.out.println("[1]�л� �߰��ϱ�"); // �̸� �Է¹޾� �߰�
			System.out.println("[2]���� �߰��ϱ�"); // �̸��� ���� �Է¹޾� �߰�
			System.out.println("[3]���� �߰��ϱ�"); // �̸��� ���� �׸��� ���� �Է¹޾� �߰�

			int choice = scan.nextInt();
			
			//�л� �߰�
			if (choice == 1) {
				
				if(count == 3) {
					System.out.println("�л��� ���̻� �߰��� �� �����ϴ�.");
					continue;
				}
				else {
					
					System.out.print("�л� �̸� �Է� : ");
					String student = scan.next();
				
					st[count] = new Student();
					st[count].name = student;
					count++;
				}
			} 
			
			//���� �߰�
			else if (choice == 2) {
				int check = -1;
				
				System.out.print("�л� �̸� �Է� :");
				String student = scan.next();
				
				for(int i = 0; i < count; i++) {
					if(st[i].name.equals(student)) {
						check = i;
					}
				}
				
				if(check == -1){
					System.out.println("���� �̸��Դϴ�.");
					continue;
				}
				
				else {
					System.out.print("�߰��� ���� �Է� : ");
					String subject = scan.next();
					
					if(st[check].subjects == null) {
						st[check].subjects = new Subject[1];
						st[check].subjects[0] = new Subject();
						
						st[check].subjects[0].name = subject;
					}
					else {
						int size = st[check].subjects.length;
						
						Subject tmp[] = st[check].subjects;
						
						
						st[check].subjects = new Subject[size + 1];
						st[check].subjects[size] = new Subject();
						
						for(int i = 0; i < size; i++) {
							st[check].subjects[i] = tmp[i];
						}
						int sub_check = -1;
						
						
						for(int i = 0; i < size; i++) {
							if(st[check].subjects[i].name.equals(subject)) {
								sub_check = i;
							}
						}
						
						if(sub_check == -1) {
							st[check].subjects[size].name = subject;
						}
						else {
							System.out.println("�̹� �߰� �� �����Դϴ�.");
							continue;
						}
					}	
				}
			} 
			
			//���� �߰�
			else if (choice == 3) {
				int check = -1;
				
				System.out.print("�л� �̸� �Է� :");
				String student = scan.next();
				
				for(int i = 0; i < count; i++) {
					if(st[i].name.equals(student)) {
						check = i;
					}
				}
				
				if(check == -1){
					System.out.println("���� �̸��Դϴ�.");
					continue;
				}
				else {
					System.out.print("���� �Է� : ");
					String subject = scan.next();
					
					int sub_check = -1;
					
					for(int i = 0; i < st[check].subjects.length; i++) {
						if(st[check].subjects[i].name.equals(subject)) {
							sub_check = i;
						}
					}
					
					if(sub_check == -1) {
						System.out.println("���� �Է� ����");
						continue;
					}
					else {
						System.out.print("���� �Է� : ");
						int score = scan.nextInt();
						
						st[check].subjects[sub_check].score = score;
						
						for(int i = 0 ; i < count; i++) {
							if(st[i].subjects == null) {
								System.out.print(st[i].name + " : ���� 0��");
							}
							else {
								System.out.print(st[i].name + " : ����" + st[i].subjects.length + "�� ");
								for(int j = 0; j < st[i].subjects.length; j++) {
									System.out.print(st[i].subjects[j].name + " " + st[i].subjects[j].score + "�� ");
								}
							}
							System.out.println();
						}
						
					}
				}
			}
			
		}
		
		
	}

}
