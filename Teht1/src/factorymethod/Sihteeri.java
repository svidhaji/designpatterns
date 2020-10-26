package factorymethod;

public class Sihteeri extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		// TODO Auto-generated method stub
		return new Kahvi();
	}

	@Override
	public Ruoka createRuoka() {
		// TODO Auto-generated method stub
		return new Burgeri();
	}

}
