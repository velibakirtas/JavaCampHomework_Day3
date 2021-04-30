package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		Course course = new Course("Java&React",  "2 months Java and React Lessons","2" , "3","9.00 PM","12.30 PM");
		Course course2 = new Course("C# & Angular",  "2 months C# and Angular Lessons","2" , "3","8.00 PM","11.30 PM");


		Instructor engin = new Instructor();
		engin.setId(1);
		engin.setFirstName("Engin");
		engin.setLastName("Demiroğ");
		engin.setEmail("engindemirog@gmail.com");
		engin.setImage("pic.jpg");
		engin.setDepartment("Software");
		Student veli = new Student(2,"Veli","Bakırtaş","veli@gmail.com","a street","university");
		Student mehmet = new Student(3,"Mehmet","Bakırtaş","mehmet@gmail.com","b street","high school");
		
		instructorManager.register(engin);
		System.out.println("\n");
		studentManager.register(mehmet);
		System.out.println("\n");
		studentManager.register(veli);
		
		System.out.println("\n");
		
		instructorManager.createNewCourse(engin,course);
		
		System.out.println("\n");
		
		scriptInstructor(engin, veli, instructorManager, studentManager, course, userManager);
		
		System.out.println("\n");
		
		scriptStudent(engin, veli, instructorManager, studentManager, course, userManager);
		userManager.getUserInfo(veli);
		
		System.out.println("\n");
		
		studentManager.submitHomework(veli, engin);
		
		System.out.println("\n");
		
		studentManager.deleteAddress(veli);
		
		System.out.println("\n");
		
		userManager.logout(veli);
		
		System.out.println("\n");
		
		userManager.toComment(engin, veli);
		
		System.out.println("\n");
		
		instructorManager.createNewCourse(engin,course2);

		System.out.println("\n");
		
		studentManager.enrollCourse(veli, course);

		System.out.println("\n");
		
		instructorManager.endCourse(course, engin);

		System.out.println("\n");
		
		instructorManager.createCertificate(engin, veli, course);

		System.out.println("\n");
		
		userManager.logout(engin);
	}
	public static void scriptStudent(Instructor engin,Student veli,InstructorManager instructorManager,StudentManager studentManager,Course course,UserManager userManager) {
		studentManager.login(veli);
		studentManager.attendClass(veli, course);
		studentManager.rollCall(veli);
	}
	public static void scriptInstructor(Instructor engin,Student veli,InstructorManager instructorManager,StudentManager studentManager,Course course,UserManager userManager) {
		instructorManager.login(engin);
		instructorManager.startLesson(engin, course);
		userManager.listUsers(veli,engin);
		instructorManager.finishLesson(engin, course);
		instructorManager.giveHomework(engin);
	}
}