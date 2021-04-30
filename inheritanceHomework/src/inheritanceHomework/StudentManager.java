package inheritanceHomework;

public class StudentManager extends UserManager {

	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " saved as an student.");
	}
	public void login(User user) {
		System.out.println("Logged in as an student with " + user.getEmail());
	}
	
	public void attendClass(Student student , Course course) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " attended the " + course.getCourseName() + " class");
	}
	
	public void rollCall(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " is here");
	}
	
	public void submitHomework(Student student,Instructor instructor) {
		System.out.println("The homework of student number " + student.getId() + " was delivered to " 
	+ instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void enrollCourse(Student student,Course course) {
		System.out.println("Student number " + student.getId() + " enrolled in " + course.getCourseName() + " course");
	}
	public void addAddress(Student student) {
		System.out.println("The address of the student named " 
	+ student.getFirstName() + " " +  student.getLastName() + " has been updated");
	}

	public void deleteAddress(Student student) {
		System.out.println("The address of the student named " 
	+ student.getFirstName() + " " +  student.getLastName() + " has been deleted");
	}
}
