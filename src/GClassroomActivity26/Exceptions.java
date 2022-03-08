package GClassroomActivity26;

import java.util.Scanner;

public class Exceptions {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, sum, diff, quo, prod;
		

		System.out.print("Enter 1st number: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter 2nd number: ");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		diff = num1 - num2;
		quo = num1/num2;
		prod = num1*num2;
		
		try {
			if((num1 < 10) && (num2 < 10) && (num1 > 0) && (num2 > 0)) {
				System.out.println("The Sum of 2 numbers: " + sum);
				System.out.println("The Difference of 2 numbers: " + diff);
				System.out.println("The Quotient of 2 numbers: " + quo);
				System.out.println("The Product of 2 numbers: " + prod);
			}
			else {
				throw new RuntimeException("ONLY SINGLE DIGIT NUMBERS ARE BEING ACCEPTED.");
			}
		}	
		
		catch (RuntimeException e){
			e.printStackTrace();
		}

	}

}
