package inheritanceHomework;


public class Student extends User {

	private String address;
	private String educationStatus;

	public Student() {
		super();
	}
	public Student(int id, String firstName, String lastName, String email,String address,
			String educationStatus) {
		super(id, firstName, lastName, email);
		this.address = address;
		this.educationStatus = educationStatus;

	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
	public String getEducationStatus() {
		return educationStatus;
	}
	public void setEducationStatus(String educationStatus) {
		this.educationStatus = educationStatus;
	}

}

