package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    }

	@Override
	public Ruoka createRuoka() {
		// TODO Auto-generated method stub
		return new Lohikiusaus();
	};

}
