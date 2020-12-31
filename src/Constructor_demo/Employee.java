package Constructor_demo;

public class Employee {

		String empname;
		int empid;
		
		Employee() // Default Constructor
		{
			empname="John";
			empid=101;
		}
		Employee(String name, int id) // Parameterized Constructor
		{
			empname=name;
			empid=id;
		}
	
	
	public static void main(String[] args) 
	{
		Employee obj=new Employee(); // Object Creation  // Calling a Default Constructor
		System.out.println("Employee Name : " + obj.empname);
		System.out.println("Employee ID : " + obj.empid);
		
		Employee obj2=new Employee("Paul",102);
		System.out.println("Employee Name : " + obj2.empname);
		System.out.println("Employee ID : " + obj2.empid);
		
	}

}
