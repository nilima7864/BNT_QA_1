package RUPESH;

public class Assignment_4 {
	public static boolean isEven(int n)
    {
        return (n % 2 == 0);
    }
     
    
    public static void main(String[] args)
    {
        int n = 101;
        if(isEven(n) == true)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}
