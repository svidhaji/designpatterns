package adapter;

public class Converter implements ConvertHelper {
	private Currency currency;
	
	public Converter(Currency c) {
		this.currency = c;
	}
	
	private double convertDollartoEuro(double value) {
		return value * 0.845275;
	}

	@Override
	public double getCurrency() {
		// TODO Auto-generated method stub
		return convertDollartoEuro(currency.getCurrency());
	}

}
