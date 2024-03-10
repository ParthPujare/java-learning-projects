import java.util.*;
class Area 
{
	public static void area (int s)
	{
		System.out.println("Area:"+(s*s));
	}
	public static void area (int l, int b)
	{
		System.out.println("Area:"+(l*b));
	}
}
class A5Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the side of a square");
		int s = sc.nextInt();
		Area.area(s);
		System.out.println("Enter the length and breadth of a rectangle");
		int l = sc.nextInt();
		int b = sc.nextInt();
		Area.area(l,b);	
	}
}
