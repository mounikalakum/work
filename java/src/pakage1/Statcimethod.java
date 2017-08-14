package pakage1;

public class Statcimethod {
	static void Printit(){
		System.out.println("this is a static method");
	}
	public static void main(String[] args) {
		Printit(); // object is not created. static methods can be accessed directly
	}

}
