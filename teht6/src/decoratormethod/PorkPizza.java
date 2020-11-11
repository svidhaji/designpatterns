package decoratormethod;

public class PorkPizza extends PizzaDecorator {

	public PorkPizza(Pizza pizzaCrust) {
		super(pizzaCrust);
	}
	
	public Double getPrice() {
		return super.getPrice() + 3.0;
	}
	
	public String getFilling() {
		return super.getFilling() + "Kinkku, ";
	}

}