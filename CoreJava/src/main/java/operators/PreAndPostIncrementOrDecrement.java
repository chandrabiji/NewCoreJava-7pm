package operators;

public class PreAndPostIncrementOrDecrement {

	public static void main(String[] args) {
		//Pre-Increment
		int a = 4;
		System.out.println("A = "+a);//4
		int b = ++a;//b = a+1;
		System.out.println("B = "+b);//5
		System.out.println("A = "+a);//5
		
		//Post -Increment
		int m = 6;
		System.out.println("M = "+m);//6
		int n = m++;
		System.out.println("N = "+n);//6
		System.out.println("M = "+m);//7
		
		//Pre-Decrement
		int p = 8;
		System.out.println("P = "+p);//8
		int q = --p;
		System.out.println("Q = "+q);//7
		System.out.println("P = "+p);//7
		
		//Post - Decrement
		int x = 9;
		System.out.println("X = "+x);//9
		int y = x--;
		System.out.println("Y = "+y);//9
		System.out.println("X = "+x);//8
		

	}

}
