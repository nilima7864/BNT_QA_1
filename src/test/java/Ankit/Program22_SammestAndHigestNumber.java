package Ankit;

import java.util.Arrays;

public class Program22_SammestAndHigestNumber {

	public static void main(String[] args) {
		int a[] = { 5, 1, 2, 7, 6, 3, 4, 9 };

		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a);
			// System.out.println(a[i]);

		}
		System.out.println("Smallest number in array " + a[0]);
		int len = a.length - 1;
		System.out.println("largest number in array " + a[len]);

	}

}
