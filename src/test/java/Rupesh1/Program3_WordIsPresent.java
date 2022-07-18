//"write method which return boolean value if  provided word is present in the proivided string :
//
//i/p = ""Todayu is monday""    word is  ""is""    O/p: true word is present 
//i/p = ""Todayu is monday""    word is  ""idds""    O/p: true word NOT is present 
//"

package Rupesh1;

public class Program3_WordIsPresent {
	boolean wordispresent(String sentence, String word) {
		boolean verify = sentence.contains(word);

		return verify;

	}

	public static void main(String[] args) {
		Program3_WordIsPresent a = new Program3_WordIsPresent();
		boolean values = a.wordispresent("Today is sunday", "xyz");
		if (values == true) {
			System.out.println("Word is present");

		} else {
			System.out.println("Word is NOT present");
		}

	}

}
