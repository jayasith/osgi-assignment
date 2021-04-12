package registercontoller;

import java.util.ArrayList;

import java.util.Scanner;

import models.Vehicle;

public class RegisterControllerImpl implements RegisterController {
	
    ArrayList <Vehicle>vehicles = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public RegisterControllerImpl() {
		vehicles.add(new Vehicle("Name-1", "KG-2020", "1", "Toyota Aqua"));
		vehicles.add(new Vehicle("Name-2", "PA-2020", "2", "Toyota Hiace"));
		vehicles.add(new Vehicle("Name-3", "ND-2020", "3", "Toyota Coastar"));
	}
	
	public void registerVehicle() {
		boolean isContinue = true;
		String ownerName;
		String registrationNo;
		String vehicleType;
		String vehicleModel;
		
		do {
			System.out.println("* Please enter your vehicle details *");
			System.out.print("Owner's name: ");
			ownerName = scanner.nextLine();
			
			System.out.print("Registration number: ");
			registrationNo = scanner.nextLine();
			
			do {
				System.out.println("1. Car\t 2. Van\t 3. Bus");
				System.out.print("Vehicle type (Please enter the number as type): ");
				vehicleType = scanner.nextLine();
			} while(vehicleType == "1" || vehicleType == "2" || vehicleType == "3");
			
			System.out.print("Vehicle model: ");
			vehicleModel = scanner.nextLine();
			
			System.out.print("Do you want to register more vehicles? (yes/no): ");
			
			if(scanner.nextLine().equalsIgnoreCase("no")) {
				isContinue = false;
			}
			
			Vehicle vehicle = new Vehicle(ownerName, registrationNo, vehicleType, vehicleModel);
			vehicles.add(vehicle);
			
		} while(isContinue);
		
		/*for(Entry<String, Vehicle>  vehicle : vehicles.entrySet()) {
			System.out.println(vehicle.getValue().getRegistrationNo());
			System.out.println(vehicle.getValue().getVehicleType());
			System.out.println(vehicle.getValue().getVehicleModel());
		}*/
		
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getRegistrationNo());
			System.out.println(vehicle.getVehicleType());
			System.out.println(vehicle.getVehicleModel());
		}
	}
	
	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}
}

