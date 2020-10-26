package oops_Examples;

 class poly_A
{
	public void display()
	{
		System.out.println("this is a display method inside class poly_A");
		System.out.println("akjsdhkjashdjksdahdkjasdhkjadsjk");
	}
}
 

 class polymorpshim_method_overriding_example extends poly_A
{
	 public void display()
		{
			System.out.println("this is a display method inside class polymorpshim_method_overriding_example");
		}
	 
	 public static void main(String args[])
	 {
		 System.out.println("Method Overriding example ");
		 
			/*
			 * poly_A obj=new polymorpshim_method_overriding_example(); obj.display();
			 */
		 
		 poly_A obj=new polymorpshim_method_overriding_example(); 
		 obj.display();
		 
		 
		 
		 
	 }
	 
	 
}
