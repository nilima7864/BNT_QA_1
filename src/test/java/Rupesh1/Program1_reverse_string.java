package Rupesh1;
//1. String reverse:

//way 1. string raw logic
//way2: StringBuffer   ... revrese();

//String reverse :
//i/p=  "Today is best day"
//o/p="yad tseb si yadoT"
public class Program1_reverse_string {
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
