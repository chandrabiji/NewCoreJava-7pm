package basics;

import java.util.Scanner;

public class StringReverse {
	
	public String stringReverse(String input){
		String reverse = "";
		for(int i = input.length()-1;i>=0;--i){
			reverse = reverse+input.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		StringReverse obj = new StringReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String ?");
		String input = sc.next();
		System.out.println("Given Input String = "+input);
		String reverse = obj.stringReverse(input);
		System.out.println("Reverse String = "+reverse);

	}

}
