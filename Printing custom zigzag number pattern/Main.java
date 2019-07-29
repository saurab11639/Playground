

import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int curr_row = 1; curr_row <= n; curr_row++)
	    {
            // Handle numbers for each row
	        for(int curr_col = 1; curr_col <= n; curr_col++)
	        {
                // Condition to print numbers
	            if(((curr_row % 2 == 0) && (curr_col == 1)) 
	                || ((curr_row % 2 == 1) && (curr_col == n)))
	            {
	                System.out.print(curr_row + 1);
	            }
	            else{
	                System.out.print(curr_row);
	            }
	        }
	        System.out.println();
	    }
	}
}


