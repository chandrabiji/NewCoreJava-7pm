package flowcontrolls;

public class IfElseIfElseDemo {

	public static void main(String[] args) {
		int a = 10,b=60,c=60;
		
		if(a>b && a>c){
			System.out.println("A value is big");
		}else if(b>a && b>c){
			System.out.println("B value is big");
		}else if(c>a && c>b){
			System.out.println("C value is big");
		}else{
			System.out.println("Any Two Variables or All are Equals");
		}

	}

}
