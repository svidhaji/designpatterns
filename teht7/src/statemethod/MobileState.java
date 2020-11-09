package statemethod;

public class MobileState {
	private Alert currentState;
	
	public MobileState() {
		currentState = new RingingMode();
	}
	
	public void setState(Alert alertState) {
		currentState = alertState;
		
	}
	
	public void alert() {
		currentState.alert();
	}

}
