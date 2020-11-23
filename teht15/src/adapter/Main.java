package adapter;

public class Main {

	public static void main(String[] args) {
		Currency dollar = new Dollar(200);
		Converter converter = new Converter(dollar);
		
		System.out.println("200 USD to EUR: " + converter.getCurrency() + " €");

	}

}
