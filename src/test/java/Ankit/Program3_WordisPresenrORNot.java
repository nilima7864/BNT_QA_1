package Ankit;

public class Program3_WordisPresenrORNot {

	boolean WordPresentorNot(String Sentence, String word) {
		boolean check = Sentence.contains(word);
		return check;

	}

	public static void main(String[] args) {

		Program3_WordisPresenrORNot w = new Program3_WordisPresenrORNot();
		boolean status = w.WordPresentorNot("Today is best day", "is");

		if (status == true) {
			System.out.println("Word is present");
		}

		else {
			System.out.println("word is not present");
		}

	}

}

// String s= "Welcome to java";
//
// boolean check=s.contains("hello");
// System.out.println(check);

// if(s.contains("to"))
// {
// System.out.println("Word is present");
// }
// else
// {
// System.out.println("Word is not present");
// }
//

// if(check==true)
//
// {
// System.out.println("Word is present");
// }
// else
// {
// System.out.println("Word is not present");
// }
