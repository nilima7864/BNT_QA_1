package RUPESH;

import java.util.Arrays;

public class Assignment21_SortArray {
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
