package basics;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ?");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second Number ?");
		int secondNumber = sc.nextInt();
		System.out.println("First Number = "+firstNumber+"\t"+"Second Number = "+secondNumber);
		firstNumber = firstNumber + secondNumber;//10+5=15
		secondNumber = firstNumber-secondNumber;//15-5=10
		firstNumber = firstNumber-secondNumber;//15-10=5
		System.out.println("First Number = "+firstNumber+"\t"+"Second Number = "+secondNumber);

	}

}
