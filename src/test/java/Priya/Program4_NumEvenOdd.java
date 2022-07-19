package Priya;

import java.util.Scanner;

public class Program4_NumEvenOdd {
	
	//write a method which accepts number and print if provided number is even or odd
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number");
		 int num=sc.nextInt();
		
		 if(num%2==0)
		 {
		 System.out.println("Given number " +num+ " is even");
		 }
		 else
		 {
		 System.out.println("Given number " +num+ " is odd");
		 }
	}
	

}
