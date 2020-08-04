package baekjoon;

import java.util.Scanner;

public class Num1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int first = 1;
		int last = 1;
		int num = 1;
		int up = 1;
		int down = 1;
		
		while(true) {
			if(x >= first && x <= last) {
				break;
			}
			
			else {
				first = first + num;
				last = last + num + 1;
				num++;
			}
		}
		
		if(num%2 == 0) {
			up = 1 + (x - first);
			down = num - (x - first);
		}
		else {
			up = num - (x - first);
			down = 1 + (x - first);
		}
		
		System.out.println(up + "/" + down);
	}
}