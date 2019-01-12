import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner sc = new Scanner (System.in);
    int l = 0;
    int n= sc.nextInt();
    for(int i = 1; i <= n;i++){
      l++;
      if(l==3 && i!=n){
      System.out.print(i+",");
        l=0;
      }
      else{
        System.out.print(i);
      }
    }
  }
}