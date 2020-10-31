package composite;

public class Main {

	public static void main(String[] args) {
		
		Dev dev = new Dev(1, "Jaakko", "Mustonen", "Junior Dev");
		Dev dev2 = new Dev(4, "Lukas", "Nurminen", "Dev Trainee");
		Company c = new Company();
		c.addEmp(dev);
		c.addEmp(dev2);
		
		CEO ceo = new CEO(3, "Juha", "Nieminen", "CEO");
		CEO ceo2 = new CEO(9, "Pekka", "Karvas", "Manager/Coordinator");
		CEO ceo3 = new CEO(7, "Pekka", "Karvas", "Instructor");
		
		Company cCeo = new Company();
		cCeo.addEmp(ceo);
		cCeo.addEmp(ceo2);
		cCeo.addEmp(ceo3);
		
		Company company = new Company();
		company.addEmp(c);
		company.addEmp(cCeo);
		
		company.showEmployees();

	}

}
