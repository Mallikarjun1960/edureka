import java.util.Scanner;

public class Voteeligibilitycheck {

	public static void main(String[] args) {
	
		 Scanner in = new Scanner(System.in);

	       System.out.println("Enter age of a person :");
	        int age = in.nextInt();
	        if(age>=18)
	        {
	        	System.out.println("Person is eligible to vote");
	        }
	        else
	        {
	        	System.out.println("Person is not eligible to vote");
	        }
	     

	}

}
