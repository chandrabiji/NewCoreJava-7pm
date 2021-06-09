package basics;

import java.util.Scanner;

public class Rerverse {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String input = sc.next();
	String reverse= "";
	System.out.println("Given Input String : "+input);
	for(int i=input.length()-1;i>=0;--i){
		reverse +=input.charAt(i);
	}
	System.out.println("After Reverse : "+reverse);

	}

}
