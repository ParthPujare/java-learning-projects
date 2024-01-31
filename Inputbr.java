import java.io.*;
public class Inputbr
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a fractional number");
		String n = br.readLine();
		float num = Float.parseFloat(n);
		System.out.println("Number is " + num);
	}
}
