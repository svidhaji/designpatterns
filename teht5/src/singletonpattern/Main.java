package singletonpattern;

public class Main {

	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1.text);
		System.out.println(singleton2.text);

	}

}
