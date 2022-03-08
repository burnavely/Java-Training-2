package GClassroomActivity29;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int num1, num2;
	
	public static void main(String[] args) {
		System.out.print("Enter 1st Number: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter 2nd Number: ");
		num2 = sc.nextInt();
		
		System.out.print("Total: " + getTotal());

	}
	
	public static int getTotal() {
		int sum= num1 + num2;
		return sum;
	}
	
}

