package paymentstrategy;

public class PayPalPayment implements Payment {

	@Override
	public void pay(double amount) {
		amount -= amount * 7 / 100; // 5% discount when using PayPal
		System.out.println("Total sum after discount, Payment method: PayPal: " + amount + "€");
		
	}

}
