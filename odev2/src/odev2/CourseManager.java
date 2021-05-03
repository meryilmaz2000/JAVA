package odev2;

public class CourseManager {
	public void add(Course course , Instructor instructor) {
		System.out.println("Kurs Eklendi : "+ course.getCourseName());
	}
	public void delete(Course course , Instructor instructor) {
		System.out.println("Kurs silindi : "+ course.getCourseName());
		course.setCourseName(null);
		course.setSrate(0);
		course.setTime(0);
		course.setVrate(0);
	}
	public void shareRate(Course course) {
		System.out.println("Kurs paylaþýldý (+1).");
		course.setSrate(course.getSrate()+1);
	}
	public void viewRate(Course course) {
		System.out.println("Kurs izlendi (+1).");
		course.setVrate(course.getVrate()+1);
	}
	public void courseInfo(Course course) {
		System.out.println("Kurs adý : "+ course.getCourseName());
		System.out.println("Kurs süresi : " + course.getTime());
		System.out.println("Kursun izlenme sayýsý : " + course.getVrate());
		System.out.println("Kursun paylaþým sayýsý : " + course.getSrate());
	}
	
	public void courseInfo(Course[] courses) {
		System.out.println("  KURS LÝSTESÝ :");
		int counter = 1;
		for(Course course : courses) {
			System.out.println("---------- "+counter+" ----------");
			System.out.println("Kurs adý : "+ course.getCourseName());
			System.out.println("Kurs süresi : " + course.getTime());
			System.out.println("Kursun izlenme sayýsý : " + course.getVrate());
			System.out.println("Kursun paylaþým sayýsý : " + course.getSrate());
			counter ++;
		}

	}
}
