import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// Get the input from the user
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// Compare two numbers
		if(num1 > num2)
		{
		    System.out.print("num1 is the greatest number");
		}
		else
        {
		    System.out.print("num2 is the greatest number");
		}
	}
}