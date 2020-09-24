package array;

import java.util.Scanner;

public class ArrayEx42 {

	public static void main(String[] args) {
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
			int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
			
			int[] floor = new int[3];
			
			// 문제 1) 각층별 관리비 합 출력
			// 정답 1) 4400, 7100, 5400
			for(int i = 0; i < pay.length; i++) {
				for(int j = 0; j < pay[i].length; j++) {
					floor[i] += pay[i][j];
				}
			}
			
			for(int i = 0; i < floor.length; i++) {
				System.out.print(floor[i] + " ");
			}
			
			System.out.println();
			
			// 문제 2) 호를 입력하면 관리비 출력
			// 예    2) 입력 : 202	관리비 출력 : 2000
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("입력 : ");
			int input = scan.nextInt();
			
			int x = 0;
			int y = 0;
			
			for(int i = 0; i < apt.length; i++) {
				for(int j = 0; j < apt[i].length; j++) {
					if(apt[i][j] == input) {
						x = i;
						y = j;
					}
				}
			}
			System.out.println("관리비 출력 : " + pay[x][y]);
			
			
			// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
			// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
			
			int min = pay[0][0];
			int minx = 0;
			int miny = 0;
			
			int max = 0;
			int maxx = 0;
			int maxy = 0;
			
			for(int i = 0; i < pay.length; i++) {
				for(int j = 0; j < pay[i].length; j++) {
					if(max < pay[i][j]) {
						max = pay[i][j];
						maxx = i;
						maxy = j;
					}
					if(min > pay[i][j]) {
						min = pay[i][j];
						minx = i;
						miny = j;
					}
				}
			}
			System.out.println("가장 많이 나온 집(" + apt[maxx][maxy] + "), 가장 적게 나온 집(" + apt[minx][miny] + ")");
			
			// 문제 4) 호 2개를 입력하면 관리비 교체
			System.out.print("입력1 : ");
			int input1 = scan.nextInt();
			
			int input1x = 0;
			int input1y = 0;
			
			System.out.print("입력2 : ");
			int input2 = scan.nextInt();
			
			int input2x = 0;
			int input2y = 0;
			
			int tmp = 0;
			
			for(int i = 0; i < apt.length; i++) {
				for(int j = 0; j < apt[i].length; j++) {
					if(input1 == apt[i][j]) {
						input1x = i;
						input1y = j;
					}
					if(input2 == apt[i][j]) {
						input2x = i;
						input2y = j;
					}
				}
			}
			
			tmp = pay[input1x][input1y];
			pay[input1x][input1y] = pay[input2x][input2y];
			pay[input2x][input2y] = tmp;
			
			for(int i = 0; i < pay.length; i++) {
				for(int j = 0; j < pay[i].length; j++) {
					System.out.print(pay[i][j] + " ");
				}
				System.out.println();
			}

	}

}
