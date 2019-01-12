import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      // this is for the strong number
      int n = sc.nextInt();
      int c = n; //  this is the copy of the number inputed
      int sum =0;
      while(n>0){
        int temp = n%10;
        int fact = 1;
        for(int i = 1;i<= temp;i++){// this is calculating the factorial of each digit
          fact = fact*i;
        }
        sum = sum+fact;
        n=n/10;
      }
          if(sum == c){
            System.out.println("Yes");
          }
      else
        System.out.println("No");
	}
}