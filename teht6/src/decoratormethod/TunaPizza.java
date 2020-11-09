package decoratormethod;

public class TunaPizza extends PizzaDecorator {

	public TunaPizza(Pizza pizzaCrust) {
		super(pizzaCrust);
		// TODO Auto-generated constructor stub
	}
	
	public Double getPrice() {
		return super.getPrice() + 4.0;
	}
	
	public String getFilling() {
		return super.getFilling() + "tonnikala, ";
	}

}