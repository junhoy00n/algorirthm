package baekjoon;

import java.util.Scanner;

public class Num2839 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		int result = -1;
		
		while(true) {
			int five = n/5 - i;
			int three = (n - 5*five)/3;
			
			if(five == 0 && n % 3 != 0) {
				break;
			}
			
			else if(5*five + 3*three == n) {
				result = five + three;
				break;
			}
			
			else {
				i++;
			}
		}
		
		System.out.println(result);
	}
}