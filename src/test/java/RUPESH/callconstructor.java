package RUPESH;

public class callconstructor {
int z;

callconstructor() {
	
	z = 45;
}

public static void main(String[] args) {
	callconstructor newobj = new callconstructor();
	System.out.println(newobj.z);
}

}
