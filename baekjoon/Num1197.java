package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Num1197 {
	
	static int v, e;
	
	static int[][] arr;
	static int[] parent;
	
	public static int find(int x) {

		if (x == parent[x]) {
			return x;
		}

		int root = find(parent[x]);
		parent[x] = root;
		return root;
	}

	public static void union(int x, int y) {
		x = find(x);
		y = find(y);

		parent[y] = x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		v = sc.nextInt();
		e = sc.nextInt();
		
		parent = new int[v+1];
		for(int i=1; i<=v; i++) {
			parent[i] = i;
		}
		
		arr = new int[e][3];
		for(int i=0; i<e; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cost = sc.nextInt();
			
			arr[i][0] = from;
			arr[i][1] = to;
			arr[i][2] = cost;
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {

				return a[2] >= b[2] ? 1 : -1;
			}
		});
		
		int sum = 0;
		int cnt = 0;
		
		for(int i=0; i<e; i++) {
			int a = arr[i][0];
			int b = arr[i][1];
			int c = arr[i][2];

			if (find(a) != find(b)) {
				union(a, b);
				sum += c;
				if (++cnt == v - 1)
					break;
			}
		}
		System.out.println(sum);
	}
}