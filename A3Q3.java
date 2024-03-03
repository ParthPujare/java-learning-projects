import java.util.*;
class A3Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = new String (sc.nextLine());
		StringBuffer rev = new StringBuffer(s);
		rev=rev.reverse();
		String s1 = new String (rev);
		if(s.equals(s1))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}
	}
}
