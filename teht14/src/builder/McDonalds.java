package builder;

public class McDonalds extends BurgerBuilder{
	
	private StringBuilder mcDonaldsBuilder;

	@Override
	public Object getBurger() {
		// TODO Auto-generated method stub
		return mcDonaldsBuilder;
	}

	@Override
	public void buildBurger() {
		mcDonaldsBuilder = new StringBuilder();
		
	}

	@Override
	public void addIngredients() {
		mcDonaldsBuilder.append("salad").append(", ");
		mcDonaldsBuilder.append("beef steak").append(", ");
		this.mcDonaldsBuilder.append("bacon").append(", ");
		this.mcDonaldsBuilder.append("mayo").append(", ");
		
	}

}
