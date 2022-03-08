package GClassroomActivity13;

import java.util.*;

/*
 * If Statement
 * Write an If statement for the person who is 18 years old, 
 * if a person is lower than 18 the output must print "UNDER-AGED" 
 * if not no output will be displayed.
 * 
 */
public class task2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		if (age < 18) {
			System.out.println("UNDER-AGED");
		}

	}

}
