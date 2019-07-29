import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder text = new StringBuilder(str); 
    int shift = in.nextInt();
    int text_len = text.length();
    for(int i = 0; i <= text_len - 1; i++)
    {
        char ch = text.charAt(i);
        if(ch >= 'A' && ch <= 'Z')
        {
            ch = (char)(ch - shift);
            if(ch < 'A')
            {
                ch = (char)(ch + 26);
            }
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            ch = (char)(ch - shift);
            if(ch < 'a')
            {
                ch = (char)(ch + 26);
            }
        }
         text.setCharAt(i,ch);
    }
    System.out.print(text);
  }
}
