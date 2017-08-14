package pakage1;

public class Voidmethod {
	 void printit() //void method
		{
			System.out.println("This is a void method and doesnt have return type");
		}
	   void printName(String Name)
	   {
		   System.out.println(Name);
	   }
		public static void main(String[] args) { //main method: execution starts from here
			Voidmethod m = new Voidmethod(); // creating an object to invoke the method 
			m.printit(); // calling method with object m
			m.printName("Lavanya");		
		}
}
