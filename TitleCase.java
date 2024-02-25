import java.util.*;
class TitleCase
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string");
		String s = new String (sc.nextLine());
		String s1= new String();
		String s2= new String();
		s=s.toLowerCase();
		s1=s.substring(0,1);
		s=s.substring(1);
		s1=s1.toUpperCase();
		s=s1.concat(s);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				s1=s.substring(0,i+1);
				s2=s.substring(i+1,i+2);
				s=s.substring(i+2);
				s2=s2.toUpperCase();
				s1=s1.concat(s2);
				s=s1.concat(s);
			}
		}
		System.out.println("Title Case:"+s);
	} 
}
