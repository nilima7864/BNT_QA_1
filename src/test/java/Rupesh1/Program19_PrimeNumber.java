package Rupesh1;

import java.util.Scanner;

public class Program19_PrimeNumber {
	public static void main(String[] args) {
		int i, n;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the any number");
		n = s1.nextInt();

		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("Number is NOT prime");
				break;
			}
		}
		if (n == i)
			System.out.println("Given number is prime");
	}
}
