package memento;

public class Customers implements Runnable {
	  private Memento memento;
	  private String name;

	  public Customers(String name) {
	    this.name = name;
	  }
	  
	  public Memento getMemento() {
		    return memento;
		}

	  public void setMemento(Memento memento) {
	    this.memento = memento;
	  }

	  public String getName() {
	    return name;
	  }

	  @Override
	  public void run() {
	    try {
	      while (true) {
	        int number = guessNumber();
	        if (Riddler.getInstance().guess(getMemento(), number)) {
	          System.out.println(getName() + " guessed the right number");
	          break;
	        }
	      }
	    } catch (Exception e) {
	      System.out.println(e);
	    }
	  }

	  public int guessNumber() {
	    return (int) Math.floor(Math.random() * 10);
	  }
	}
