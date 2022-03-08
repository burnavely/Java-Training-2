package GClassroomActivity24;


public class Overload {
	
	public void print(int num) {
		System.out.println("\n1st value (int)");
		System.out.println("int: " + num);
	}
	
	public void print(double num) {
		System.out.println("\n2nd value (double)");
		System.out.println("double: " + num);
	}
	
	public void print(String text) {
		System.out.println("\n3th value (string)");
		System.out.println("string: " + text);
	}
	
	public void print(int num1, int num2) {
		System.out.println("\n4th value (int, int)");
		System.out.println("1st int: " + num1 + " \n2nd int: " + num2);
	}
	
	public void print(int num1, String text, int num2) {
		System.out.println("\n5th value (int, string, int)");
		System.out.println("int: " + num1 + " \nstring: " + text + "\nint: "+num2);
	}

}
