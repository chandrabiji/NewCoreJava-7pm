package basics;
class Parent{
	public Parent(){
		System.out.println("Parent Default Constructor");
	}
	public Parent(int i){
		this();
		System.out.println("Parent Parameterized Constructor");
	}
}
class Child extends Parent{
	public Child(){
		this(10);
		System.out.println("Child Default Constructor");
	}
	public Child(int i){
		super(10);
		System.out.println("Child Parameterized Constructor");
	}
}
public class RelationBetweenClasses {

	public static void main(String[] args) {
		Child child = new Child();

	}

}
