package visitorpattern;

public class Charizard implements Character {

	@Override
	public void attack() {
		System.out.println("Charizard attacks..");
		
	}

	@Override
	public void defend() {
		System.out.println("Charizard is retrieving and defends the attack");
		
	}

	@Override
	public void sleep() {
		System.out.println("Charizard is gaining strength and is resting");
		
	}

}
