package Ankit;

import java.util.Scanner;

public class Program7_sumOfNumber {

	int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {

		Program7_sumOfNumber sn = new Program7_sumOfNumber();
		int total = sn.sum(10, 5);
		System.out.println(total);
	}

}

// int sum=0;
// Scanner sc =new Scanner(System.in);
// System.out.println("Enter 1st number");
// int num1=sc.nextInt();
// System.out.println("Enter 2ndst number");
// int num2=sc.nextInt();
//
// sum=num1+num2;
// System.out.println(sum);
