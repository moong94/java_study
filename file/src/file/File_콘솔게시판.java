package file;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class File_콘솔게시판 {

	public static void main(String[] args) {
		/*
		 * # 콘솔 게시판
		 * 1. [이전] 또는 [이후] 버튼을 누르면 페이지 번호가 변경된다.
		 * 2. 현재 페이지 번호에 해당되는 게시글만 볼 수 있다.
		 * 3. 2차원 배열 board에 0열에는 제목을 1열에는 게시글의 내용을 저장한다.
		 * 4. 게시글을 추가하고 삭제할 때마다 파일입출력을 통해 데이터가 바로바로 저장된다.
		 * 5. 실행시 저장되어 있는 파일이 존재한다면, 바로 파일을 불러오도록 설계한다.
		 */

			Scanner scan = new Scanner(System.in);
			
	        String fileName = "board.txt";

			String[][] board = null;
			int count = 0;				// 전체 게시글 수
			int pageSize = 5;			// 한 페이지에 보여줄 게시글 수
			int curPageNum = 1;			// 현재 페이지 번호
			int pageCount = 0;			// 전체 페이지 개수
			int startRow = 0;			// 현재 페이지의 게시글 시작 번호
			int endRow = 0;				// 현재 페이지의 게시글 마지막 번호
			
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
				
				System.out.println("게시판 (" + count + ")개");
				System.out.println("현재 페이지 : " + curPageNum + " Page / " + pageCount + " Pages");
				//시작번호
				startRow = ((curPageNum - 1) * pageSize) + 1;
				
				
				//끝번호
				endRow = count;
				
				for(int i = 0; i < pageSize; i++) {
					if((startRow + i - 1) >= count) {
						continue;
					}
					System.out.println((i + 1) + ") " + board[startRow + i - 1][0]);
				}
				
				
				System.out.println("[1]이전");
				System.out.println("[2]이후");
				System.out.println("[3]추가하기");
				System.out.println("[4]삭제하기");
				System.out.println("[5]내용확인");

				int choice = scan.nextInt();
				
				//이전
				if(choice == 1) {
					if(curPageNum == 1) {
						System.out.println("첫번 째 페이지 입니다.");
						continue;
					}
					else {
						curPageNum--;
					}
				}
				
				//이후
				else if(choice == 2) {
					if(curPageNum == pageCount) {
						System.out.println("마지막 페이지 입니다.");
						continue;
					}
					else {
						curPageNum++;
					}
				}
				
				//추가하기
				else if(choice == 3) {
					
					System.out.print("게시글 제목 입력 : ");
					String sub = scan.next();
					
					System.out.print("게시글 내용 입력 : ");
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
				
				//삭제하기
				else if(choice == 4) {
					
					
					System.out.print("삭제할 번호 입력 : ");
					int del = scan.nextInt();
					
					
					if(del < 1 || del > count) {
						System.out.println("번호 선택 오류");
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
				
				//내용확인
				else if(choice == 5) {
					System.out.print("확인할 내용 번호 입력 : ");
					int sel = scan.nextInt();
					
					System.out.println(sel + ") " + board[sel - 1][0]);
					System.out.println("내용 : "+ board[sel - 1][1]);
					
				}
			}

	}

}
