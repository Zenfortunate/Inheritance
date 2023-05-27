package Inheritance;

public class FandagoYacht extends Vehicles {
String MainsailColor = "Black";
	
	void Float() {
		System.out.println("The boat has started sailing");
	}
	
	@Override
	void stop() {
		System.out.println("The boat has dropped the anchor");
	}
}


