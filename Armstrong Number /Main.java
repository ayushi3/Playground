import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int c = n;
      int m = n;
      int l = 0;
      while(n>0){ // this is for the length
        l++;
        n = n/10;
      }
      int sum = 0; // this is to store the sum of the numbers that are we adding in the loop
      for(int i = 0;i<l;i++){
        int temp = c %10;
        sum = sum+(int)Math.pow(temp,l);
        c=c/10;
      }
      if(m == sum){ // to check the condition
        System.out.println("Armstrong Number");
      }
      else
        System.out.println("Not a Armstrong Number");
	}
}