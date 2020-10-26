package oops_Examples;
class myclassAA
{
	int a=10;
	void method_AA()
	{
		System.out.println("this is a method from Class A");
	}	
}

class myclassBB extends myclassA
{
	int b=5;
	void method_BB()
	{
		System.out.println("this is a method from Class B");
	}
}

class myclassCC extends myclassBB
{
	int c=7;
	void method_CC()
	{
		System.out.println("this is a method from Class C");
	}
}

public class multi_level_Inheritance_Example 

{
		public static void main(String args[])
		{
			System.out.println("multi level inheritance example ");
			
			
			  myclassCC obj=new myclassCC(); obj.method_A(); obj.method_BB();
			  obj.method_CC(); System.out.println("varaibla from classAA : " + obj.a);
			  System.out.println("varaibla from classBB : " + obj.b);
			  System.out.println("varaibla from classCC: " + obj.c);
			 
			
			// Object for myclassBB
			/*
			 * myclassBB obj =new myclassBB(); obj.method_A(); obj.method_BB();
			 */
			
		}
}
