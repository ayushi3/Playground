import java.util.Scanner ;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();   
    for(int i = 1;i<=n;i++){
      for(int j = (n-i);j>=1;j--){
        System.out.print(" ");
      }
      for(int k = 1 ;k <=(i*2)-1;k++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}