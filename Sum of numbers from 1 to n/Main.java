import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code hereWrite a JAVA code to print n odd numbers using for loop.
  Scanner in = new Scanner(System.in);
       int  sum = 0;
      int num=in.nextInt();

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println( + sum);
    }
}
      
	