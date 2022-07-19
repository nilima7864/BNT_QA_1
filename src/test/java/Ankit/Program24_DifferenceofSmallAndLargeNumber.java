package Ankit;

import java.util.Arrays;

public class Program24_DifferenceofSmallAndLargeNumber {

	public static void main(String[] args) {
		int a[] = { 5, 1, 2, 7, 6, 3, 4, 9 };

		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a);
			System.out.println(a[i]);

		}
		System.out.println("====================");
		int len = a.length - 1;
		System.out.println("Smallest number in array " + a[0]);
		System.out.println("largest number in array " + a[len]);
		System.out.println("====================");
		int diff = a[len] - a[0];
		System.out.println("Difference of smallest and largest number is " + diff);
	}

}
