package GClassroomActivity18;

public class Main {

	public static void main(String[] args) {

		// task1
		section section = new section();

		section.student1 = 73;
		section.student2 = 75;
		section.student3 = 78;
		section.student4 = 81;
		section.student5 = 93;

		System.out.println("TASK 1");
		System.out.println("1ST STUDENT GRADE: " + section.student1);
		System.out.println("2ND STUDENT GRADE: " + section.student2);
		System.out.println("3RD STUDENT GRADE: " + section.student3);
		System.out.println("4TH STUDENT GRADE: " + section.student4);
		System.out.println("5TH STUDENT GRADE: " + section.student5);

		// task2

		task2 section2 = new task2();
		section2.student1 = 73;
		section2.student2 = 75;
		section2.student3 = 78;
		section2.student4 = 81;
		section2.student5 = 93;
		
		System.out.println("\nTASK 2");
		System.out.println("SUM OF ALL GRADES: " + section2.sum());
		System.out.println("RANGE OF GRADES: " + section2.diff());
		System.out.println("PRODUCT OF LOWEST AND HIGHEST GRADES: " + section2.prod());
		System.out.println("AVERAGE OF ALL GRADES: " + section2.div());

		// task3

		task3 name1 = new task3("Ada", "Demirci");
		task3 name2 = new task3("Silvija", "Pierre");
		task3 name3 = new task3("Om", "Jakeman");
		task3 name4 = new task3("Sostrate", "Hayes");
		task3 name5 = new task3("Carmen", "Emerson");
		task3 name6 = new task3("Dieuwke", "Koch");
		task3 name7 = new task3("Eseoghene", "Rettig");
		task3 name8 = new task3("Petula", "Kristoffersen");
		task3 name9 = new task3("Yevdokim", "McCleary");
		task3 name10 = new task3("Jeanette", "Aldenberg");

		System.out.println("\nTASK 3");
		System.out.println("LIST OF NAMES");
		System.out.println("1. FIRST NAME: " + name1.fname + "\n 	LAST NAME: " + name1.lname);
		System.out.println("2. FIRST NAME: " + name2.fname + "\n 	LAST NAME: " + name2.lname);
		System.out.println("3. FIRST NAME: " + name3.fname + "\n 	LAST NAME: " + name3.lname);
		System.out.println("4. FIRST NAME: " + name4.fname + "\n 	LAST NAME: " + name4.lname);
		System.out.println("5. FIRST NAME: " + name5.fname + "\n 	LAST NAME: " + name5.lname);
		System.out.println("6. FIRST NAME: " + name6.fname + "\n 	LAST NAME: " + name6.lname);
		System.out.println("7. FIRST NAME: " + name7.fname + "\n 	LAST NAME: " + name7.lname);
		System.out.println("8. FIRST NAME: " + name8.fname + "\n 	LAST NAME: " + name8.lname);
		System.out.println("9. FIRST NAME: " + name9.fname + "\n 	LAST NAME: " + name9.lname);
		System.out.println("10. FIRST NAME: " + name10.fname + "\n 	LAST NAME: " + name10.lname);
	}

}

//task1

class section {

	int student1;
	int student2;
	int student3;
	int student4;
	int student5;

}

class task2 {

	int student1;
	int student2;
	int student3;
	int student4;
	int student5;
	int sum, range, prod, quo;

	public int sum() {
		int sum = student1 + student2 + student3 + student4 + student5;
		return sum;

	}

	public int diff() {
		int range = student5 - student1;
		return range;
	}

	public int prod() {
		int prod = student1 * student5;
		return prod;
	}

	public int div() {
		int quo = student1 + student2 + student3 + student4 + student5 / 5;
		return quo;
	}
}

class task3 {

	String fname;
	String lname;

	task3(String fn, String ln) {
		fname = fn;
		lname = ln;
	}
}
