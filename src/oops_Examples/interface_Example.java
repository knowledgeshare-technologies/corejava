package oops_Examples;

interface myinterface
{
	public void add(int a, int b);
	public void sub(int a,int b);
}

class interface_Example implements myinterface
{
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of a and b is :  " + c );
	}

	public void sub(int a, int b) 
	{
	
		int c=b-a;
		System.out.println("Subtraction : " + c);
	}
	
	
	public static void main(String args[])
	{
		System.out.println("interface Example ");
		interface_Example obj = new interface_Example();
		
		
		obj.add(10, 20); // 30
		obj.sub(10, 30); //20
		
		
	}
}

