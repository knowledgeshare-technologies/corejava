package staticExamples;

public class static_examples_sameClass 

{
		static int x=10;
		public static void display()
		{
			
			System.out.println("x value is : " + x);
		}
		static
		{
			System.out.println("this is a static block");
		}
		public static void main(String args[])
		{
			// Static block is called first before 19th Statement
			System.out.println("main Method");
			System.out.println(x);
			display();
		}
}
