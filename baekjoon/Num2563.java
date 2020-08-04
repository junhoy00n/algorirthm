package baekjoon;

import java.util.Scanner;

public class Num2563 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = 0;
		int y = 0;
		int[][] all = new int[101][101];
		int[][] square = new int[n+1][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				square[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			x = square[i][0];
			y = square[i][1];
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					all[j][k] = 1;
				}
			}
		}
		
		int cnt = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(all[i][j] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
