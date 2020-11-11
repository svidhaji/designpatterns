package decoratormethod;

public class CheesePizza extends PizzaDecorator {

	public CheesePizza(Pizza pizzaCrust) {
		super(pizzaCrust);
		// TODO Auto-generated constructor stub
	}
	
	public Double getPrice() {
		return super.getPrice() + 3.5;
	}
	
	public String getFilling() {
		return super.getFilling() + "aurajuusto";
	}

}