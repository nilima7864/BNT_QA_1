package Ankit;

import Ankit.Program6_returnDate;

public class ReturnDateDemoProgram {
	String findyear(String s)
	{
		
      String[] str=s.split("-");
      String date=str[2];
      System.out.println(date);
	return date;
		
	}
	


	public static void main(String[] args) {
		
	
		Program6_returnDate rd=new Program6_returnDate();
		rd.findyear("02-06-2022");
		
	}

}
