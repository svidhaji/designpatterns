package builder;

import java.util.ArrayList;
import java.util.List;

public class Hesburger extends BurgerBuilder {
	
	List<Object> hBurgerBuilder;
	Beef beef = new Beef();
	Salad salad = new Salad();
	Cheese cheese = new Cheese();

	@Override
	public Object getBurger() {
		return this.hBurgerBuilder;
		
	}

	@Override
	public void buildBurger() {
		this.hBurgerBuilder = new ArrayList<>();
		
	}

	@Override
	public void addIngredients() {
		this.hBurgerBuilder.add(this.beef);
		this.hBurgerBuilder.add(this.salad);
		this.hBurgerBuilder.add(this.cheese);
		
	}

}
