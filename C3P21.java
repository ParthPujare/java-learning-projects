import java.util.*;
class C3P21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string ");
		String s = new String (sc.nextLine());
		s=s.toUpperCase();
		System.out.println("After converting the entire string to upper case we get:");
		System.out.print(s);
	}
}
