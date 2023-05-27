package Inheritance;

public class U_2_Spy_Plane extends Vehicles {

int wingspan = 103;
	
	void fly() {
		System.out.println("The plane is taking off");
	}
	
	@Override
	void stop() {
		System.out.println("The plane has landed ");
	}
}

