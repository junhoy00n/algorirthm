package baekjoon;

import java.util.Scanner;

public class Num2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int multiple = 1;
		int first = 2;
		int last = 7;
		int result = 0;
		
		if(n == 1) {
			result = 1;
		}
		else {
			while(true) {
				if(n >= first && n<= last) {
					result = multiple+1;
					break;
				}
				
				else {
					multiple++;
					first = last+1;
					last = last+6*multiple;
				}
			}
		}
		System.out.println(result);
	}
}