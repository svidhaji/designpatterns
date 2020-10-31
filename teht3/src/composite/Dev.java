package composite;

public class Dev implements Employee {
	
	private int empId;
	private String firstName;
	private String lastName;
	private String assignment;
	
	public Dev(int empId, String firstName, String lastName, String assignment) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.assignment = assignment;
	}

	@Override
	public void showEmployees() {
		System.out.println(empId + ":" + " " + firstName + " " + lastName + ":" + " " + assignment);
		
	}


}
