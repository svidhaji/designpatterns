package builder;

public class Chef {
	private BurgerBuilder bBuilder;
	
	public void makeBurger() {
	    bBuilder.buildBurger();
	    bBuilder.addIngredients();
	    bBuilder.getBurger();
	 }

	public void setBurgerBuilder(BurgerBuilder bBuilder) {
	    this.bBuilder = bBuilder;
	 }

	public Object getBurger() {
	    return bBuilder.getBurger();
	 }
}
