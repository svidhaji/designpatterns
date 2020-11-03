package singletonpattern;

public class Singleton {
	
	String text;
	
	private Singleton () {
		text = "Hi, theres a new Singleton (testi).";
	}
	
	private static Singleton instance = null;
	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized(Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	public void myMesage() {
		System.out.println("Hi, my name is Singleton");
	}
}
