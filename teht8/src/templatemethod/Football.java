package templatemethod;

public class Football extends Game {

	@Override
	public void initialize() {
		System.out.println("Liverpool vs Manchester City is starting..");
		
	}

	@Override
	public void makePlay() {
		System.out.println("Mo Salah dices through three defenders with slick moves and he's through on goal..");
		
	}

	@Override
	public void endPlay() {
		System.out.println("GOAL: LIV 1-0 MANC \n Mo Salah with a fantastic solo effort and it results into a sublime goal!");
		
	}

}
