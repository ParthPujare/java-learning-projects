import java.util.*;
class Power
{
	public static int power (int x,int n)
	{
		if(n==0)
		return 1;
		return (x*power(x,n-1));
	}
}
class A5Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the vlaue of x and n for y=x^n");
		int x = sc.nextInt();
		int n = sc.nextInt();
		int a = Power.power(x,n);
		System.out.println("Answer:"+a);
	}
}
