import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
         Scanner in = new  Scanner(System.in);
      int num = in.nextInt();
  int sum=1;
        for(int i = 1; i <= num; ++i) {
            
              sum=sum *i;
            }
              System.out.println(+sum);
      
	}
    
}