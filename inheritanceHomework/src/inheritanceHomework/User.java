package inheritanceHomework;

public class User {
	// temel kullan�c� s�n�f�
	// ortak kullan�c� bilgileri yer alacak
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String image;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String email) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}