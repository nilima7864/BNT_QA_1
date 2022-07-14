package Ankit;

public class Program19_PrimeNumber {

	public static void main(String[] args) {
		int num =97;
		int count=0;
		
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count ++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("Number is not prime number");
		}
		else
		{
			System.out.println("number is prime number");
		}
	}

}
