package RUPESH;

public class Assignment6_reternmonth {
	String findyear(String s)
    {

      String[] str=s.split("-");
      String date=str[2];
      System.out.println(date);
    return date;

    }


    public static void main(String[] args) {


    	Assignment6_reternmonth rd=new Assignment6_reternmonth();
        rd.findyear("02-06-2022");

        
       // syso

}
}
