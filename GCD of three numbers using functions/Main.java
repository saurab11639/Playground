import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = gcd_of_2_numbers(n1, n2);// Function call
	    System.out.print(gcd_of_2_numbers(n1, n2));// Function call
	}
	// Function to find the gcd of 2 numbers
	public static int gcd_of_2_numbers(int num1, int num2)
	{
	    int min_element;
	    if(num1 < num2)
	    {
	        min_element = num1;
	    }
	    else{
	        min_element = num2;
	    }
	    while(min_element >= 1)
	    {
	        if((num1 % min_element == 0) &&(num2 % min_element == 0))
	        {
	            return min_element;
	        }
	        --min_element;
	    }
	    return 0;
	}
}


