package statemethod;

public class Main {

	public static void main(String[] args) {
		
		MobileState mobile = new MobileState();
		mobile.alert();
		
		mobile.setState(new VibratingMode());
		mobile.alert();
		
		System.out.println("Setting mobile to silent.....");
		
		mobile.setState(new SilentMode());
		mobile.alert();

	}

}
