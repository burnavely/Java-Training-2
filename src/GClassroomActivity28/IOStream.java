package GClassroomActivity28;

import java.io.FileWriter;

public class IOStream {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\xx\\Desktop\\Testing\\activity28.txt");
			fw.write("My name is Bernadeth Bayato");
			fw.close();
		}
		catch(Exception e) {
			System.out.println("e");
		}
		System.out.println("Text File Successfully Created!");

	}

}
