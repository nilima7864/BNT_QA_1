package Ankit;

public class Program10_NonRepetingCharFromString {

	public static void main(String[] args) {
		String s= "abczabcefag";
		System.out.println("Non repetative");
		for(int i=0;i<s.length();i++)
		
		{
			char ch=s.charAt(i);
			
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
			
				System.out.println(ch);
				//break;
			}
			
		}
		
	}

}
