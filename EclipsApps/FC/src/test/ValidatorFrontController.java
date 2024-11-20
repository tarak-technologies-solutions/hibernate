package test;

public class ValidatorFrontController 
{
	Messages messages;
	public ValidatorFrontController(Messages messages) {
	this.messages=messages;
	}
	
	public void readData(String msg)
	{
		if(msg.equals(""))
		{
			System.out.println("DataInvalid");
		}
		 if(msg.trim().equals(""))
		{
				System.out.println("DataInvalid");
						
		}
		 else
		 {
			 messages.message(msg);
		 }
	}
	

}
