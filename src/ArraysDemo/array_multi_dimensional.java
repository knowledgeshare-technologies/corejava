package ArraysDemo;

public class array_multi_dimensional 
{
		public static void main(String args[])
		{
			
			int[][] numbers = { {2,7,9},
								
								{3,6,2} 
							  }; 
			
			for(int i=0;i<2;i++)
			{
				
			   for(int j=0;j<3;j++)
			   {
				   System.out.println("Value : " + numbers[i][j]);
			   }
			   
			}
			
			
		}
}
