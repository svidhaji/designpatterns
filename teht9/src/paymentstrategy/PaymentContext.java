package paymentstrategy;

public class PaymentContext {
	
	private Payment payment;
	
	public PaymentContext(Payment payment) {
		this.payment = payment;
	}
	
	public Payment getPayment() {
		return payment;
	}
	
	public void payAmount(double amount) {
		payment.pay(amount);
	}

}
