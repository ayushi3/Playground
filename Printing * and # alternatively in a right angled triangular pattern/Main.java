import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n= in.nextInt();
      int m = 0;
      for(int i = 0 ; i<n;i++){
        for(int j = 0;j<=i;j++){
          m++;
          if(m%2 == 0){
          System.out.print("#");
          }
          else{
            System.out.print("*");
        }        
        }
        System.out.println();
      }
      
    }
}