package abstractmethod;

public class LäppäriT implements TietokoneT {
	 
	private String ram;
	private String ssd;
	private String cpu;
	private String hinta;
	
	public LäppäriT(String ram, String ssd, String cpu, String hinta) {
		super();
		this.ram = ram;
		this.ssd = ssd;
		this.cpu = cpu;
		this.hinta = hinta;
	}
 
	/**
	 * Overridden method of AbstractComputerFactory
	 * which returns reference of super interface Computer
	 */
	@Override
	public Tietokone luoKone() {
		return new Läppäri(ram, ssd, cpu, hinta);
	}
 
}