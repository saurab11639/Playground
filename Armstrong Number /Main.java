import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int num =in.nextInt();
   
      int first=num/100;
      int last = num%10;
      int b;
     
        int s= (num/10)%10;
      
       b= (first*first*first)+(s*s*s)+(last*last*last);
      if(b==num)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
      System.out.println("Not a Armstrong Number");
      }
      
	}
}