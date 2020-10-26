package ArraysDemo;

public class array_single_dimensional 
{
	public static void main(String args[])
	{
		int numbers[];
		numbers = new int[6];
		
		/*
		 * numbers[0]=50; numbers[1]=54; numbers[2]=62; numbers[3]=75; numbers[4]=82;
		 * numbers[5]=89;
		 */
		numbers = new int[]{ 50,54,62,75,82,89 }; 
		
		for(int i=0;i<6;i++)
		{
			System.out.println("value : " + numbers[i]);
		}
		
		
		String names[];
		names=new String[6];
		names=new String[] {"John","Mark","Kiran","Sandeep","Sankar","praveen"};
		
		for(int i=0;i<6;i++)
		{
			System.out.println("Name : " + names[i]);
		}
		
		
	}
}
