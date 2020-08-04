package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int caseNum=1; caseNum<=t; caseNum++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			Integer[] arr = new Integer[n];
			for(int i=0; i<n; i++) arr[i] = sc.nextInt();
			Arrays.sort(arr, Collections.reverseOrder());
			
			int result = 0;
			for(int i=0; i<k; i++) {
				result += arr[i];
			}
			
			System.out.println("Case #" + caseNum);
			System.out.println(result);
		}
	}
}
