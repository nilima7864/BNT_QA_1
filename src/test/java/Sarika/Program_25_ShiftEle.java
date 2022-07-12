//"Write a program on array which shift element by 
//i/p  : {5,1,2,7,6,3,4,9}
//o/p : {1,2,7,6,3,4,9,5}"
package Sarika;

public class Program_25_ShiftEle {
	public static void main(String[] args) {
		int[] arr = new int[]{5,1,2,7,6,3,4,9};
		int n = 1;
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < n; i++) {
			int j, last;
			last = arr[arr.length - 1];
			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
		System.out.println();
		System.out.println("Array after right rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
