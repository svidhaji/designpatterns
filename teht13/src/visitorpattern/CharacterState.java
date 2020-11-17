package visitorpattern;

public class CharacterState implements Visitor {
	
	Charizard charizard = new Charizard();
	Charmander charmander = new Charmander();
	Charmeleon charmeleon = new Charmeleon();

	@Override
	public void visit(Context c) {
		   if(c.getXp() < 100) {
	            c.setState(charmander);
	        } else if(c.getXp() > 120 && c.getXp() < 200) {
	            c.setState(charmeleon);
	        } else {
	            c.setState(charizard);
	        }
	    }
		
	}

