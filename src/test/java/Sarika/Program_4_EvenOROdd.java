
//write a method which accpets number and print if provided number is even or odd"
package Sarika;

import java.util.Scanner;

public class Program_4_EvenOROdd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		// int a = 0;
		// for (int i = 0; i < n; i++) {
		if (n % 2 == 0) {
			System.out.println("Given number is even");
			// break;
		} else {
			System.out.println("Given number is odd ");
			// break;
		}
	}

}
