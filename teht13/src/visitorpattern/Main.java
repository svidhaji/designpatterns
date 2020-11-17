package visitorpattern;

public class Main {

	public static void main(String[] args) {
		CharacterState visitor = new CharacterState();
		Context character1 = new Context(visitor);
		Context character2 = new Context(visitor);
		
		character1.attack();
		character1.defend();
		character1.attack();
		character1.sleep();
		
		System.out.println(" -------- ");
		
		character2.attack();
		character2.defend();
		character2.sleep();
		character2.defend();
		character2.attack();
		

	}

}
