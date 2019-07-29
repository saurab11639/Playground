import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the array size
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
        // Get the searching element 1
        int search_elem_1 = in.nextInt();
        // Get the search element 2
        int search_elem_2 = in.nextInt();
        // Initialize two varibles to store the given elements index
        int elem_1_idx = -1;
        int elem_2_idx = -1;
        // scan each element in an array
        // If element 1 and element 2 found, then store the index value 
        // Otherwise it will search till it reaches the arr_size - 1
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            if(search_elem_1 == arr[idx])
            {
                elem_1_idx = idx;
            }
            if(search_elem_2 == arr[idx]){
                elem_2_idx = idx;
            }
        }
        System.out.println(elem_1_idx);
        System.out.println(elem_2_idx);
    }
}

