package inheritanceHomework;


public class Course {

	private String courseName;
	private String courseDetail;
	private String courseLength;
	private String lessonLength;
	private String startTime;
	private String finishTime;
	
	public Course() {
		
	}
	public Course(String courseName,String courseDetail,String courseLength,String lessonLength,
			String startTime,String finishTime) {
		this();
		this.courseName = courseName;
		this.courseDetail = courseDetail;
		this.courseLength = courseLength;
		this.lessonLength = lessonLength;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDetail() {
		return courseDetail;
	}
	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}
	public String getCourseLength() {
		return courseLength;
	}
	public void setCourseLength(String courseLength) {
		this.courseLength = courseLength;
	}
	public String getLessonLength() {
		return lessonLength;
	}
	public void setLessonLength(String lessonLength) {
		this.lessonLength = lessonLength;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
}
