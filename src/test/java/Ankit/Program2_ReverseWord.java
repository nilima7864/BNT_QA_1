package Ankit;

public class Program2_ReverseWord {

	public static void main(String[] args) {
		String s = "Today is the best day";
		String rev = " ";
		String[] Splits = s.split(" ");
		
//		for (String s1 : Splits) {
//			System.out.println(s1);
//		}

		for (int i = Splits.length - 1; i >= 0; i--) {
			rev = rev + " "+ Splits[i];
			
		}
		
		rev=rev.trim();
		System.out.println(rev);
	}
}
