package Ankit;

import java.util.Arrays;
import java.util.TreeSet;

public class Program21_sortArrayWithoutPredefinedMethods {

	public static void main(String[] args) {
		int a[]={5,1,7,6,3,4,9};
		
         // Arrays.sort(a);	
//          for(int i=0;i<=a.length-1;i++)
//          {
//        	  System.out.println(a[i]);
//          }
		
		TreeSet ts= new TreeSet();
	   
		for(int i=0;i<=a.length-1;i++)
        {
      	  System.out.println(a[i]);
      	  ts.add(a[i]);
        }
		System.out.println(ts);
	}

}
