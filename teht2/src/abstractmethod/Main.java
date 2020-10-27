package abstractmethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Client calls ComputerFactory to Create Computer with different configurations
		Tietokone pc = TietokoneF.haeTietokone(new PCT("32GB", "510 GB", "AMD Ryzen 7", "2499€"));
		System.out.println(pc);
		
		Tietokone kannettava = TietokoneF.haeTietokone(new LäppäriT("16 GB", "1 TB", "Intel i9-9100i", "1249€"));
		System.out.println(kannettava);
	}

	}

