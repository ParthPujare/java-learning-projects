import java.util.*;
class A3Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string ");
		String s = new String(sc.nextLine());
		System.out.println("Enter the character to be searched");
		String s1 = new String(sc.nextLine());
		char a = s1.charAt(0);
		int f=0;
		for(int i=0;i<s.length();i++)
		{
			if(a==s.charAt(i))
			{
				f++;
			}
		}
		if(f==0)
		{
			System.out.println("Character not found");
		}
		else
		{
			System.out.println("Character found having frequency:"+f);		
		}
	}
}
