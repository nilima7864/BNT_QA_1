package Priya;

public class Assgn2_ReverseWord {
	
	public static void main(String[] args) {
		
		String s = "Today is the best day";
		String rev = " ";
		String[] Splits = s.split(" ");
		
		for (int i = Splits.length - 1; i >= 0; i--) {
			rev = rev + " "+ Splits[i];
			
		}
		
		rev=rev.trim();
		System.out.println(rev);
	}
}
