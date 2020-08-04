package algorithm;

import java.util.Scanner;

public class Main {
	
	static int N, m, M, T, R;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		m = sc.nextInt();
		M = sc.nextInt();
		T = sc.nextInt();
		R = sc.nextInt();
		
		int current = m, cnt = 0, time = 0;
		while(cnt < N) {
            if(current+T <= M) {
                cnt++;
                time++;
                current += T;
            }
            
            else {
                if(current - R <  m) {
                    time++;
                    current = m ;
                }
                else {
                    time++;
                    current -= R;
                }
            }
            
            if(current + T > M && current == m) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(time);
	}
}
