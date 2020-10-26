package mypackage_2;

import mypackage_1.ClassA;

public class ClassB

{
		public static void main(String args[])
		{
			ClassA obj=new ClassA();
			obj.display_name();
			obj.display_location();
			System.out.println("Name is : "  + obj.name);	
		}
}
