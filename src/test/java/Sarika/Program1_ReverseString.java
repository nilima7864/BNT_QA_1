//"1. String reverse:
//
//way 1. string raw logic
//way2: StringBuffer   ... revrese();
//
//String reverse :
//i/p=  ""Today is best day""
//o/p=""yad tseb si yadoT"""
package Sarika;

import java.util.Scanner;

public class Program1_ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter your string");
		Scanner ss = new Scanner(System.in);
		String str = ss.nextLine();
		StringBuffer sb = new StringBuffer();

		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));

		}

		System.out.println("Reversed string is...-> " + sb.toString());
	}
}
