package baekjoon;

import java.util.Scanner;

public class Num2523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int up = 1;
		int down = n-1;
		
		while(true) {
			if(up <= n) {
				for(int i=0; i<up; i++) {
					System.out.print("*");
				}
				System.out.println();
				up++;
			}
			
			else if(down>0 && down<n) {
				for(int i=down; i>0; i--) {
					System.out.print("*");
				}
				System.out.println();
				down--;
			}
			
			else {
				break;
			}
		}
	}
}