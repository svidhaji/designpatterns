package builder;

public class Main {

	public static void main(String[] args) {
		Chef chef = new Chef();
		BurgerBuilder hesburger = new Hesburger();
		BurgerBuilder mcDonalds = new McDonalds();
		
		System.out.println("Cheese burger from Hesburger:");
		chef.setBurgerBuilder(hesburger);
		chef.makeBurger();
        System.out.println(chef.getBurger());
        System.out.println("---------");
        
        System.out.println("Beef bacon burger from McDonalds:");
        chef.setBurgerBuilder(mcDonalds);
        chef.makeBurger();
        System.out.println(chef.getBurger());
		

	}

}
