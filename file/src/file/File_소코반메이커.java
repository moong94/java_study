package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class File_소코반메이커 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		final int SIZE = 9;
		final int PLAYER = 2;
		final int WALL = 3;
		final int BALL = 4;
		final int GOAL = 5;

		int pY = 0;
		int pX = 0;

		int[][] map = new int[SIZE][SIZE];
		int[][] maker = new int[SIZE][SIZE];

		String fileName = "maker.txt";

		maker[pY][pX] = PLAYER;

		while (true) {
			System.out.println("[1]소코반 메이커");
			System.out.println("[2]게임 시작하기");
			System.out.println("[0]종료하기");

			int choice = scan.nextInt();

			if (choice == 1) {

				while (true) {
					for (int i = 0; i < SIZE; i++) {
						for (int j = 0; j < SIZE; j++) {
							if (map[i][j] != 0 && maker[i][j] == PLAYER) {
								System.out.print("*\t");
							} else if (maker[i][j] == PLAYER) {
								System.out.print("옷\t");
							} else if (map[i][j] == WALL) {
								System.out.print("벽\t");
							} else if (map[i][j] == BALL) {
								System.out.print("공\t");
							} else if (map[i][j] == GOAL) {
								System.out.print("골\t");
							} else {
								System.out.print(map[i][j] + "\t");
							}
						}
						System.out.println("\n");
					}
					System.out.println();

					System.out.println("[이동] ▶  상(1)하(2)좌(3)우(4)");
					System.out.println("[설치] ▶ 벽(5)공(6)골(7) ");
					System.out.println("[종료] ▶ 0");

					int move = scan.nextInt();

					if (move == 1 || move == 2 || move == 3 || move == 4) {
						int yy = pY;
						int xx = pX;

						if (move == 1) {
							yy = yy - 1;
						} else if (move == 2) {
							yy = yy + 1;
						} else if (move == 3) {
							xx = xx - 1;
						} else if (move == 4) {
							xx = xx + 1;
						}

						if (SIZE <= yy || yy < 0)
							continue;
						if (SIZE <= xx || xx < 0)
							continue;

						maker[pY][pX] = 0;
						pY = yy;
						pX = xx;
						maker[pY][pX] = PLAYER;

					} else if (move == 5) {
						map[pY][pX] = WALL;
					} else if (move == 6) {
						map[pY][pX] = BALL;
					} else if (move == 7) {
						map[pY][pX] = GOAL;
					}

					// ---------------------------------------------------------------------------
					// 파일 저장하기
					String data = "";
					for (int i = 0; i < SIZE; i++) {
						for (int j = 0; j < SIZE; j++) {
							if (maker[i][j] == PLAYER) {
								data += PLAYER + " ";
							} else {
								data += map[i][j] + " ";
							}
						}
						if (i != SIZE - 1) {
							data += "\n";
						}
					}

					FileWriter fw = null;
					try {
						fw = new FileWriter(fileName);
						fw.write(data);
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						if (fw != null) {
							try {
								fw.close();
							} catch (IOException e) {
							}
						}
					}
					// ---------------------------------------------------------------------------
				}

			} else if (choice == 2) {
				// ---------------------------------------------------------------------------
				// 파일 불러오기
				String data = "";

				File file = new File(fileName);
				FileReader fr = null;
				BufferedReader br = null;

				if (file.exists()) {
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);

						while (true) {
							String line = br.readLine();
							if (line == null) {
								break;
							}

							data += line;
							data += "\n";
						}
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						if (fr != null) {
							try {
								fr.close();
							} catch (IOException e) {
							}
						}
						if (br != null) {
							try {
								br.close();
							} catch (IOException e) {
							}
						}
					}
				}
				if (data.equals(""))
					continue;

				String[] info = data.split("\n");
				for (int i = 0; i < info.length; i++) {

					String[] temp = info[i].split(" ");
					for (int j = 0; j < temp.length; j++) {
						map[i][j] = Integer.parseInt(temp[j]);
					}
				}
				// ---------------------------------------------------------------------------

				for (int i = 0; i < SIZE; i++) {
					for (int j = 0; j < SIZE; j++) {
						System.out.print(map[i][j] + "\t");
					}
					System.out.println("\n");
				}
				System.out.println();

			} else if (choice == 0) {
				break;
			}
		}
	}

}
