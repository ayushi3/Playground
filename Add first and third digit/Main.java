import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int f= n/100;
      int l = n%10;
      int sum = f+l;
      System.out.println(sum);
	}
}