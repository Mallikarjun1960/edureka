import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	       System.out.println("Enter first number:");
	        int a = in.nextInt();
	        System.out.println("Enter second number:");
	        int b = in.nextInt();
	        if(a>b)
	        {
	        	System.out.println("largest num is " + a);
	        }
	        else
	        {
	        	System.out.println("largest num is " + b);
	        }

	}

}
