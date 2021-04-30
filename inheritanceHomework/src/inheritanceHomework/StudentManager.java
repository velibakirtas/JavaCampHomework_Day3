package inheritanceHomework;

public class StudentManager extends UserManager {
	// öğrenci kullanıcısı metot classıdır
	// UserManager classını miras alacak
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " saved as an student.");
	}
	public void login(User user) {
		System.out.println("Logged in as an student with " + user.getEmail());
	}
	
	//derse giriş: attendClass
	public void attendClass(Student student , Course course) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " attended the " + course.getCourseName() + " class");
	}
	
	// yoklama onayı: rollCall
	public void rollCall(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " is here");
	}
	
	// ödev teslim etme: submitHomework
	public void submitHomework(Student student,Instructor instructor) {
		System.out.println("The homework of student number " + student.getId() + " was delivered to " 
	+ instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	// kursa kaydolma enrollCourse
	public void enrollCourse(Student student,Course course) {
		System.out.println("Student number " + student.getId() + " enrolled in " + course.getCourseName() + " course");
	}
	// adres ekleme: updateAddress
	public void addAddress(Student student) {
		System.out.println("The address of the student named " 
	+ student.getFirstName() + " " +  student.getLastName() + " has been updated");
	}
	
	// adres silme: deleteAddress
	public void deleteAddress(Student student) {
		System.out.println("The address of the student named " 
	+ student.getFirstName() + " " +  student.getLastName() + " has been deleted");
	}
}
