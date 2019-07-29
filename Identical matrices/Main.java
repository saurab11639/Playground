
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int flag = 0;
        int r = in.nextInt();
        int c = in.nextInt();
        int a[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = in.nextInt();
            }
        }
        int b[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                b[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(a[i][j] != b[i][j])
                {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0)
        System.out.print("Yes");
        else
         System.out.print("No");
    }
}