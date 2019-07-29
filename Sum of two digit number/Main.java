import java.util.*;
class Main {
	public static void main (String[] args) {
	 Scanner in = new Scanner(System.in);
    int num1=in.nextInt();
    int a=num1%10;
      int b=num1/10;
     int sum = a+b;
    System.out.println(sum);	
	}
}