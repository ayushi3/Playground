import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int s = 0 ;
      for(int i = 1; i<100;i++){
        if(s == n){
          break;
        }
        else
          if(i%2 != 0){
            s=s+1;
            System.out.println(i);
          }
      }
	}
}