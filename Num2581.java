package baekjoon;

import java.util.Scanner;

public class Num2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int cnt = 0, sum = 0, min = n;
		for(int i=m; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			
			if(cnt == 2) {
				sum += i;
				
				if(i < min) {
					min = i;
				}
			}
			cnt = 0;
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}