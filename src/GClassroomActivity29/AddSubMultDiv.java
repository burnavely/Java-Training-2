package GClassroomActivity29;

import java.util.Scanner;

public class AddSubMultDiv {

	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {

		
		System.out.println("***1st number should be higher than 2nd number***\n");
		System.out.print("Enter 1st Number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd Number: ");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		int diff = num1-num2;
		int prod = num1*num2;
		int quo = num1/num2;
		int mod = num1%num2;
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Product: " + prod);
		System.out.println("Quotient: " + quo);
		System.out.println("Remainder: " + mod);

	}

}
