import java.util.Scanner;
public class Typecasting
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a floating type number");
		float n = sc.nextFloat();
		System.out.println("The integer part of the number is "+(int)n);
	}
}
