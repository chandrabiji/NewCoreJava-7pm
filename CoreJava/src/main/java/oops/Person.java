package oops;
//Class = Common(Variables + Methods)
public class Person {
	
	//Common Variables
	public String pname;
	public int age;
	public int height;
	public int weight;
	public String color;
	
	//Common Method
	public void eat(){
		if(weight>75){
			System.out.println("Please take Veg Food");
		}else{
			System.out.println("Please take Non-Veg Food");
		}
	}
	
	public void sleep(){
		if(age<12){
			System.out.println("Sleep at least 9 hours");
		}else{
			System.out.println("Sleep at least 8 hours");
		}
	}
	

	public static void main(String[] args) {
		Person child = new Person();//Object = instance of a class
		
		child.age=9;
		child.pname="Sai";
		child.height=45;
		child.weight=30;
		child.color="white";
		
		child.eat();
		child.sleep();
	}

}
