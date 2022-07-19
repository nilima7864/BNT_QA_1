//"i/p = ""11-09-2002""  out put should be 2002
//i/p = ""11-09-1987""  out put should be 1987


package Rupesh1;

public class Program6_Dates {
	String dates(String dates1) {

		String str = dates1;
		String[] a = str.split("-");
		String bb = a[2];
		System.out.println("String is" + bb);
		return bb;
	}

	public static void main(String[] args) {

		Program6_Dates a1 = new Program6_Dates();
		a1.dates("02-25-2022");

	}
}
