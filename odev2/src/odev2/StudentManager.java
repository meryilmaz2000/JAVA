package odev2;

public class StudentManager {
	private CourseManager courseManager;
	
	public StudentManager(CourseManager courseManager) {
		super();
		this.courseManager = courseManager;
	}
	

	public void shareWithFriend(Course course , Student student , Student studentSend) {
		System.out.println("Kurs adı : "+ course.getCourseName() + " " + student.getFirstName() + " " + student.getLastName() + " kişisi ile paylaşıldı.");
		courseManager.shareRate(course);
		pointS(studentSend);
		
	}
	
	public void pointS(Student student) {
		student.setPoint(student.getPoint()+1);
	}
	
	public void selfInfo(Student student) {
		System.out.println("Hesap bilgilerim :\n Ad-Soyad : " + student.getFirstName() + " " + student.getLastName());
		System.out.println(" Id : " + student.getId());
		System.out.println(" Puan : " + student.getPoint());
	}
}
