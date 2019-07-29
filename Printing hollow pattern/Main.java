import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int curr_row = 1; curr_row <= n; curr_row++)
	    { 
            // Handle stars for each row
	        for(int curr_col = 1; curr_col <= n; curr_col++)
	        {
                // Condition to print stars 
	            if((curr_row == 1) || (curr_col == 1) || 
                   (curr_row == n) || (curr_col == n))
	            {
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}
