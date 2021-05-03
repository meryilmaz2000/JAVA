package odev2;

public class Student extends User{
	private int studentPassword;
	private int point;
	
	public Student(){
		System.out.println("Öðrenci eklendi");
	}

	public int getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(int studentPassword) {
		this.studentPassword = studentPassword;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	
}
