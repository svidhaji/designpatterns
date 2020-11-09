package statemethod;

public class SilentMode implements Alert {

	@Override
	public void alert() {
		System.out.println("Phone set to silent mode");
		
	}

}
