package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicSingleDimArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size ?");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements ?");
		for(int i=0;i<size;++i){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are:");
		for(int k:arr){
			System.out.println(k);
		}
		Arrays.sort(arr);
		System.out.println("After Sorting Array Elements are :");
		for(int k:arr){
			System.out.println(k);
		}
		System.out.println("Array Minimum Element = "+arr[0]);
		System.out.println("Array Maximum Element = "+arr[arr.length-1]);
		System.out.println("Array 2nd Highest Element = "+arr[arr.length-2]);

	}

}
