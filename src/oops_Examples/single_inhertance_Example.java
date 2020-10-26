package oops_Examples;

class myclassA
{
	int a=10;
	void method_A()
	{
		System.out.println("this is a method from Class A");
	}	
}

class myclassB extends myclassA
{
	int b=5;
	void method_B()
	{
		System.out.println("this is a method from Class B");
	}
}


public class single_inhertance_Example 
{
		public static void main(String args[])
		{
			System.out.println("Single Inheritance Example");
			
			myclassB obj=new myclassB();
			
			obj.method_A();
			obj.method_B();
			System.out.println("Variable from Class A " + obj.a);
			System.out.println("Variable from Class B " + obj.b);
			
			
		}
}
