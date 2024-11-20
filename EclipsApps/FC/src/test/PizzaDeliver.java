package test;

public class PizzaDeliver 
{
	
	public static void main(String[] args) {
		
		Messages m=new Messages();
		ValidatorFrontController v=new ValidatorFrontController(m);
		v.readData("");//check with empty field
		v.readData("Delivery..");
		
	}

}
