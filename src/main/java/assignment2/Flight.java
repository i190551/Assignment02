package assignment2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Flight extends database  {

	
	
	String destination,origin;
	int seats;
	String flightno;
	String date;
	
	Flight()
	{}
	public void setFlight(String des,String ori,String fl,String da)
	{
		
		destination=des;
		origin=ori;
		flightno=fl;
		date=da;
	}
	
	
	public void searchflights(String to,String from)
	{
		for(int i=0;i<12;i++)
		{
			
			if(to.equals(flightto[i])&&from.equals(flightfrom[i]))
			{
				
				System.out.println("Yes this flight is available");
				System.out.println("Flight Information:\n"+flightfrom[i]+" TO "+flightto[i] );
				System.out.println("Number of Seats Available are:"+flightseats[i]);
				System.out.println("Date:"+flightdate[i]);
				System.out.println("Flight #:"+flightnum[i]);
				
				break;
				
			}
			else if (i==11)
			{
				try {
				throw new travelException();
				}catch(travelException tE)
				{
					tE.printStackTrace();
				}
			}
			
			
			
		}
		
		
			
		
		
	}
	
	public void bookflight(String nam,String id,String sex,String ad,String pass,int ag)
	{
		
		Customer cus=new Customer(nam,id,sex,ad,pass,ag);
		
		
		
		
		System.out.println("The flights available are:");
		for(int i=0;i<12;i++)
		{
			
			
			System.out.println(i+1+". FROM "+flightfrom[i]+" TO " +flightto[i]);
			
			
			
			
		}
		
		Scanner book=new Scanner(System.in);
		System.out.println("Which flight do you want to book (1-4)");
		
		int option=book.nextInt();
		

			System.out.println("Number of Tickets available are:"+flightseats[option-1]);
		
		
			int tickets=flightseats[option-1];
			
			if(tickets==0)
			{
				try {
				throw new ticketunavailableException();
			
				}catch(ticketunavailableException tick)
				{
					tick.printStackTrace();
				}
			}
			setFlight(flightto[option-1],flightfrom[option-1],flightnum[option-1],flightdate[option-1]);
			flightseats[option-1]=flightseats[option-1]-1;
			
			Random rand = new Random();
			
		 int ticketID=rand.nextInt(1000000);
		 
		 
		 
		 
		 System.out.println("\n*******************Customer Information*******************");
		 cus.printCustomerDetails();
		 System.out.println("\n*******************Flight Details*******************");
		 printFlightdetails();
		 
		 
		 Scanner t=new Scanner(System.in);
		 System.out.println("\nPress 1 to buy a ticket:");
		 int choicetick=t.nextInt();
		 
		 if(choicetick==1)
		 {
		 
		 
		 Ticket T=new Ticket(ticketID,price[option-1]);
			
		 T.printTicket(cus.getname(),flightnum[option-1],flightfrom[option-1], flightto[option-1]);
		
		 
		 } 
		 
		 else
		 {try {
			 throw new invalidticket("Invalid Option, Cannot print the ticket");
		 }catch(invalidticket it)
		 {
			 it.printStackTrace();
		 }
		 }
		
		
	FileWriting(nam, id, ticketID, flightnum[option-1], getorigin(), getdestination(),price[option-1],flightdate[option-1]);
		
		
	}
	
	
	
	
	public String getdestination()
	{
		return destination;
	}
	
	public String getorigin()
	{
		
		return origin;
		
	}
	
	public String getnumflight()
	{
		
		return flightno;
		
	}

	
	public int getseats()
	{
		return seats;
	}
	
	public void printFlights()
	{
		for(int i=0;i<12;i++)
		{
			System.out.println((i+1)+".FROM "+flightfrom[i]+" TO "+flightto[i]+" ON "+flightdate[i]);
		}
	}
	
	public void printFlightdetails()
	{
		
		System.out.println("Your Flight Number is "+getnumflight());
		System.out.println("Travelling From "+getorigin());
		System.out.println("Travelling To "+getdestination());
		System.out.println("Date:"+date);
		
	}
	
	public void FileWriting(String customername,String customerid,int ticketnumber,String flightnumber,String from,String to,double price,String day)
	{
		
		
	
	FileWriter myfile = null; 
	BufferedWriter b = null; 
	PrintWriter p = null;
	try { 
		myfile = new FileWriter("file.txt", true); 
		b = new BufferedWriter(myfile); 
		p = new PrintWriter(b); 
		p.write("\n\nReservation Details");
		  
		 p.write("\nCustomer Name:"+customername);
		  
		  p.write("\nCNIC:"+customerid);
		  
		  
		  p.write("\nTicket Number:"+ticketnumber);
		  
		  p.write("\nFlight Number"+flightnumber);
		  
		  p.write("\nOrigin:"+from); p.write("\nDestination:"+to);
		  p.write("\nDate:"+day); p.write("\nTotal Due:"+price);
		 
		
		p.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { 
			try { 
				p.close(); 
				b.close(); 
				myfile.close(); 
				} catch (IOException io) { }
		}
	

	}
	}

		
		
		
	
	
	
	
	
	

