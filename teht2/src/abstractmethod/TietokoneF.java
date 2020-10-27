package abstractmethod;

public class TietokoneF {
		 
	private TietokoneF(){}
		
	public static Tietokone haeTietokone(TietokoneT tietokoneT) {
			return tietokoneT.luoKone();
	}
}
