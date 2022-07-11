package Priya;

public class Assgn1_ReverseString {
	
	void reverseString(String input) {
		
		String output="";
		for (int index=input.length();index<=0;index--) {
			output=output+input.charAt(index);
		}
		System.out.println(output);
		
	}

	public static void main(String[] args) {
		
		Assgn1_ReverseString assgn1=new Assgn1_ReverseString();
		assgn1.reverseString("Priya");
	}

}
