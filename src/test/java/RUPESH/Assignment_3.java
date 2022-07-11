package RUPESH;

public class Assignment_3 {
	void tocheckwordpresent(String sentece,String word){
		boolean check = sentece.contains(word);
		if(check == true){
			System.out.println("word is present");
		}else{
			System.out.println("word is present");
		}
	}
	public static void main(String[] args) {
		Assignment_3 n = new Assignment_3();
		n.tocheckwordpresent ("Today is monday","iss");
		
	}
}
