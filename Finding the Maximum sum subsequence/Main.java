import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[20];
        int i, j;
        for(i=0; i<N; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(sum_subsequence( arr, N ) );
    }
    public static int sum_subsequence( int arr[], int n )
    {
        int running_sum, max_sum_sub, i;
  
 	    running_sum = arr[0];
  	    max_sum_sub = arr[0];
  	    for(i = 1; i < n; i++)
        {
            if(arr[i] > arr[i-1])
            {
                running_sum += arr[i];
            }
            else 
            {
                running_sum = arr[i];
            }
            if(running_sum > max_sum_sub)
            {
                max_sum_sub = running_sum;
            }
        }
        return max_sum_sub;
    }
}
