package decoratormethod;

public class KebabPizza extends PizzaDecorator {

	public KebabPizza(Pizza pizzaCrust) {
		super(pizzaCrust);
		// TODO Auto-generated constructor stub
	}
	
	public Double getPrice() {
		return super.getPrice() + 2.0;
	}
	
	public String getFilling() {
		return super.getFilling() + "kebab, ";
	}

}
