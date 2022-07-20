package Ankit;

import java.util.Arrays;

public class gitdemoclass {
	public static void main(String[] args) {
		String str1 = "krep";
		String str2 = "peek";

		char[] ch = str1.toCharArray();
		// System.out.println(ch);
		Arrays.sort(ch);
		System.out.println("AnagramProgram");
		char[] ch1 = str2.toCharArray();
		// System.out.println(ch1);
		Arrays.sort(ch1);

		boolean result = Arrays.equals(ch, ch1);
		System.out.println(result);

		if (result == true) {
			System.out.println("String is anagram");
		} else {
			System.out.println("String is not anagram");
		}

	}

}
