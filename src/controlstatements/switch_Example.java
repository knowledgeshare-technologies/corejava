package controlstatements;

public class switch_Example
{
	public static void main(String args[])
	{
		System.out.println("Test");
		
		int a=5;
		
		switch(a)
		{
		case 10:
			System.out.println("a value is 10");
			break;
		case 11:
			System.out.println("a value is 11");
			break;
		case 12:
			System.out.println("a value is 12");
			break;
		default:
			System.out.println("a value is something");
			break;
		}
	}
}
