package operators;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		//&& operator
		System.out.println((5>3) && (8>5));//true
		System.out.println((5>3) && (8<5));//false
		
		//|| Operators
		System.out.println((5<3) || (8>5));//true
		System.out.println((5>3) || (8<5));//true
		System.out.println((5<3) || (8<5));//false
		
		//! Operator
		System.out.println(!(5==3));//true
		System.out.println(!(5>3));//false
		
		

	}

}
