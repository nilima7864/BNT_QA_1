package Ankit;

import java.util.Arrays;

public class program23_2ndlargestnumber {

	public static void main(String[] args) {
		int a[] = { 5, 1, 2, 7, 6, 3, 4, 9 };

		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a);
			System.out.println(a[i]);

		}
		System.out.println("====================");
		int len = a.length - 2;
		System.out.println("Smallest number in array " + a[0]);
		System.out.println("largest number in array " + a[len]);

	}

}
