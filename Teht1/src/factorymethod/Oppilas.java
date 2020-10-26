package factorymethod;

public class Oppilas extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		// TODO Auto-generated method stub
		return new Siideri();
	}

	@Override
	public Ruoka createRuoka() {
		// TODO Auto-generated method stub
		return new MakaroniLaatikko();
	}

}
