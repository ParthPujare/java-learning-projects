import java.util.*;
class BubbleSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		boolean s;
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		int [] a = new int [n];
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Before sorting:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				s=false;
				if(a[j]>a[j+1])
				{
					int t = a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					s=true;
				}
				if(s=false)
				break;
			}
		}
		System.out.println("After sorting:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
