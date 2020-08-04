package algorithm;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=1; i<=t; i++) {
			int n = sc.nextInt();
			int result = 0;
			for(int j=0; j<n; j++) {
				int num = sc.nextInt();
				result ^= num;
			}
			
			System.out.println("Case #" + i);
			System.out.println(result);
		}
	}
}
