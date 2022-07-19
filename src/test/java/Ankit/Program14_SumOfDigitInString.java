package Ankit;

import java.util.HashSet;

public class Program14_SumOfDigitInString {
	static int sumofdigit(String str) {
		String ss = "0";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				ss = ss + ch;
			else {
				sum = sum + Integer.parseInt(ss);
				ss = "0";
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "My age 13 , after 5 years i become 18 years old";
		String str1 = str + " ";
		System.out.println(sumofdigit(str1));
	}
}
