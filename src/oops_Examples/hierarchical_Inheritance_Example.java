package oops_Examples;
class myclA
{
	int a=1;
	void method_A()
	{
		System.out.println("this is method from myclA");
	}
}

class myclB extends myclA
{
	int b=2;
	void method_B()
	{
		System.out.println("this is method from myclB");
	}
}

class myclC extends myclA
{
	int c=3;
	void method_C()
	{
		System.out.println("this is method from myclC");
	}
}

public class hierarchical_Inheritance_Example 
{
			public static void main(String args[])
			{
				System.out.println("multi-level Inhertance example");
				
				myclC obj=new myclC();
				
				obj.method_A();
				obj.method_C();
				System.out.println("variable of myclA :  " + obj.a);
				System.out.println("variable of myclC :  " + obj.c);
				/*
				 * 
				 * myclB obj=new myclB();
				 */
				
			}
}
