package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num11725 {
	
	static int[] parent;
	static List<Integer>[] list;
	static boolean[] visit;
	static int n;
	
	private static void dfs(int v) {
		visit[v] = true;
		
		for(int i : list[v]) {
			if(!visit[i]) {
				parent[i] = v;
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		list = new ArrayList[n+1];
		parent = new int[n+1];
		for(int i = 1; i <= n; i++) list[i] = new ArrayList<>();
		
		visit = new boolean[n+1];
		for(int i = 0; i < n-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b); list[b].add(a);
		}
		
		dfs(1);
		for(int i = 2; i <= n; i++) System.out.println(parent[i]);
	}
}
