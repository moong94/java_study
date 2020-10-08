package array_intensify;

public class ArrayEx03 {

	public static void main(String[] args) {
		/*
		 * # 달팽이
		 * 1	2	3	4	5	
		 * 16	17	18	19	6	
		 * 15	24	25	20	7	
		 * 14	23	22	21	8	
		 * 13	12	11	10	9
		 */
		//문제1) 위와 같이 출력해보세요 
		
		int snail[][] = new int [5][5];
		
//		00 01 02 03 04 
//		10 11 12 13 14
//		20 21 22 23 24
//		30 31 32 33 34
//		40 41 42 43 44
		
		int start_x = 0;
		int start_y = 0;
		
		int end_x = 4;
		int end_y = 4;
		
		int num = 1;
		
		int x = 0;
		int y = 0;
		
		while(true) {
		
			
			if(start_x == end_x && start_y == end_y) {
				snail[x][y] = num;
				break;
			}
			
			
			if(x == start_x && y == start_y) {
				for(int i = start_x; i < end_x; i++) {
					snail[y][x] = num;
					x++;
					num++;
				}
			}
			
			if(x == end_x && y == start_y) {
				for(int i = start_y; i < end_y; i++) {

					snail[y][x] = num;
					y++;
					num++;
				}
				
			}
			
			if(x == end_x && y == end_y) {
				for(int i = end_x; i > start_x; i--) {
					snail[y][x] = num;
					x--;
					num++;
				}
			}
			if(x == start_x  &&  y == end_y) {
				for(int i = end_y; i > start_y; i--) {
					snail[y][x] = num;
					y--;
					num++;
				}
			
				x++;
				y++;
				start_x++;
				start_y++;
				end_x--;
				end_y--;
			}
			
		}
		
		for(int i = 0 ; i < snail.length; i++) {
			for(int j = 0 ; j < snail[i].length; j++) {
				System.out.print(snail[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
