package primitivedata_types;

public class dataTypes 
{
		
	public static void main(String args[])
	{
		
		// Accepts - true/false
		boolean check =true;
		System.out.println("Check value is : " + check);
		
		char grade='A';
		System.out.println("My graded is : " + grade);
		char a=66;
		System.out.println("ASCII Value is  : " + a);
		
		//byte 1 byte  -128 to 127
		// Comment Multiple lines - Control + Shift + /
		byte x=-128;
		System.out.println("Byte value is : " + x);
		
		//short 2 bytes  -32768 to 32767
		short y=-32768;
		System.out.println("Short  value is : " + y);
		
		//int 4 bytes -2147483648 to 2147483647
		int z=-2147483648;
		System.out.println("Integer  value is : " + z);
		
		//long 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long l=9223372036854775807L;
		System.out.println("long  value is : " + l);
		
		//float 4 bytes 7 decimal digits
		float perc=50.6755555555555555555f;
		System.out.println("float  value is : " + perc);
		
		//double 8 bytes 16 decimal digits
		double perc_1=50.6988888888888888888888888888888888;
		System.out.println("Double  value is : " + perc_1);
		
		
		String name="knowledge Share";
		System.out.println("Name is : " + name);
	}
}
