package baekjoon;

import java.util.Scanner;

public class Num1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		
		for(int i=0; i<arrSize; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int result = 0;
		for(int i=0; i<arrSize; i++) {
			for(int j=1; j<=arr[i]; j++) {
				if(arr[i] % j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				result++;
			}
			cnt = 0;
		}
		
		System.out.println(result);
	}
}