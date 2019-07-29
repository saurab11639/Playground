import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the size of an array
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
        int max_no;
        // Compare first two elements in an array and find the largest element
        // Store the largest element in one variable
        if(arr[0] > arr[1])
        {
            max_no = arr[0];
        }
        else{
             max_no = arr[1];
        }
        // Scan each element in an array 
        // Compare each element with largest element which is stored in that variable 
        for(int idx = 2; idx <= arr_size - 1; idx++)
        {
            if(max_no < arr[idx])
            {
                max_no = arr[idx];
            }
        }
        System.out.println(max_no);
    }
}