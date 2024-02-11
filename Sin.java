import java.util.Scanner;
public class Sin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of iterations");
		int n = sc.nextInt();
		int sign = 1,t;
		float rad,deg,sinx=0,num,den,term,fact;
		System.out.println("Enter the angle in deg");
		deg = sc.nextFloat();
		rad = deg * (float)(3.14/180);
		for(int i =1;i<=((2*n)-1);i+=2)
		{
			num = (float)Math.pow(rad,i);
			t=i;
			fact=1;
			while(t!=0)
			{
				fact *= t;
				t--;
			}
			den = fact;
			term = num / den;
			sinx += term*sign;
			sign *= (-1);
		}
		System.out.println("Sin x :"+sinx);
	}
}
