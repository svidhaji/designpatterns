package paymentstrategy;

public class Main {

	public static void main(String[] args) {
		long price = 30;
		Payment debitPayment = new DebitPayment();
		Payment creditPayment = new CreditPayment();
		Payment paypalPayment = new PayPalPayment();
		
		PaymentContext context = new PaymentContext(creditPayment);
		context.payAmount(price);
		
		context = new PaymentContext(debitPayment);
		context.payAmount(price);

		context = new PaymentContext(paypalPayment);
		context.payAmount(price);
	}

}
