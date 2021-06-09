package oops;

class Course{
	public int courseId;
	public String courseName;
	public String duration;
	
	public Course(){}

	public Course(int courseId, String courseName, String duration) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
	}
	
}

class Student {
	public int studentId;
	public String studentName;
	public Course course; //Relation Property
	
	public Student(){}

	public Student(int studentId, String studentName, Course course) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}
	
}
public class AssociationDemo {

	public static void main(String[] args) {
		Course c1 = new Course(100,"Java","90 Hours");
		Student s1 = new Student(1,"abc",c1);
		System.out.println("Student Id     : "+s1.studentId);
		System.out.println("Student Name   : "+s1.studentName);
		System.out.println("Student Course : "+s1.course.courseName);
		System.out.println("Course Duration: "+s1.course.duration);

	}

}
