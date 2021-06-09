package flowcontrolls;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("         Menu              ");
		System.out.println("---------------------------");
		System.out.println("  1. CRICKET               ");
		System.out.println("  2. CHESS                 ");
		System.out.println("  3. EXIT                  ");
		System.out.println("---------------------------");
		System.out.println("Enter Your Choice ?");
		/*
		 * int choice = sc.nextInt(); switch(choice) { case
		 * 1:System.out.println("12 Player Required"); break; case
		 * 2:System.out.println("2 Player Required"); break; case
		 * 3:System.out.println("Stop the Application"); break;
		 * default:System.out.println("Please select your choice 1-3 only");
		 */

		/*
		 * String choice = sc.next(); switch (choice) { case "cricket":
		 * System.out.println("12 Players"); break; case "chess":
		 * System.out.println("2 players"); break; case "exit":
		 * System.out.println("Stop the application"); break; default:
		 * System.out.println("Plase enter cricket|chess|exit choices only");
		 */

		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':
			System.out.println("A for Apple");
			break;
		case 'b':
			System.out.println("B for Ball");
			break;
		default:
			System.out.println("Please select your choice a|b only");

		}

	}

}
