package templatemethod;

public abstract class Game {
	public abstract void initialize();
	public abstract void makePlay();
	public abstract void endPlay();
	
	public final void play() {
		initialize();
		makePlay();
		endPlay();
	}
}
