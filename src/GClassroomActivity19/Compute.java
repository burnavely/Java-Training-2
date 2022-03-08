package GClassroomActivity19;

import java.util.*;
public class Compute {

	Scanner sc = new Scanner(System.in);
	public int num1, num2;
	
	public int computeSum() {
		int sum = num1+num2;
		return sum;
	}
	
	public int computeProd() {
		int prod = num1*num2;
		return prod;
	}
	
	public int computeDiff() {
		int diff = num1-num2;
		return diff;
	}
	
	public int computeQuo() {
		int quo = num1/num2;
		return quo;
	}
}
