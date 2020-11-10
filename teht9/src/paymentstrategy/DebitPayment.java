package paymentstrategy;

public class DebitPayment implements Payment{

	@Override
	public void pay(double amount) {
		amount -= amount * 5 / 100; // 5% discount when using debit card
		System.out.println("Total sum after discount, Payment method: Debit: " + amount + "€");
	}

}
