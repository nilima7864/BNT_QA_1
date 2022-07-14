package Rupesh1;

import java.util.Scanner;

public class Program15_Palindrome {
	public static void main(String[] args) {

		int r, n, sum = 0, x;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the any number");
		n = s1.nextInt();
		x = n;
		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;

		}
		if (sum == x)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is NOT palindrome");
	}
}
