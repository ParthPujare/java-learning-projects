class Count
{
	private static int c=0;
	public static void createObject()
	{
		c++;
	}
	public static int objectCount()
	{
		return c;
	}
}
class A5Q4
{
	public static void main(String args[])
	{
		Count.createObject();//create object1
		Count.createObject();//create object2
		Count.createObject();//create object3
		Count.createObject();//create object4
		Count.createObject();//create object5
		int n =Count.objectCount();
		System.out.println("Number of Objects:"+n);
	}
}
