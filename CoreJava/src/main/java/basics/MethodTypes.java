package basics;

public class MethodTypes {
	//Instance Method
	public void sayHello(){
		System.out.println("Welcome to Java");
	}
	
	public int add(int i, int j){
		return i+j;
	}
	//Static Method or Class Level Method
	public static void m1(){
		System.out.println("From Static Method");
	}
	
	//Final Method 
	public final void m2(){
		System.out.println("From final Method");
	}
	//synchronized Method
	public synchronized void m3(){
		System.out.println("From synchronized Method");
	}
	
	//public abstract void m4();
	
	private void m4(){
		System.out.println("From Private Method");
	}

	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();//Instance or Object
		obj.sayHello();
		System.out.println(obj.add(10,5));
		m1();
		obj.m2();
		obj.m3();

	}

}
