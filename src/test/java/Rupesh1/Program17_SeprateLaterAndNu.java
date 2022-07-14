
/*Write a program which separate numbers and letters from string
        i/p  : h2n9fpn2qk2
        o/p : hnfpnqk2922
*/

package Rupesh1;

public class Program17_SeprateLaterAndNu {
	public static void main(String[] args) {
		String s= "h2n9fpn2k4w";
		
		
		String s1=s.replaceAll("[^a-zA-Z]","");
		String s2=s.replaceAll("[^0-9]", "");
		
		System.out.println(s1+s2);
		
		
		
	}
}
