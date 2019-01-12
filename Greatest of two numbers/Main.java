import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int b =sc.nextInt();
      if(n>b){
        System.out.println("num1 is the greatest number");
      }
      else{
        System.out.println("num2 is the greatest number");
      }
	}
}