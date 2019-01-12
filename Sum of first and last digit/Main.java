import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int c= n;
      int sum = c%10,l=0 ;
      int s=0;
      while(n>0){// tihs is for the length of the number 
        l++;
        s=n;
        n= n /10;
      }
    
      System.out.println(sum+s);
	}
}