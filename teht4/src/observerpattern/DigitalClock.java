package observerpattern;

import java.util.Observable;

public class DigitalClock extends Observable {

	  private ClockTimer clockTimer;

	    public DigitalClock(ClockTimer clockT) {
	        clockTimer = clockT;
	    }

	     void tick() {
	         int h = clockTimer.getHours();
	         int m = clockTimer.getMinutes();
	         int s = clockTimer.getSeconds();
	         int[] clock = {h, m, s};

	         for (int c: clock) {
	             setChanged();
	             notifyObservers(c);
	         }
	     }
}
