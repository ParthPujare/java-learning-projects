import java.util.*;
class A2Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		int h=0,c=0;
		int a[][]=new int[n][5];
		System.out.println("Enter the roll number and marks for 3 subjects respectively"); 
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==0)
					a[i][j]=sc.nextInt();
				else if(j==4)
					a[i][j]=0;
				else
					a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j!=0||j!=4)
					a[i][4]+=a[i][j];
				if(h<a[i][4])
				{
					h=a[i][4];
					c=a[i][0];
				}
			}
		}
		System.out.println("RollNo\tSub1\tSub2\tSub3\tTotal");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Student with the higest marks is Roll No:"+c+" with Marks:"+h);
	}
}
