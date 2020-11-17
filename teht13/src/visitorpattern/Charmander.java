package visitorpattern;

public class Charmander implements Character {

	@Override
	public void attack() {
		System.out.println("Charmander attacks..");
		
	}

	@Override
	public void defend() {
		System.out.println("Charmander is retrieving and defends the attack");
		
	}

	@Override
	public void sleep() {
		System.out.println("Charmander is gaining strength and is resting");
		
	}

}

