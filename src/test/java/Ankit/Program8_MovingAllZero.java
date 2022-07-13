package Ankit;

import java.util.Arrays;

public class Program8_MovingAllZero {

	public static void main(String[] args) {
		int a[] = {5,0,3,6,9,5,0,6,0,3,6};
		
		int output[]=new int[a.length];
		
		int j=0;
		for(int i=0; i<a.length;i++){
			if(a[i]!=0){
				output[j]=a[i];
				j++;
				
			}			
		
			
	}
		System.out.println(Arrays.toString(output));
		
}
}

/*
 Second method
String str="32400121200";

    String s1=    str.replace("0", "");
    System.out.println(s1);
    String s2=str.replaceAll("[^0]", "");
    System.out.println(s2);

    System.out.println(s2+s1);
    
    */
