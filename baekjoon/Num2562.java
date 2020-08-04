package baekjoon;

import java.util.Scanner;

public class Num2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int max = 0;
		int maxnum = 0;
		
		for(int i=1; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=1; i<10; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxnum = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxnum);
	}
}
