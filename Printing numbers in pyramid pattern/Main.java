import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
     int l =0;
      for(int i = 1 ; i<=n;i++){
        for(int j = n-i;j>=1;j--){
          System.out.print(" ");
        }
        for(int k =1;k<=i;k++){
          l++;
          System.out.print(l+" ");
          
        }
        System.out.println();
      }
    }    
}