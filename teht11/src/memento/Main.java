package memento;

public class Main {
	  public static void main(String[] args) {
	    int players = 5;
	    String[] names = {"John", "Larry", "Conrad", "Harry", "Nicolas"};
	    Thread[] p = new Thread[players];

	    for (int i = 0; i < players; i++) {
	      Customers customers = new Customers(names[i]);
	      Riddler.getInstance().joinGame(customers);
	      p[i] = new Thread(customers);
	    }

	    for (Thread t : p) {
	      t.start();
	    }
	  }
	}
