package oops_Examples;

abstract class car_functionality
{
	abstract void change_gear(); // Declaration

}

abstract class Car extends car_functionality
{
	void change_gear()
	{
		System.out.println("This is how the gear functions");
	}
	
	abstract void accelerate();
	
}

class Car2 extends Car
{
	void accelerate()
	{
		System.out.println("This is accelerate ");
	}
}


public class abstract_Example 
{
		public static void main(String args[])
		{
			System.out.println("This is Abstract Example");
			
			  //Car obj=new Car(); obj.change_gear();
			 
			Car2 obj=new Car2();
			
			obj.change_gear();
			obj.accelerate();
			
			//car_functionality obj =new car_functionality(); Gives Error 
			
		}
}
