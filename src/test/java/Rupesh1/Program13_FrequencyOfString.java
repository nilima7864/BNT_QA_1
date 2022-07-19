
/*Frequncy  of letter in string 

E.g. String n= "Bnt-soft"   
B-1
n-1
t-2
- -1
s-1
0-1
f-1
*/




package Rupesh1;

public class Program13_FrequencyOfString {
	public static void main(String[] args) {  
        String str = "bnt soft";  
        int[] freq = new int[str.length()];  
        int i, j;  
          
        char string[] = str.toCharArray();  
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                      
                    string[j] = '0';  
                }  
            }  
        }  
          
        System.out.println("Characters and their corresponding frequencies");  
        for(i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println(string[i] + "-" + freq[i]);  
        }  
    }  
}
