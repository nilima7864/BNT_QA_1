//Write method which removes spaces from from provided   string 


package Rupesh1;

public class Program5_RemoveSpecas {
	public static void main(String[] args) {

		String str = "  Today is monday  ";
		String valuess = str.replaceAll(" ", "");
		System.out.println("String is->>" + valuess);
		// if we just want single space in between "In is my country" o/p "India
		// is my country"

		String str1 = "India     is  my      country";
		str1 = str1.replaceAll("\\s+", " ");
		System.out.println("Final string is" + str1);
	}

}
