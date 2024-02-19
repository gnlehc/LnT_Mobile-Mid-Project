package main;

public class Motorcycle extends Vehicle{
	public Motorcycle(String brand, String name, String licenseNumber, 
			Integer topSpeed, Integer gasCap, Integer wheel, String type, Integer helmAmount) {
		super(brand, name, licenseNumber, topSpeed, gasCap, wheel, type);
		// TODO Auto-generated constructor stub
		this.helmAmount = helmAmount;
	}

	Integer helmAmount;
}
