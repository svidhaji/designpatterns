package memento;

public class Memento {
    private String name;
    private int luckyNumber;

    public Memento(String name, int number) {
      this.name = name;
      this.luckyNumber = number;
    }

    public int getGuess() {
      return luckyNumber;
    }

    public String getName() {
      return name;
    }
  }
