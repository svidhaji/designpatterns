package templatemethod;

public class Basketball extends Game {

	@Override
	public void initialize() {
		System.out.println("NBA Finals 2020 Game 6:\n Lakers vs Miami Heat");
		
	}

	@Override
	public void makePlay() {
		System.out.println("Rondo kicks the ball to LeBron in transition..");
		
	}

	@Override
	public void endPlay() {
		System.out.println("Perfectly executed! LeBron attacks the open space and lobs it to AD and the Lakers lead 42-28 with 3:05 left");
		
	}

}
