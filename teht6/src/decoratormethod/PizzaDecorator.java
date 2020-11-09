package decoratormethod;

abstract class PizzaDecorator implements Pizza {

		private final Pizza pizzaCrust;

		public PizzaDecorator(Pizza pizzaCrust) {
			this.pizzaCrust = pizzaCrust;
		}

		public Double getPrice() {
			return pizzaCrust.getPrice();
		}

		public String getFilling() {
			return pizzaCrust.getFilling();
		}


	}
