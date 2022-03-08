package GClassroomActivity23;



class Bird{
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}

class Robin extends Bird{
	public void sing() {
		System.out.println("tweed tweed tweed");
	}
	
}

class Pelican extends Bird{
	public void sing() {
		System.out.println("kwakwakwak");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
			Robin b = new Robin();
			b.sing();
	}

}
