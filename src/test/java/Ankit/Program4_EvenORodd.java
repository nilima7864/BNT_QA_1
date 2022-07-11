package Ankit;

import java.util.Scanner;

public class Program4_EvenORodd {

	int evenorodd(int num) {
		return num;

	}

	public static void main(String[] args) {

		Program4_EvenORodd ev = new Program4_EvenORodd();
		int check = ev.evenorodd(6);

		if (check % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

}

// Scanner sc=new Scanner(System.in);
// System.out.println("Enter number");
// int num=sc.nextInt();
//
// if(num%2==0)
// {
// System.out.println("number is even");
// }
// else
// {
// System.out.println("number is odd");
// }
