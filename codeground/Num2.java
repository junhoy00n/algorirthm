package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int caseNum=1; caseNum<=t; caseNum++) {
			int n = sc.nextInt();
			int max = 0, result = 0;
			
			int[] arr = new int[n];
			for(int i=0; i<n; i++) arr[i] = sc.nextInt();
			Arrays.sort(arr);
			
			for(int i=0; i<n; i++) {
				if(arr[i] + n - i > max) max = arr[i] + n - i;
			}
			
			for(int i=0; i<n; i++) {
				if(arr[i] + n >= max) result++;
			}
			
			System.out.println("Case #" + caseNum);
			System.out.println(result);
		}
	}
}
