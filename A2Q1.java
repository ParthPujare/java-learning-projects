import java.util.*;
class A2Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int a [] = new int [n];
		int s [] = new int [n];
		System.out.println("Enter the elements ");
		for(int i =0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			s[i]=0;
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					s[i]+=a[j];
				}
			}
		}
		System.out.println("The data array is:\n");
		for(int i =0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println("\nThe sum array is:\n");
		for(int i =0;i<n;i++)
		{
			System.out.print(s[i]+"\t");
		}
	}
}
