//move all zeros to end of the array
//        int a[] = {5,0,3,6,9,5,0,6,0,3,6}
package Sarika;

import java.util.Arrays;

public class Program_8_MoveAllZeroes {
	public static void moveallzeroes(int[] A) {
		int ss = 0;
		for (int i : A) {
			if (i != 0) {
				A[ss++] = i;
			}
		}
		for (int i = ss; i < A.length; i++) {
			A[i] = 0;
		}
	}

	public static void main(String[] args) {
		int[] A = { 5, 0, 3, 6, 9, 5, 0, 6, 0, 3, 6 };

		moveallzeroes(A);
		System.out.println(Arrays.toString(A));
	}
}
