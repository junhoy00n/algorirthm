import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int[] arr = new int[n+1];
    for(int i=1; i<=n; i++) arr[i] = sc.nextInt();
    for(int i=1; i<=n; i++) arr[i] += arr[i-1];
    
    for(int x=0; x<m; x++) {
      int i = sc.nextInt();
      int j = sc.nextInt();
      
      System.out.println(arr[j] - arr[i-1]);
    }
  }
}
