package baekjoon;

import java.util.Scanner;

public class Num10775 {
	
	static int[] group = new int[100001];
	
	public static void union(int a, int b) {
	    a = find(a);
	    b = find(b);
	    group[a] = b;
	}
	 
	public static int find(int a) {
	    if (a == group[a]) {
	        return a;
	    }
	    return group[a] = find(group[a]);
	}
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int gate = sc.nextInt();
	    int plane = sc.nextInt();
	    int cnt = 0;
	 
	    for (int i=1; i<=gate; i++) {
	        group[i] = i;
	    }
	 
	    for (int i=1; i<=plane; i++) {
	        int planenum = sc.nextInt();
	 
	        int dock = find(planenum);
	        if (dock != 0) {
	            union(dock, dock - 1);
	            ++cnt;
	        } else {
	            break;
	        }
	    }
	    System.out.println(cnt);
	}
}