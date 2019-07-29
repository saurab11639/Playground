import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int num=in.nextInt();
   int num1= (num/100);
 int num2=(num/10)%10;
 int num3=num%10;
  int reverse=(num3*100)+(num2*10)+(num1);
  System.out.println(reverse);
  }
  
}