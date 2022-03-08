package GClassroomActivity20;


public class Main {

	public static void main(String[] args) {
		market market  = new market(10.75, 15.75, 80.75, 16.75, 120.75);
		
		System.out.println("FRUITS PRICE LIST:");
		System.out.println("APPLE : Php " + market.apple + " per piece");
		System.out.println("MANGO : Php " + market.mango + " per piece");
		System.out.println("GRAPES : Php " + market.grapes + " per kg");
		System.out.println("AVOCADO : Php " + market.avocado + " per piece");
		System.out.println("WATERMELON : Php " + market.watermelon + " per piece");
		

	}

}

class market{
	double apple;		//per piece
	double mango;		//per piece
	double grapes;		//kg
	double avocado;		//per piece
	double watermelon;	//per piece
	
	
	market(double app, double man, double grap, double avo, double wtrmelon){
		apple = app;
		mango = man;
		grapes = grap;
		avocado =  avo;
		watermelon = wtrmelon;
	}
	
}
