package composite;

public class CEO implements Employee {
	
	public int empId;
	public String firstName;
	public String lastName;
	private String assignment;
	
	public CEO(int empId, String firstName, String lastName, String assignment) {
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
