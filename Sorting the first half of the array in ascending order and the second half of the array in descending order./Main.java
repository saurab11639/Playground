import java.util.Scanner;
class Main
 {
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int list[] = new int[n];
         for(int index = 0;index < n; index++)
         {
             list[index] = sc.nextInt();   
         }
         insertion_sort(n,list);
     }
    public static void insertion_sort(int n,int list[])
    {
        for (int idx1 = 1; idx1 < n/2; idx1++) 
        {
            int key = list[idx1];
            int idx2 = idx1 - 1;
            while((idx2 >= 0) && (list[idx2] > key)) 
            {
                list[idx2 + 1] = list[idx2];
                idx2--;
            }
            list[idx2 + 1] = key;
        }
        for (int idx1 = n/2; idx1 < n; idx1++) 
        {
            int key = list[idx1];
            int idx2 = idx1 - 1;
            while((idx2 >= n/2) && (list[idx2] < key)) 
            {
                list[idx2 + 1] = list[idx2];
                idx2--;
            }
            list[idx2 + 1] = key;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(list[i]+" ");
        }
        
    }
}