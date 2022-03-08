package GClassroomActivity21;


public class Main {

	public static void main(String[] args) {


		Student s = new Student();
		s.setFname("Marie");
		s.setMname("Dela Cruz");
		s.setLname("Rodrigez");
		s.setSection("Bonifacio");
		s.setGender("Female");
		s.setAddress("Magsaysay Blvd");
		s.setBirthplace("Quezon City");
		s.setMothername("Juana Luna");
		s.setFathername("Oliver Rodriguez");
		s.setAge(15);
		
		System.out.println("First Name: " + s.getFname());
		System.out.println("Middle Name: " + s.getMname());
		System.out.println("Last Name: " + s.getLname());
		System.out.println("Section: " + s.getSection());
		System.out.println("Gender: " + s.getGender());
		System.out.println("Address: " + s.getAddress());
		System.out.println("Birthplace: " + s.getBirthplace());
		System.out.println("Mothername: " + s.getMothername());
		System.out.println("Fathername: " + s.getFathername());
		System.out.println("Age: " + s.getAge());

	}

}
