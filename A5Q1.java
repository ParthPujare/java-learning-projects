import java.util.*;
class Employee
{
	String en,ed;
	int eid,es;
	public void getEmployee()
	{
		Scanner sc1 = new Scanner (System.in);
		Scanner sc2 = new Scanner (System.in);
		System.out.println("Enter Name");
		en=sc1.nextLine();
		System.out.println("Enter Id");	
		eid=sc2.nextInt();
		System.out.println("Enter salary");
		es=sc2.nextInt();
		System.out.println("Enter designation");
		ed=sc1.nextLine();	
	}
	public void showGrade()
	{
		if(es>50000)
			System.out.println("Grade A");
		else if (es>10000)
			System.out.println("Grade B");
		else
			System.out.println("Grade C");
	}
	public void showEmployee()
	{
		System.out.println();
		System.out.println("Name:"+en);
		System.out.println("ID:"+eid);
		System.out.println("Salary:"+es);
		System.out.println("Designation:"+ed);
		System.out.println();
	}
}
class A5Q1
{
	public static void main (String args[])
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.getEmployee();
		e2.getEmployee();
		e1.showEmployee();
		e1.showGrade();
		e2.showEmployee();
		e2.showGrade();
	}
}
