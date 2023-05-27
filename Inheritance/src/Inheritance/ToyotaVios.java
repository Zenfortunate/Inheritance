package Inheritance;

public class ToyotaVios extends Vehicles {
String tireType = "Road Tires";
	
	void drive() {
		System.out.println("The car is moving forward");
	}
	

	@Override
	void stop() {
		System.out.println("The car has stopped");
	}
	
}



