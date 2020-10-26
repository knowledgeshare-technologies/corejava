package oops_Examples;

class overload_example
{
	void add(int a, int b)
	{
		System.out.println("Sum is : " + (a+b)) ;
		
	}
	
	void add(int a, int b,int c)
	{
		System.out.println("Sum is : " + (a+b+c)) ;
		
	}
}


public class polymorphism_method_Overloading_example 

{
	public static void main(String args[])
	{
		//Method Overloading
		
		overload_example obj=new overload_example();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		
	}

	
}
