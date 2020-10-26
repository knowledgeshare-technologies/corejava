package controlstatements;

public class jump_statements_Examples 
{
		
	public static void main(String args[])
	{
		
		jump_statements_Examples j=new jump_statements_Examples();
		
		int z=j.sum(10, 20);
		System.out.println("z value is : " + z);
		
		j.display();
		//int a=7;
		
		
		System.out.println("Jump Examples");
		
		/*
		 * if(a==7) { System.out.println("Inside if "); break; }
		 * 
		 */
		// Break Examnple
		/*
		 * for (int i=0;i<=10;i++) { System.out.println("i values is : " + i); if(i==7)
		 * { System.out.println("i values reached 7 ,, breaking the loop"); break; } }
		 */
		
		/*
		 * // Continue; Example ( Printing odd numbers for (int i=0;i<=10;i++) {
		 * 
		 * if(i%2==0) //modolus { continue; } System.out.println("i value is : " + i); }
		 */
//		
//		Example of goto
//		continue label;
//		break label;
		
		/*
		 * out: for (int i=1;i<=100;i++) { System.out.println("Outer");
		 * 
		 * for(int j=1;i<=100;j++) { System.out.println("nested"); if(j==5) { continue
		 * out; } } }
		 */
		
		//Return Examples'

		}
	
	int sum(int x,int y)
	{
		return x+y;
	}
	
	void display()
	{
		System.out.println("Welcome");
		return;
	}
	

}
