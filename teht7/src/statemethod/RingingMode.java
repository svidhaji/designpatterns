package statemethod;

public class RingingMode implements Alert {

	@Override
	public void alert() {
		System.out.println("Phone is in ringing mode");
		
	}
}
