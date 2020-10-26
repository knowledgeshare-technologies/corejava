package staticExamples;

class static_examples
{
	 static String title="Knowledge Share";
	 
	 public static void display()
	 {
		 System.out.println("Display the Title : " + title);
	 }
	 
	 static
	 {
		 System.out.println("This is a Static Block");
	 }
	 
}

public class staticMethodVariableBlock_examples 

{
		public static void main(String args[])
		{
			System.out.println("Main Method");	
			
			
			  System.out.println("Title is : " + static_examples.title);
			  //static_examples.display();
			 
			
			
			/*
			 * static_examples obj=new static_examples(); String abc=obj.title;
			 */
		}
}
