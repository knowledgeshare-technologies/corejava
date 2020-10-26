package oops_Examples;

class encap_data
{
	private int account_number;
	private double account_balance;
	
	public int get_Account_number()
	{
		return account_number;
	}
	
	public double get_Account_balance()
	{
		return account_balance;
	}
	
	public void set_Account_number(int acountnumber)
	{
		account_number=acountnumber;
	}
	
	public void set_Account_balance(double accountbalance)
	{
		account_balance=accountbalance;
	}
	
	
}


public class encapsulation_example 
{
	public static void main(String args[])
	{
		encap_data obj=new encap_data();
		
		obj.set_Account_number(123);
		obj.set_Account_balance(100);
		
		/*
		 * int acount_number= obj.get_Account_number();
		 * System.out.println("Account Number is : " + acount_number); double
		 * account_balance= obj.get_Account_balance();
		 * System.out.println("Account Balance is : " + account_balance);
		 */
			
		
		System.out.println("Account Number is : " + obj.get_Account_number()); 
		System.out.println("Account Number is : " + obj.get_Account_balance()); 
		
		
	}

}
