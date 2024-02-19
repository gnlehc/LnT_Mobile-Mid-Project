package main;

public abstract class Vehicle {
	String brand;
	String name;
	String licenseNumber;
	Integer topSpeed;
	Integer gasCap;
	Integer wheel;
	String type;
	
	public Vehicle(String brand, String name, String licenseNumber, Integer topSpeed, Integer gasCap, Integer wheel,
			String type) {
		super();
		this.brand = brand;
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.topSpeed = topSpeed;
		this.gasCap = gasCap;
		this.wheel = wheel;
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Integer getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}

	public Integer getGasCap() {
		return gasCap;
	}

	public void setGasCap(Integer gasCap) {
		this.gasCap = gasCap;
	}

	public Integer getWheel() {
		return wheel;
	}

	public void setWheel(Integer wheel) {
		this.wheel = wheel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
