import java.util.Scanner;

public class NumType {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		System.out.println("enter the num:");
		int num=in.nextInt();
		if(num<0)
		{
		System.out.println("Num is negative");
		}
		else if (num>0)
		{
			System.out.println("num is positive");
		}
		else
		{
			System.out.println("num is zero");
		}

	}

}
