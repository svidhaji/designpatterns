package abstractmethod;

public class L�pp�ri implements Tietokone {
	
	private String ram;
	private String ssd;
	private String cpu;
	private String hinta;
	
	public L�pp�ri(String ram, String ssd, String cpu, String hinta) {
		super();
		this.ram = ram;
		this.ssd = ssd;
		this.cpu = cpu;
		this.hinta = hinta;
	}
 
	@Override
	public String ram() {
		return this.ram;
	}
 
	@Override
	public String ssd() {
		return this.ssd;
	}
 
	@Override
	public String cpu() {
		return this.cpu;
	}
 
	@Override
	public String hinta() {
		return this.hinta;
	}
 
	@Override
	public String toString() {
		return "Lenovo ideaPad: Muisti: " + ram +  ", " + " Keskuslevy: " + ssd + ", " + " Emolevy: " + cpu +  ", " + " Hinta: " + hinta + "";
	}
 
}