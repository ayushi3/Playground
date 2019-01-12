import java.util.Scanner;
import java.lang.Math;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int c = n;
      int l = 0;
      while(n>0){
        // this is for the lenght of the number 
        l++;
        n =n/10;
      }
      int s= (int)Math.pow(10,l-2);
      int ans = (c/s)%10;
      System.out.println(ans);
    }
}