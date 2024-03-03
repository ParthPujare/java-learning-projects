import java.util.*;
class A3Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string");
		String s = new String (sc.nextLine());
		int uc=0,lc=0,b=0,d=0;
		char lowercase [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char uppercase [] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char digits [] = {'0','1','2','3','4','5','6','7','8','9'};
		char a [] = s.toCharArray();
		System.out.println("Array:");

		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<uppercase.length;j++)
			{
				if(s.charAt(i)==uppercase[j])
				{
					uc++;
				}
			}
			for(int j=0;j<lowercase.length;j++)
			{
				if(s.charAt(i)==lowercase[j])
				{
					lc++;
				}
			}
			for(int j=0;j<digits.length;j++)
			{
				if(s.charAt(i)==digits[j])
				{
					d++;
				}
			}
			if(s.charAt(i)==' ')
			{
				b++;
			}
		}
		System.out.println("UpperCase:"+uc+"\nLowercase:"+lc+"\nDigits:"+d+"\nBlanks:"+b);
	}
}
