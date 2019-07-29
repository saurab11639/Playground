import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Get the n value
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
 
	    for(int curr_row = 1; curr_row <= n; ++curr_row)
	    {
             // Handle stars for each row
	         for(int curr_col = 1; curr_col <= n; ++curr_col)
	         {
                
	                // When row no and col no are equal, print "*"
                    // Otherwise print space
	                if((curr_row == curr_col) ||
	                  (curr_row + curr_col == n + 1))
	                {
	                    System.out.print("*");
	                }
                    
	                else
	                {
	                    System.out.print(" ");
	                }
	         }
	         System.out.println();
	    }
	}
}
