package basics;

public class VariableTypes {

	int b = 20;//Instance Variable
	static int  c = 30;//Static Variable or Class Variable
	final int d = 40;//Final Variable
	volatile int e = 50;//Volatile Variable
	transient int f = 60;//Transient Variable
	public static void main(String[] args) {
		VariableTypes obj = new VariableTypes();//Instance or Object
		int a =10;//Local Variable
		System.out.println("A = "+a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+c);
		System.out.println("D = "+obj.d);
		System.out.println("E = "+obj.e);
		System.out.println("F = "+obj.f);
	

	}
	

}
