package assignment2;


public class Customer  {

	protected String name,cnic,gender,address,passport_number;
	protected int age;
	
	
	Customer(String nam,String id,String sex,String ad,String pass,int old)
	{
		
		name=nam;
		cnic=id;
		gender=sex;
		address=ad;
		passport_number=pass;
		age=old;
	
		
	}
	
	public String getname()
	{
		return name;
		
		
	}
	
	public String getcnic()
	{
		return cnic;
		
		
	}
	
	public String getsex()
	{
		return gender;
		
		
	}
	
	public String address()
	{
		return address;
		
		
	}
	
	public int getage()
	{
		return age;
		
		
	}
	
	public String getpassport()
	{
		return passport_number;
		
		
	}
	
	void printCustomerDetails()
	{
		
		System.out.println("Check your details");
		System.out.println("Name:"+getname());
		System.out.println("Age:"+getage());
		System.out.println("Gender:"+getsex());
		System.out.println("CNIC:"+getcnic());
		System.out.println("Address:"+address());
		System.out.println("Passport Number:"+getpassport());
		
		
		
		
		
		
		
		
	}
	
	
	
}
