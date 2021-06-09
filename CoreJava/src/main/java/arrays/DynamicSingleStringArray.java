package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicSingleStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Array Size ?");
		int size = sc.nextInt();
		String[] names = new String[size];
		System.out.println("Enter String Array Elements ?");
		for(int i=0;i<size;++i){
			names[i]=sc.next();
		}
		System.out.println("String Array Elements are:");
		for(String name:names){
			System.out.println(name);
		}
		Arrays.sort(names);
		System.out.println("After Sorting Array Elements ");
		for(String name:names){
			System.out.println(name);
		}
		System.out.println("Print String Array Elements in Reverse Order");
		for(int i=names.length-1;i>=0;--i){
			System.out.println(names[i]);
		}
	}

}
