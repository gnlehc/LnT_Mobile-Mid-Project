package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	Car car;
	Motorcycle motor;
	Vehicle vh;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	public Main() {
		insertVehicle();
		displayVehicle();
	}
	
	public void insertVehicle() {
		String type = "";
		String brand = "";
		String name = "";
		String license = "";
		Integer topSpeed = 0;
		Integer gasCap = 0;
		Integer wheel = 0;
		String vehicleType = "";
		Integer carEntertain = 0;
		Integer helm = 0;
		
		while(!type.equals("Car") && !type.equals("Motorcycle")) {
			System.out.print("Input Type [Car | Motorcycle]: ");
			type = scan.nextLine();
		}
		
		if(type.equals("Car")) {
			while(brand.length() < 5) {
				System.out.print("Input Type brand [>= 5]: ");
				brand = scan.nextLine();
			}
			while(name.length() < 5) {
				System.out.print("Input Type name [>= 5]: ");
				name = scan.nextLine();
			}
			while (!validateLicenseNumber(license)) {
	            System.out.print("Input License: ");
	            license = scan.nextLine();
	            if (!validateLicenseNumber(license)) {
	                System.out.println("Invalid License format. Please follow the format: A 1234 ABC");
	            }
	        }
			while(topSpeed < 100 || topSpeed > 250) {
				System.out.print("Input Top Speed [100 <= topSpeed <= 250]: ");
				topSpeed = scan.nextInt();
			}
			while(gasCap < 30 || gasCap > 60) {
				System.out.print("Input Gas Capacity [30 <= topSpeed <= 60]: ");
				gasCap = scan.nextInt();
			}
			while(wheel < 4 || wheel > 6) {
				System.out.print("Input Wheel [4 <= wheel <= 6]: ");
				wheel = scan.nextInt();
			}
			
			System.out.print("Input Type [SUV | Supercar | Minivan]: ");
			vehicleType = scan.nextLine();
			vehicleType = scan.nextLine();
			scan.nextLine();
			while(carEntertain < 1) {
				System.out.print("Input Entertaiment System Amount [>= 1]: ");
				carEntertain = scan.nextInt();
			}
			car = new Car(brand, name, license, topSpeed, gasCap, wheel, vehicleType, carEntertain);
			vehicles.add(car);
			System.out.println(car.getType());
			System.out.println("ENTER to return");
			scan.nextLine();
		}
		else {
			while(brand.length() < 5) {
				System.out.print("Input Type brand [>= 5]: ");
				brand = scan.nextLine();
			}
			while(name.length() < 5) {
				System.out.print("Input Type name [>= 5]: ");
				name = scan.nextLine();
			}
			while (!validateLicenseNumber(license)) {
	            System.out.print("Input License: ");
	            license = scan.nextLine();
	            if (!validateLicenseNumber(license)) {
	                System.out.println("Invalid License format. Please follow the format: A 1234 ABC");
	            }
	        }
			while(topSpeed < 100 || topSpeed < 250) {
				System.out.print("Input Top Speed [100 <= topSpeed <= 250]: ");
				topSpeed = scan.nextInt();
			}
			while(gasCap < 30 || gasCap < 60) {
				System.out.print("Input Gas Capacity [30 <= topSpeed <= 60]: ");
				gasCap = scan.nextInt();
			}
			while(wheel < 2 || wheel < 3) {
				System.out.print("Input Wheel [4 <= wheel <= 6]: ");
				wheel = scan.nextInt();
			}
			System.out.print("Input Type [Automatic | Manual]: ");
			vehicleType = scan.nextLine();
			vehicleType = scan.nextLine();
			scan.nextLine();
			while(helm < 1) {
				System.out.print("Input Helm Amount [>= 1]: ");
				helm = scan.nextInt();
			}
			motor = new Motorcycle(brand, name, license, topSpeed, gasCap, wheel, vehicleType, helm);
			vehicles.add(motor);
			System.out.println("ENTER to return");
			scan.nextLine();
		}
		
	}
	
	public void displayVehicle() {
		  int input = 0;
		    int i = 1;
		    System.out.println("Pick a vehicle number to test drive [Enter '0' to exit]: ");
		    System.out.println("---------------------------------------------");
		    System.out.printf("| %-3s | %-10s | %-10s | %-10s |\n", "No", "Brand", "Name", "License");
		    System.out.println("---------------------------------------------");
		    if(vehicles.isEmpty()) {
		        System.out.println("There is no Vehicle");
		    }

		    for (Vehicle v : vehicles) {
		        System.out.printf("| %-3d | %-10s | %-10s | %-10s |\n", i, v.getBrand(), v.getName(), v.getLicenseNumber());
		        i++;
		    }

		    System.out.println("---------------------------------------------");
		    System.out.print("Pick a vehicle number to test drive [Enter '0' to exit]: ");
		    input = scan.nextInt();
		    if(input == 0) {
		        return;
		    } else {
		        System.out.println("-------------------------------------------------");
		        System.out.printf("| %-3s | %-10s | %-10s | %-13s |\n", "No", "Brand", "Name", "License Plate");
		        System.out.println("-------------------------------------------------");

		        Vehicle vh = vehicles.get(input - 1);
		        System.out.printf("| %-3d | %-10s | %-10s | %-13s |\n", input, vh.getBrand(), vh.getName(), vh.getLicenseNumber());
		        System.out.println("-------------------------------------------------");

		        System.out.println("Additional Information:");
		        System.out.println("-------------------------------------------------");
		        System.out.printf("| %-6s | %-12s | %-9s | %-7s |\n", "Type", "Gas Capacity", "Top Speed", "Wheels");
		        System.out.println("-------------------------------------------------");
		        System.out.printf("| %-6s | %-12d | %-9d | %-7d |\n", vh.getType(), vh.getGasCap(), vh.getTopSpeed(), vh.getWheel());
		        System.out.println("-------------------------------------------------");
		    }
		    scan.nextLine(); 
		    if(vehicles.get(input-1) instanceof Car) {
		    	System.out.println("Turning on entertainment system...");
		    	if(vehicles.get(input-1).getType().equals("Supercar")) {
			    	System.out.println("Boosting!");
			    }
		    }
		    else if(vehicles.get(input-1) instanceof Motorcycle) {
		    	System.out.println((Motorcycle) vehicles.get(input-1) + " is standing!");
		    }
	}
	
	public static boolean validateLicenseNumber(String licenseNumber) {
	        String regex = "^[A-Z]\\s\\d{1,4}\\s[A-Z]{1,2}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(licenseNumber);
	        return matcher.matches();
	}

}
