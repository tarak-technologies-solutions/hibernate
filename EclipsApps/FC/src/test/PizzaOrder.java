package test;

public class PizzaOrder 
{
	public static void main(String[] args) {
		Messages m=new Messages();
		ValidatorFrontController v=new ValidatorFrontController(m);
		v.readData("");//check with empty field
		v.readData("Order..");
	}
	
	

}
