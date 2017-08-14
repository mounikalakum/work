package pakage1;

public class Returnandpakage {
	String printString(String val)
	{
		return "hello"+val;
	}
	public static void main(String[] args) {
		Returnandpakage obj = new Returnandpakage();
		String val="Abhishek";
		System.out.println(obj.printString(val));
	}
}
