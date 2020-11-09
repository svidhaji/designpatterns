package templatemethod;

public class Main {

	public static void main(String[] args) {
		Game football = new Football();
		football.play();
		
		System.out.println("***-Switching to basketball-***");
		
		Game basketball = new Basketball();
		basketball.play();

	}

}
