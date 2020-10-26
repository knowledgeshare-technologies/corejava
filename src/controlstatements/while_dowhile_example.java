package controlstatements;

public class while_dowhile_example 
{
	public static void main(String argsp[])
	{
		System.out.println("While loop example ");
		
		int i=1;
		while(i<=10)  // unitl the condition is true, the while loop is repeated
		{
				System.out.println("i value is : "  + i);
				++i;
		}
		
		
		System.out.println("do while Example ..."); // do while loop is executed atleast once, before checking the condition
		int j=1;
		do
		{
			System.out.println(" j value is : " + j);
			++j;
		}while(j<=10);
		
		System.out.println("For loop example ");
		int k;
		for(k=1;k<=10;k++)
		{
				System.out.println("k value is : "  + k );
		}
	}
}
