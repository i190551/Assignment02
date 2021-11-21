package assignment2;
import java.util.Scanner;
import java.util.*;


public class main {

	public static void main(String[] args) throws invalidcnicException ,genderException{
		
		 String name,cnic,gender,address,passport_number;
		int age;
		Scanner sc=new Scanner(System.in);
		Flight fly=new Flight();
		int choice;
	while(true) {
		System.out.println("\n..........Welcome to the Local Airlines..........\n");
		System.out.println("1. Search a flight\n2. Book a flight\n3. Show All Flights\n4. Cancel");
		
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			Scanner search=new Scanner(System.in);
			String to;
			System.out.println("From:");
			String from=search.nextLine();
			//.next();
			System.out.println("To:");
			
			 to=search.nextLine();
			
			fly.searchflights(to,from);
			
			
		break;
		
		case 2:

			
			Scanner customer=new Scanner(System.in);
			System.out.println("Customer Details:");
			System.out.println("Enter your name");
			name=customer.nextLine();
			System.out.println("Enter your age");
			age=customer.nextInt();
			try {
			if(age<18)
			{
				
				throw new UnderAgeException("You cannot book, your age is below 18");
			}
			}catch (UnderAgeException e)
			{
				e.printStackTrace();
			}
			/*
			 * }catch(UnderAgeException uae) { uae.printStackTrace(); }
			 */
			//customer.next();
			System.out.println("Enter your Gender\n(1.male\t2.female)");
			int gen=customer.nextInt();
			if(gen==1)
			{
				gender="male";
			}
			
			else if(gen==2)
			{
				gender="female";
				
				
			}
			
			else
			{
				
				throw new genderException();
				
			}
			
			
			
			
//			customer.next();
			System.out.println("Enter your CNIC");
			cnic=customer.next();
		
			try {
			if (cnic.length()!=13)
			{
				
				throw new invalidcnicException("CNIC is invalid");
				
			}
			}catch(invalidcnicException cn)
			{
				cn.printStackTrace();
			}
			
			Scanner ad=new Scanner(System.in);
			System.out.println("Enter your address");
			address=ad.nextLine();
			System.out.println("Enter your Passport Number");
			passport_number=ad.nextLine();
			try {
			if (passport_number.length()!=9)
			{
				
				throw new PassportException();
				
			}
			}catch(PassportException pe)
			{
				pe.printStackTrace();
			}
			System.out.println("Thankyou!");
			fly.bookflight(name,cnic,gender,address,passport_number,age);
		
			
		
		break;
		
		case 3:
			fly.printFlights();
			break;
		case 4:
			
			System.out.println("Thankyou!");
		break;
		default:
			try {
			throw new invalidInput();
			}catch(invalidInput invalid)
			{
				invalid.printStackTrace();
			}
		}
		
		
		
	}
		
		
	}

}