package Priya;
public class Program3_WordIsPresentOrNot {

//	"write method which return boolean value if  provided word is present in the proivided string :
//
//	i/p = ""Today is monday""    word is  ""is""    O/p: true word is present 
//	i/p = ""Today is monday""    word is  ""idds""    O/p: true word NOT is present 

	boolean WordPresentorNot(String Sentence, String word) {
		boolean check = Sentence.contains(word);
		return check;

	}

	public static void main(String[] args) {

		Program3_WordIsPresentOrNot w = new Program3_WordIsPresentOrNot();
		boolean status = w.WordPresentorNot("Today is best day", "is");

		if (status == true) {
			System.out.println("Word is present");
		}

		else {
			System.out.println("word is not present");
		}
}
	
	
}