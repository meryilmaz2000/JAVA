package odev2;

public class UserManager {

	private CourseManager courseManager;
	private StudentManager studentManager;
	private int counter = 0;
	private Student student;
	
	public UserManager(CourseManager courseManager) {
		super();
		this.courseManager = courseManager;
		counter++;
	}
	
	public UserManager(CourseManager courseManager, StudentManager studentManager, Student student) {
		super();
		this.courseManager = courseManager;
		this.studentManager = studentManager;
		this.student = student;
	}

	
	public void watchCourse(Course course) {
		System.out.println("Kurs izlendi : "+ course.getCourseName());
		courseManager.viewRate(course);
		if(counter==0) {
			studentManager.pointS(student);
			counter=0;
		}
		else {
			counter=0;
		}
	}
}
