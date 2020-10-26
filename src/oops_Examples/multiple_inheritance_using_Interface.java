package oops_Examples;

interface AA
{
	int a=10;
	void method_A();
	
}

interface BB
{
	int b=5;
	void method_B();
}


class multi_CC implements AA,BB
{
	public void method_A() 
	{
		System.out.println("this is the method from interface AA");
	}
	public void method_B() 
	{
		System.out.println("this is the method from interface BB");
	}
}


public class multiple_inheritance_using_Interface 

{
	public static void main(String args[])
	{
		multi_CC obj=new multi_CC();
		obj.method_A();
		obj.method_B();
	}
	
			
			
}
