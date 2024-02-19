import java.util.*;
class SequentialSearch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int i ;
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		System.out.println("Enter the element to be searched");
		int ele = sc.nextInt();
		int [] a = new int [n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(ele==a[i])
			break;
		}
		if(i==n)
		System.out.println("Element does not exist");
		else
		System.out.println("Element found at index:"+i);
	}
}
