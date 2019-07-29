import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index <= arr_size - 1; index++){
           arr[index] = in.nextInt();
       }
       // Function call
       zeroes_at_the_end(arr_size, arr);
       for(int index = 0; index <= arr_size - 1; index++){
           System.out.print(arr[index] + " ");
       }
    }
    public static void zeroes_at_the_end(int arr_size, int arr[])
    {
        // Count of non-zero elements 
        int count = 0;
        //Traverse the array. If arr[index] is non-zero, then 
    	// swap the element at arr[index] and arr[count]  
        for(int index = 0; index <= arr_size - 1; index++){
            if(arr[index] != 0)
            {
                int temp = arr[index];
                arr[index] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}