package GClassroomActivity13;

import java.util.*;

/*
 * If Else Statement 
 * Write the program that will show if the person is eligible
 * to vote or not eligible to vote.
 */
public class task3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		if (age < 18) {
			System.out.println("NOT ELIGIBLE TO VOTE");
		}
		else {
			System.out.println("ELIGIBLE TO VOTE");			
		}

	}

}
