package RUPESH;

public class Assignment3_ispresent {
	void tocheckwordpresent(String sentece,String word){
		boolean check = sentece.contains(word);
		if(check == true){
			System.out.println("word is present");
		}else{
			System.out.println("word is present");
		}
	}
	public static void main(String[] args) {
		Assignment3_ispresent n = new Assignment3_ispresent();
		n.tocheckwordpresent ("Today is monday","iss");
		
	}
}
