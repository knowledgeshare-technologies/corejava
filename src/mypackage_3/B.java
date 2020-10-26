package mypackage_3;

class A
{
	private void display()
	{
		System.out.println("This is private ");
	}
}

public class B 
{
		public static void main(String args[])
		{
			A obj= new A();
			//obj.display(); // Error 
		}
}
