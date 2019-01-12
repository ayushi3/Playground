import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int l = n%100;
      int ans = l/10;
      System.out.println(ans);
	}
}