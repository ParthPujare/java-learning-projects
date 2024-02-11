import java.util.Scanner;
public class Distance
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of initial velocity");
		float v = sc.nextFloat();
		System.out.println("Enter the value of acceleration");
		float a = sc.nextFloat();
		float s=0;
		s=v+(float)(0.5*a*((float)Math.pow(1,2)));
		System.out.println("At t=1sec s:"+s);
		for(int i = 5;i<=100;i+=5)
		{
		s=v*i+(float)(0.5*a*(float)Math.pow(i,2));
		System.out.println("At t="+i+"sec s:"+s);
		}
	}
}
