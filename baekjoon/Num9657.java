package algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n%7 == 0 || n%7 ==2) System.out.println("CY");
        else System.out.println("SK");
    }
}
