import java.util.Scanner;
public class if_else_statement
{
	public static void main(String args[])
	{
		int Age;
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your age");
		Age = name.nextInt();
		if(Age>=18)
		{
			System.out.println("you are eligible for vote");
		}
		else
		{
			System.out.println("you are not eligible for vote");
		}
	}
} 
