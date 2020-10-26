package controlstatements;

public class forLoop_example
{
		public static void main(String args[])
		{
			System.out.println("For loop example ");
			
			System.out.println("Example 1 - Normal for loop"  );
			int i;
			for(i=1;i<=10;i++)
			{
					System.out.println("i value is : "  + i );
			}
			
			System.out.println("Example 2 - Nested for loop"  );
			for (int j=1;j<=5;j++)
			{
				for(int k=1;k<=j;k++)
				{
					System.out.print("* ");
					
				}
				System.out.println();
			}
			System.out.println("Example 3 - for each "  );
			//for-each example
			int a[]= {1,2,3,4,5};
			
			for(int z:a)
			{
				System.out.println(" Array value is :  " + z);
			}

		}
}
