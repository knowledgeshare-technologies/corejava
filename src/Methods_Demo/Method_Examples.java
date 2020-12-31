package Methods_Demo;

public class Method_Examples {

	public static void main(String[] args) 
	{
		int a=1;
		int b=2;
		/*int x=2;
		int y=4;
		
		int c=a+b;
		int d=x+y;*/
		
		int c=add(a,b);
		
		display();
		
		System.out.println("Sum of a and b is : "  + c);
	}
		//User Defined Method
		
		public static int add(int x, int y) // Method with Parameters
		{
			int sum;
			sum=x+y;
			return sum;			
		}
		
		public static void display() // Method without parameters
		{
			System.out.println("addition successfull");
		}	
	}

