
//Find duplicate elements from an array:
//int a[]= {2,4,5,6,2,5,7};

//sh.add()//false :  

//indexof 

//count raw
//hashMap < Ineteger, Integer>,  


package Rupesh1;

import java.util.HashSet;

public class Program12_FindDublicate {
	public static void removeDuplicates(int[] a) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);
		System.out.print(set);
	}

	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 2, 20, 30, 30 };
		removeDuplicates(a);
	}
}
