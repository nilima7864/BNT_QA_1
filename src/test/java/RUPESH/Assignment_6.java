package RUPESH;

public class Assignment_6 {
	String findyear(String s)
    {

      String[] str=s.split("-");
      String date=str[2];
      System.out.println(date);
    return date;

    }


    public static void main(String[] args) {


    	Assignment_6 rd=new Assignment_6();
        rd.findyear("02-06-2022");

        
       // syso

}
}
