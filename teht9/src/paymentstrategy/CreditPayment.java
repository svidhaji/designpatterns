package paymentstrategy;

public class CreditPayment implements Payment{

	@Override
	public void pay(double amount) {
		amount -= amount * 3 / 100; // 3% discount when using credit card 
		 System.out.println("Total sum after discount, Payment method: Credit: " + amount + "€");
	}

}
