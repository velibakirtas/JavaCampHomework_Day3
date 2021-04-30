package inheritanceHomework;

public class InstructorManager extends UserManager{

	@Override
	public void register(User user) {
		super.register(user);
		System.out.println(user.getFirstName()+" "+user.getLastName()+" saved as an instructor");
	}
	
	@Override
	public void login(User user) {
		System.out.println("Logged in as an instructor with " + user.getEmail());
	}
	
	public void startLesson(Instructor instructor, Course course) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " started the " + course.getCourseName() + " lesson");
	}
	
	public void finishLesson(Instructor instructor, Course course) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " finished the " + course.getCourseName() + " lesson");
	}
	
	public void giveHomework(Instructor instructor) {
		System.out.println("Homework was given by " + instructor.getFirstName() +" " + instructor.getLastName());
	}
	
	public void createNewCourse(Instructor instructor,Course course) {
		System.out.println(course.getCourseName() + " course created by an instructor named " + instructor.getFirstName());
	}
	
	public void endCourse(Course course,Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + "'s " + course.getCourseName() + " course ended.");
	}
	
	public void createCertificate(Instructor instructor,User user,Course course) {
		System.out.println("Certificate was created by " + instructor.getFirstName() +" "+ instructor.getLastName());
		System.out.println("Certificate Information\n"+
		user.getImage() + 
		"\nName: " +user.getFirstName()+
		"\nSurname: " + user.getLastName()+
		"\nStudent No: " + user.getId()+
		"\nEmail: " + user.getEmail() +
		"\nCourse: " + course.getCourseName());
	}
	
	public void addDepartment(Instructor instructor,String department) {
		System.out.println(department + " department added");
	}
}
