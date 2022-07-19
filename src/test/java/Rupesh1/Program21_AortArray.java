

/*Write a program that sort array without using any predefined methods
i/p  : {5,1,2,7,6,3,4,9}
o/p : {1,2,3,4,5,6,7,9}

1. Arrays.toSort()...  
2. TreeSet   
*/




package Rupesh1;

import java.util.Arrays;

public class Program21_AortArray {
	public static void main(String args[])
    {
        int[] arr = {5,1,2,7,6,3,4,9};
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
