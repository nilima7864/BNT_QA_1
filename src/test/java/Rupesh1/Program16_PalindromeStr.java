
//Check provided string si palindrome


package Rupesh1;

public class Program16_PalindromeStr {
	public static void main(String[] args) {
		String s="MAM";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
	System.out.println(rev);
		
	if(rev.equals(s))
	{
		System.out.println("Given string is palindrome");
	}
	else
	{
		System.out.println("Given string is not palindrome");
	}
	}
}
