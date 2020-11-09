package decoratormethod;

public class ShrimpPizza extends PizzaDecorator {

	public ShrimpPizza(Pizza pizzaCrust) {
		super(pizzaCrust);
		// TODO Auto-generated constructor stub
	}
	
	public Double getPrice() {
		return super.getPrice() + 3.50;
	}
	
	public String getFilling() {
		return super.getFilling() + "katkarapu ";
	}

}
