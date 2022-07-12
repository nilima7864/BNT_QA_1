package Ankit;

public class Program5_RemoveSpaces {

	String removespace(String Sentence) {
		return Sentence;
	}

	public static void main(String[] args) {

		Program5_RemoveSpaces rs = new Program5_RemoveSpaces();
		String s = rs.removespace("  Today is Monday  ");
		System.out.println("Before trim");
		System.out.println(s);
		String trim = s.trim();
		System.out.println("after trim");
		System.out.println(trim);
		
		String s1=s.replaceAll(" ", "");
		System.out.println("after remove all spaces");
		System.out.println(s1);

	}

}

// String s = " Hello Java ";
// System.out.println("Before remove space");
// System.out.println(s);
//
// System.out.println("after remove space");
// String s1=s.trim();
// System.out.println(s1);