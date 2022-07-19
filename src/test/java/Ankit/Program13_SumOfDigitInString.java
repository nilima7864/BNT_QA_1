package Ankit;

public class Program13_SumOfDigitInString {

	public static void main(String[] args) {
		int sum=0; int n;
		String s="My age 13 , after 5 years i become 18 years old";
		String s1=s.replaceAll("[^0-9]", "");
		System.out.println(s1);
		
		int a=Integer.parseInt(s1);
		System.out.println(a);
		
	
		while(a>0)
		{
			n=a%10;
			sum=sum+n;
			a=a/10;
			
		}
		System.out.println(sum);
	}

}
