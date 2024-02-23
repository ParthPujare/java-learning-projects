import java.util.Scanner;
class Series
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int n = sc.nextInt();
		int num=1,den,i=1,sign=1;
		float term,sum = 0;
		while((i-1)!=n)
		{
			den=i;
			term=((float)num)/den;
			sum += term*sign;
			sign *= (-1);	
			i++;
		}
		System.out.println("Sum:"+sum);
	}
}
