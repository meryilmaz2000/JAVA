package odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*
		Kodlama.io projesini yazdığınızı düşünelim.

		User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)

		UserManager, InstructorManager, StudentManager için sistemde olabilecek operasyonları tahminleyip modelleyiniz. (Class-Inheritance-Method)

		Kural -- Sadece gördüğümüz konulardan yararlanmalısınız.

		Github adresinizi paylaşınız.*/
			
		Student student = new Student();
		student.setFirstName("Melikşah");
		student.setLastName("Eryılmaz");
		student.setStudentPassword(928391);
		student.setId(5);
		student.setPoint(0);
		
		Student student2 = new Student();
		student2.setFirstName("Emre");
		student2.setLastName("Alagöz");
		student2.setStudentPassword(554231);
		student2.setId(5);
		student2.setPoint(0);
		
		Student student3 = new Student();
		student3.setFirstName("Yusuf Can");
		student3.setLastName("Kahraman");
		student3.setStudentPassword(928391);
		student3.setId(5);
		student3.setPoint(0);
		
		Student[] students = {student,student2,student3};
		
		Course course = new Course();
		course.setCourseName("JAVA");
		course.setSrate(0);
		course.setVrate(0);
		course.setTime(120);
		
		Course course2 = new Course();
		course2.setCourseName("PYTHON");
		course2.setSrate(0);
		course2.setVrate(0);
		course2.setTime(300);
		
		Course course3 = new Course();
		course3.setCourseName("C#");
		course3.setSrate(0);
		course3.setVrate(0);
		course3.setTime(75);
		
		Course course4 = new Course();
		course4.setCourseName("C");
		course4.setSrate(0);
		course4.setVrate(0);
		course4.setTime(150);
		
		Course[] courses = {course,course2,course3,course4};
		
		Instructor instructor = new Instructor();
		instructor.setEmail("engin.demirog@kodlamaio.com");
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setId(7);
		instructor.setInstructorPassword(2341235);
		
		User user = new User();
		user.setFirstName("Kerem");
		user.setLastName("Varış");
		user.setId(42);
		
		CourseManager courseManager = new CourseManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager(courseManager);
		
		instructorManager.makeHost(user);
		System.out.println();
		instructorManager.studentsList(students);
		System.out.println();
		studentManager.selfInfo(student);
		System.out.println();
		courseManager.courseInfo(courses);
		System.out.println();
		studentManager.shareWithFriend(course3, student2, student3);
		studentManager.shareWithFriend(course2, student, student3);
		studentManager.shareWithFriend(course3, student, student2);
		studentManager.shareWithFriend(course3, student2, student3);
		studentManager.shareWithFriend(course, student2, student);
		studentManager.shareWithFriend(course, student3, student);
		System.out.println();
		instructorManager.studentsList(students);
		System.out.println();
		instructorManager.blockStudent(student2);
		System.out.println();
		studentManager.selfInfo(student2);
		System.out.println();
		courseManager.courseInfo(courses);
		System.out.println();
		courseManager.delete(course3, instructor);
		System.out.println();
		courseManager.courseInfo(course3);
		System.out.println();
		UserManager userManager = new UserManager(courseManager,studentManager,student2);
		userManager.watchCourse(course2);
		userManager.watchCourse(course4);
		userManager.watchCourse(course4);
		System.out.println();
		studentManager.selfInfo(student2);
		System.out.println();
		courseManager.courseInfo(courses);
		
	}

}
