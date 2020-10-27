package abstractmethod;

public class PCT implements TietokoneT {
	 
	private String ram;
	private String ssd;
	private String cpu;
	private String hinta;
	
	
	public PCT(String ram, String ssd, String cpu, String hinta) {
		super();
		this.ram = ram;
		this.ssd = ssd;
		this.cpu = cpu;
		this.hinta = hinta;
	}
 
	@Override
	public Tietokone luoKone() {
		return new PC(ram, ssd, cpu, hinta);
	}
 
}