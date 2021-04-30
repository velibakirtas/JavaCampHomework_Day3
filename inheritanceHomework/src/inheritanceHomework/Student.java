package inheritanceHomework;

// getMyLesson metodu �zerinde u�ra��lacak
public class Student extends User {
	// ��renci kullan�c�s� class�d�r
	// User class�n� miras alacak
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

