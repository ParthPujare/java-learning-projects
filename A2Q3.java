import java.util.*;
class A2Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();
		int a [][]=new int [n][];
		for(int i=0;i<n;i++)
		{
			a[i] = new int [i+1];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				a[i][j]=j+1;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
