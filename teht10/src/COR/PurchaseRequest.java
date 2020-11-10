package COR;

public class PurchaseRequest {
	
	private double money;
	private String reason;
	private String name;
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
 
	public PurchaseRequest(double money, String reason, String name) {
		super();
		this.money = money;
		this.reason = reason;
		this.name = name;
	}
 
	public String getReason() {
		return reason;
	}
 
	public void setReason(String reason) {
		this.reason = reason;
	}
 
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public PurchaseRequest() {
		super();
	}
 
	@Override
	public String toString() {
		return "PurchaseRequest [Money=" + money + ", reason=" + reason + ", name=" + name + "]";
	}


}
