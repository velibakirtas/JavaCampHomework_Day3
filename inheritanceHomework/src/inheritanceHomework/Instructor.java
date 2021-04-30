package inheritanceHomework;

public class Instructor extends User {
	// e�itmen kullan�c� class�d�r
	//User class�n� miras alacakt�r
	private String department;
	
	// super metodu miras olarak al�nan s�n�f�n bulundu�u class i�indeki constructor i�inde bir objesini olu�turur
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
