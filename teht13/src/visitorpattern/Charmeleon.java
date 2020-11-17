package visitorpattern;

public class Charmeleon implements Character {

	@Override
	public void attack() {
		System.out.println("Charmeleon attacks..");
		
	}

	@Override
	public void defend() {
		System.out.println("Charmeleon is retrieving and defends the attack");
		
	}

	@Override
	public void sleep() {
		System.out.println("Charmeleon is gaining strength and is resting");
		
	}

}