import java.util.Scanner;
public class Pg16
{
	public static void main(String args[])
	{
		double r1,r2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vlaue of a,b and c for\nax^2+bx+c=0");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		float d = (b*b)-(4*a*c);
		if(d>0)
		{
			r1 = ((-b+Math.sqrt(d))/(2*a));
			r2 = ((-b-Math.sqrt(d))/(2*a));
			System.out.println("Root 1:"+r1+"\nRoot 2:"+r2);
		}
		else
		{
			d *= (-1);
			System.out.println("The roots are complex");
			r1 = ((float)(-b)/(2*a));
			r2 = ((Math.sqrt(d))/(2*a));
			System.out.println("Root 1:"+r1+"+i "+r2+"\nRoot 2:"+r1+"-i "+r2);
		}
	}
}
