package GClassroomActivity19;


public class Main {

	public static void main(String[] args) {
		Compute x = new Compute();
		
		System.out.print("Enter 1st Number: ");
		x.num1 = x.sc.nextInt();
		
		System.out.print("Enter 2nd Number: ");
		x.num2 = x.sc.nextInt();



		System.out.println("The Sum of " + x.num1 + " and " + x.num2 + " is : " + x.computeSum());
		System.out.println("The Product of " + x.num1 + " and " + x.num2 + " is : " + x.computeProd());
		System.out.println("The Difference of " + x.num1 + " and " + x.num2 + " is : " + x.computeDiff());
		System.out.println("The Quotient of " + x.num1 + " and " + x.num2 + " is : " + x.computeQuo());

	}

}
