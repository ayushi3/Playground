import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      for(int i = 1; i <= n;i++){//  this is for the row change
        if(i%2 == 1){
          for(int j = n-1;j>=1;j--){
            System.out.print(i);
          }
          System.out.print(i+1);
        }
        else{
          System.out.print(i+1);
           for(int j = n-1;j>=1;j--){
            System.out.print(i);
          }
        }
        System.out.println();
      }
	}
}