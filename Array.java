import java.util.Scanner;
public class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int month_no [];
		month_no = new int[12];
		for(int i=0;i<12;i++)
		{
			month_no[i] = i+1;
		}
		for(int i=0;i<12;i++)
		{
			System.out.println(month_no[i]);
		}
	}
}
