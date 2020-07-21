package algorithm;

import java.util.Scanner;

public class Main {
	
	static int n, k;
	
	public static int getCnt(int n) {
		int cnt = 0;
		while(n > 0) {
			if(n % 2 == 1) cnt++;
			n /= 2;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		int x = n;
		
		while(true) {
			if(getCnt(x) <= k) break;
			else x++;
		}
		
		System.out.println(x - n);
	}
}
