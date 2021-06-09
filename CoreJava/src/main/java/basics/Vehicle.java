package basics;

import java.util.Scanner;

public class Vehicle {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Vechicle Traveling Distance?");
	double distance = sc.nextDouble();
	System.out.println("Enter Your Vechilce Taveling Time ?");
	double time = sc.nextDouble();
	double speed = distance/time;
	System.out.println("Your Vechicle Speed = "+speed);

	}

}
