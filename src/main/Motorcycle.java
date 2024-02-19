package main;

public class Motorcycle extends Vehicle{
	public Motorcycle(String brand, String name, String licenseNumber, 
			Integer topSpeed, Integer gasCap, Integer wheel, String type, Integer helmAmount) {
		super(brand, name, licenseNumber, topSpeed, gasCap, wheel, type);
		// TODO Auto-generated constructor stub
		this.helmAmount = helmAmount;
	}

	Integer helmAmount;
	Integer helmPrice; 
	public Integer getHelmAmount() {
		return helmAmount;
	}

	public void setHelmAmount(Integer helmAmount) {
		this.helmAmount = helmAmount;
	}

	public Integer getHelmPrice() {
		return helmPrice;
	}

	public void setHelmPrice(Integer helmPrice) {
		this.helmPrice = helmPrice * this.helmAmount;
	}
	
	
}
