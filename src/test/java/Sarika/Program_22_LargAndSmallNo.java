//How to find the largest and smallest number in an array
//i/p  : {5,1,2,7,6,3,4,9}
//o/p : small: 1 & highest: 9
package Sarika;

import java.util.Arrays;

public class Program_22_LargAndSmallNo {
public static void main(String[] args) {
	int a[] = { 5, 1, 2, 7, 6, 3, 4, 9 };

    for (int i = 0; i < a.length; i++) {
        Arrays.sort(a);

    }
    System.out.println("Smallest number in array " + a[0]);
    int len = a.length - 1;
    System.out.println("largest number in array " + a[len]);
}
}
