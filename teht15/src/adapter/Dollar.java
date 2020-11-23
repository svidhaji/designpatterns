package adapter;

public class Dollar implements Currency {
	private double dollar;
	
	public Dollar(double money) {
		this.dollar = money;
	}

	@Override
	public double getCurrency() {
		return this.dollar;
	}

}
