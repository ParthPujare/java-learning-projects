import java.util.*;
class Student
{
	private String name;
	private int rollNo, Id, sub1, sub2, sub3;
	int total;
	Student()
	{
		System.out.println("Enter the name,roll no. ,id and marks of maths, physics and chemistry");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		this.name=sc1.nextLine();
		this.rollNo=sc2.nextInt();
		this.Id=sc2.nextInt();
		this.sub1=sc2.nextInt();
		this.sub2=sc2.nextInt();
		this.sub3=sc2.nextInt();
		this.total=this.sub1+this.sub2+this.sub3;
	}
	Student(int a)
	{}

	public void swap (Student s)
	{
		String nt;
		int rt,it,s1t,s2t,s3t,tt;
		
		nt=this.name;
		rt=this.rollNo;
		it=this.Id;
		s1t=this.sub1;	
		s2t=this.sub2;	
		s3t=this.sub3;
		tt=this.total;

		this.name=s.name;
		this.rollNo=s.rollNo;
		this.Id=s.Id;
		this.sub1=s.sub1;	
		this.sub2=s.sub2;	
		this.sub3=s.sub3;
		this.total=s.total;

		s.name=nt;
		s.rollNo=rt;
		s.Id=it;
		s.sub1=s1t;	
		s.sub2=s2t;	
		s.sub3=s3t;
		s.total=tt;	
	}
	public void display()
	{
		System.out.print("Name:"+this.name+"\t");
		System.out.print("Id:"+this.Id+"\t");
		System.out.print("rollNo:"+this.rollNo+"\t");
		System.out.print("Marks of maths:"+this.sub1+"\t");
		System.out.print("Marks of physics:"+this.sub2+"\t");
		System.out.print("Marks of chemistry:"+this.sub3+"\t");
		System.out.print("Total Marks:"+this.total);
		System.out.println();
	}
}
class A6Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		Student s [] = new Student [n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(s[j].total<s[j+1].total)
				s[j].swap(s[j+1]);
			}
		}
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
	}
}
