import java.util.Scanner;
public class Area
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth");
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Area:"+(l*b)+"\nPerimeter:"+(2*(l+b)));
	}
}
