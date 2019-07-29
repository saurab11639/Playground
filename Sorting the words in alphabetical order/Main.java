import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] words = new String[size];
        for(int i = 0; i < size; i++)
        {
            words[i] = sc.next();
        }
        int k = 0;
        for(int i = 0; i < size; i++)  // you can also use tolowercase()
        {
            int ch=words[i].charAt(0);
            if(ch > 64 && ch < 91)
            {
                String str = words[i];
                char[] chr  = str.toCharArray();
                ch = ch + 32;
                chr[0] = (char)ch;
                words[i] = new String(chr);
            }
        }
        for(int i = 0; i < size  - 1; ++i) 
        {
            for (int j = i + 1; j < size; ++j) 
            {
                if (words[i].charAt(k) > words[j].charAt(k)) 
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                    k = 0;
                }
            }
        }
        for(int i = 0; i < size; i++) 
        {
            System.out.println(words[i]);
        }
    }
}