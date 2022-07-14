package Ankit;

public class Program25_shiftelement {

	public static void main(String[] args) {
		  int [] arr = new int [] {5,1,2,7,6,3,4,9};    
	        //n determine the number of times an array should be rotated.  
	        int n = 1;  


	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {    
	            System.out.print(arr[i] + " ");    
	        }    


	        for(int i = 0; i < n; i++){  
	            int j, last;  

	            last = arr[arr.length-1];  

	            for(j = arr.length-1; j > 0; j--){  

	                arr[j] = arr[j-1];  
	            }  

	            arr[0] = last;  
	        }  

	        System.out.println();  


	        System.out.println("Array after right rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	        }  

	}

}



//int a[]={1,2,3,4,5,6};
//
//for(int i=0;i<a.length;i++)
//{
//	System.out.println(a[i]+ " ");
//}
//int f=a[0];
//for(int j=0;j<a.length-1;j++)
//{
//	a[j]=a[j+1];
//	
//}
//a[a.length-1]=f;
//System.out.println("After shift");
//for(int i=0;i<a.length;i++)
//{
//	
//	System.out.println(a[i]+" ");
//}