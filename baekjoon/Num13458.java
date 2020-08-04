package algorithm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] result = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int b = sc.nextInt(), c = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(arr[i] - b > 0) {
				result[i]++;
				if((arr[i] - b) % c == 0) result[i] += ((arr[i] - b) / c);
				else result[i] += ((arr[i] - b) / c) + 1;
			}
			else if(arr[i] - b <= 0) result[i]++;
		}
		
		long sum = 0;
		for(int i=0; i<result.length; i++) sum += result[i];
		
		System.out.println(sum);
	}
}
