package decoratormethod;

public class Main {

public static void main(String[] args) {
		
		Pizza tunaPizza = new ShrimpPizza(new TunaPizza(new KebabPizza(new PizzaFactory())));
		Pizza porkPizza = new CheesePizza(new PorkPizza(new PizzaFactory()));
		
        System.out.println("1. Pizza maksaa: " + tunaPizza.getPrice() +" €");
        System.out.println(tunaPizza.getFilling());
        
        System.out.println("2. Pizza maksaa: " + porkPizza.getPrice() + " €");
        System.out.println(porkPizza.getFilling());
	}

}
