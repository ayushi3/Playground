import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int sum = 0;
      while(n>0){
        int k = n%10;
        sum = sum+k;
        n= n/10;
      }
      System.out.println(sum);  
	}
}