package main;

public class Car extends Vehicle{
	Integer entertainmentAmount;
	
	public Car(String brand, String name, String licenseNumber, Integer topSpeed, 
			Integer gasCap, Integer wheel, String type, Integer entertainmentAmount) {
		super(brand, name, licenseNumber, topSpeed, gasCap, wheel, type);
		// TODO Auto-generated constructor stub
		this.entertainmentAmount = entertainmentAmount;
	}

}
