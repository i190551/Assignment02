package assignment2;

public class PassportException extends Exception {

	
	PassportException()
	{
		super("Invalid Passport Number");
	}
	
	PassportException(String text)
	{
		super(text);
	}
}
