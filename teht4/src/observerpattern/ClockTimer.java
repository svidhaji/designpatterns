package observerpattern;

import java.time.LocalDateTime;

public class ClockTimer extends Subject {
	 
	public int getHours() {
	        return LocalDateTime.now().getHour();
	    }
	public int getMinutes() {
	        return LocalDateTime.now().getMinute();
	    }
	public int getSeconds() {
	        return LocalDateTime.now().getSecond();
	    }
}
