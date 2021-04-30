package inheritanceHomework;

public class Instructor extends User {

	private String department;
	
	public Instructor() {
		super();
	}
	public Instructor(int id, String firstName, String lastName, String email,String department) {
		super(id, firstName, lastName, email);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
}
