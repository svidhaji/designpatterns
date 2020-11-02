package observerpattern;

public class Main {

	public static void main(String[] args) {
		 ClockTimer clockTimer = new ClockTimer();
	        DigitalClock digitalClock = new DigitalClock(clockTimer);
	        Subject subject = new Subject();
	        digitalClock.addObserver(subject);
	        digitalClock.tick();

	}

}
