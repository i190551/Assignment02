package assignment2;

public class Ticket{

	
	int ticketno;
	int nticket;
	double price;
	
	
	Ticket(int ticketid,double pri)
	{
		ticketno=ticketid;
		price=pri;
		
	}
	
	
	int getticketnum()
	{
		
		return ticketno;
		
	}
	
	double getprice()
	{
		return price;
	}

	
	void printTicket(String Name,String flightnumber,String FROM,String TO)
	{
		
		
		System.out.println("********************************************Local Airlines********************************************");

		System.out.println("Ticket Number: "+getticketnum()+"\t\t| Name:"+Name);

		System.out.println("Flight Number: "+flightnumber+"\t\t| Flight #"+flightnumber+"\t Ticket #"+getticketnum());
		System.out.println("Passenger Name:"+Name+"\t\t| From:"+FROM);
		System.out.println("FROM:"+FROM+"   TO   "+TO+"\t| To:"+TO);

		System.out.println("Price:Rs"+getprice()+"\t\t\t| Price:Rs"+getprice());
		
		
	}
	
	
	
	
	
}
