import java.util.*;
class Complex
{
	private double real,imaginary;
	Complex()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the real part of the complex number");
		this.real=sc.nextDouble();
		System.out.println("Enter the imaginary part of the complex number");
		this.imaginary=sc.nextDouble();
	}
	Complex(int a)
	{
	}
	public Complex add (Complex c)
	{
		Complex a = new Complex(0);
		a.real=this.real+c.real;
		a.imaginary=this.imaginary+c.imaginary;
		return a;
	}
	public Complex sub (Complex c)
	{
		Complex a = new Complex(0);
		a.real=this.real-c.real;
		a.imaginary=this.imaginary-c.imaginary;
		return a;
	}
	public void display()
	{
		System.out.println("Answer:("+this.real+")+i("+this.imaginary+")");
	}
}
class A6Q2
{
	public static void main(String args[])
	{
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex c3 = new Complex(0);
		Complex c4 = new Complex(0);
		c3=c1.add(c2);
		c4=c1.sub(c2);
		System.out.println("Addition:");
		c3.display();
		System.out.println("Subtraction:");
		c4.display();
	}
}
