package RUPESH;

public class Assignment1_reverse_string {
	public static void main(String[] args) {

		System.out.println("reverse string normal");
		String s = "Today is the best day";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			rev = rev + ch;

		}
		System.out.println(rev);

		System.out.println("===============================");

		System.out.println("reverse string with stringbuffer");

		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);
		sb.reverse();
		System.out.println("after reverse " + sb);

		System.out.println("===============================");

	}
}
