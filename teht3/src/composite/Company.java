package composite;

import java.util.ArrayList;
import java.util.List;

public class Company implements Employee {
	
	private List<Employee> empList = new ArrayList<Employee>();

	@Override
	public void showEmployees() {
		for (Employee emp : empList) {
			emp.showEmployees();
		}
	}
	
	public void addEmp (Employee e) {
		empList.add(e);
	}
	
	public void removeEmp (Employee e) {
		empList.remove(e);
	}

}
