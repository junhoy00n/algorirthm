package baekjoon;

import java.util.Scanner;

public class Num1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split(" ");
		int cnt = str.length;
		
		for(int i=0; i<str.length; i++) {
			if(str[i].equals("")) {
				cnt--;
			}
		}
		
		System.out.println(cnt);
	}
}
