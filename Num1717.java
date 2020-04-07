package baekjoon;

import java.util.Scanner;

public class Num1717 {
	
	static int[] group = new int[1000001];
	
	public static int find(int i) {
		if(group[i] == i) {
			return i;
		}
		else {
			return group[i] = find(group[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			group[i] = i;
		}
		
		for(int i=0; i<m; i++) {
			int check = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
			
			if(check == 0) {
				a = find(a);
				b = find(b);
				group[b] = a;
			}
			
			else if(check==1) {
				a = find(a);
				b = find(b);
				
				if(a == b) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}
}