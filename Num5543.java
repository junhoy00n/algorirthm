package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Num5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ham = new int[3];
		int[] soda = new int[2];
		
		for(int i=0; i<3; i++) {
			ham[i] = sc.nextInt();
		}
		Arrays.sort(ham);
		
		for(int i=0; i<2; i++) {
			soda[i] = sc.nextInt();
		}
		Arrays.sort(soda);
		
		System.out.println(ham[0] + soda[0] - 50);
	}
}