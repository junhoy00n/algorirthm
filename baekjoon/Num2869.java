package baekjoon;

import java.util.Scanner;

public class Num2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int up = sc.nextInt();
		int down = sc.nextInt();
		int high = sc.nextInt();
		
		int day = 1;
		int oneDay = up - down;
		high -= up;
		int plusday = high/oneDay;
		
		if(high - (oneDay * plusday) <= 0) {
			day += plusday;
		}
		else {
			day += plusday + 1;
		}
		
		System.out.println(day);
	}
}