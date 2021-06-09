package basics;
class Student {
	//Instance Variables
	public int sid;
	public String sname;
	public int marks;
	
	//Parameterized Constructor
	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	//Grade Method
	public void grade(){
		if(this.marks>90){
			System.out.println("Student Grade : A Grade");
		}else{
			System.out.println("Student Grade : B Grade");
		}
	}
	public String getStudentName(){
		return this.sname;
	}

	
}
public class ParameterizedConstructorDemo {
	
	
	//static method
	public static void m1(){
		System.out.println("From Static Method");
	}
	

	public static void main(String[] args) {
		Student s1 = new Student(100,"abc",95);
		System.out.println("Student Name : "+s1.getStudentName());
		s1.grade();
		m1();
		

	}

}
