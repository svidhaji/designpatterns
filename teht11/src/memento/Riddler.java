package memento;

public class Riddler {
	  private static Riddler INSTANCE = null;

	  private Riddler() {}

	  static Riddler getInstance() {
	    if (INSTANCE == null)
	      INSTANCE = new Riddler();
	    return INSTANCE;
	  }

	  public void joinGame(Customers customer) {
	    System.out.println(customer.getName() + " liittyi peliin");
	    customer.setMemento(new Memento(customer.getName(), guessNumber()));
	  }

	  public boolean guess(Object obj, int luku) {
	    Memento memento = (Memento) obj;
	    System.out.println(memento.getName() + " guessed: " + luku + " (correct number is: " + memento.getGuess() + ")");
	    return memento.getGuess() == luku;
	  }

	  public int guessNumber() {
	    return (int) Math.floor(Math.random() * 10);
	  }

}