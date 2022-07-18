package Ankit;

public class Program15_NumberPalindrome {

	public static void main(String[] args) {
		int num = 152;
		String s = Integer.toString(num);

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		int revnum = Integer.parseInt(rev);
		System.out.println(revnum);

		if (s.equals(rev)) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not palindromes");
		}
	}

}
