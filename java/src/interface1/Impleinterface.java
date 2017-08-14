package interface1;

public class Impleinterface {
	public void car() {              // must implement the unimplemented methods 
		
		System.out.println("volvo");
	}

	public void carColor() {
		
		System.out.println("Red");
	}
	public static void main(String[] args) {
		Impleinterface obj = new Impleinterface();
		System.out.print("Name of the car " );
		obj.car();
		System.out.print("Color ");
		obj.carColor();
		
		
	}
}
