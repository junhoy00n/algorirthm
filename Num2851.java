package algorithm;

import java.util.Scanner;

public class Num2851 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		short[] mushroom = new short[10];
		for(int i=0; i<10; i++) {
			mushroom[i] = sc.nextShort();
		}
		
		int sum = 0;
		int sum2 = 0;
		for(int i=0; i<10; i++) {
			sum += mushroom[i];
			if(sum > 100) {
				sum2 = sum - mushroom[i];
				break;
			}
		}
		
		int result = 0;
		if(sum - 100 <= 100 - sum2) result = sum;
		else if(sum - 100 > 100 - sum2) result = sum2;
		
		System.out.println(result);
	}
}