import java.util.Scanner;
public class Swap
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		System.out.println("Before swapping n1 = " + n1 + "& n2 = " + n2);
		int t = n1;
		n1 = n2 ;
		n2 = t;
		System.out.println("After swapping n1 = " + n1 + "& n2 = " + n2);
	}
}
