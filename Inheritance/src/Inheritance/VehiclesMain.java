package Inheritance;

public class VehiclesMain {
	
	public static void main(String[] args) {
		
		
		// Instance of Car class
		ToyotaVios Toyota_VIOS = new ToyotaVios();
		
		Toyota_VIOS.speed = 100;
		Toyota_VIOS.color = "Black";
		Toyota_VIOS.price = 1800000 ;
		System.out.println(Toyota_VIOS.speed + "km/h");
		System.out.println(Toyota_VIOS.color);
		System.out.println("Php "+Toyota_VIOS.price);
		System.out.println(Toyota_VIOS.tireType);
		
		Toyota_VIOS.drive();
		Toyota_VIOS.stop();
		
		System.out.println("----------------------------------------------------------");
		
		// Instance of Plane class
		U_2_Spy_Plane U2_Spy_Plane = new U_2_Spy_Plane();
		
		U2_Spy_Plane.speed = 915;
		U2_Spy_Plane.color = "White";
		U2_Spy_Plane.price = 90000000;
		System.out.println(U2_Spy_Plane.speed + "km/h");
		System.out.println(U2_Spy_Plane.color);
		System.out.println("$"+U2_Spy_Plane.price);
		System.out.println(U2_Spy_Plane.wingspan+ " ft");
		
		U2_Spy_Plane.fly();
		U2_Spy_Plane.stop();
		
		System.out.println("----------------------------------------------------------");
		
		// Instance of Boat class
		FandagoYacht Yacht = new FandagoYacht();
		
		Yacht.speed = 80;
		Yacht.color = "White";
		Yacht.price = 3000000;
		System.out.println(Yacht.speed + "km/h");
		System.out.println(Yacht.color);
		System.out.println("Php" + Yacht.price);
		System.out.println(Yacht.MainsailColor);
		
		Yacht.Float();
		Yacht.stop();
		
	}

}
