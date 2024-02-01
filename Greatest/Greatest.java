import java.util.Scanner;
public class Greatest
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 nummbers");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		if(n1>n2)
		{
			System.out.println(n1 + " is larger");
		}
		else
		{
			System.out.println(n2 + " is larger");
		}
	}
}
