import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int input=in.nextInt();
      if(input==1)
      {
        System.out.println("one");
      }
      else if(input==2)
      {
        System.out.println("two");
      }
      else if(input==3)
      {
        System.out.println("Three");
      }
      else if(input==4)
      {
        System.out.println("four");
      }
      else if(input==5)
      {
        System.out.println("five");
      }
      else
      {
        System.out.println("Invalid");
      }
	}
}