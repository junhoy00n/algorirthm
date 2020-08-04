package algorithm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		
		String line = sc.next();
		String[] str = line.split(",");
		
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) arr[i] = Integer.parseInt(str[i]);
		
		for(int x=1; x<=k; x++) {
			for(int i=0; i<arr.length-1; i++) {
				arr[i] = arr[i+1] - arr[i];
			}
		}
		
		for(int i=0; i<arr.length-k; i++) {
			System.out.print(arr[i]);
			if(i != arr.length-k-1) System.out.print(",");
		}
	}
}
