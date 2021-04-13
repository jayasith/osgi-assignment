package models;

public class Vehicle {
	private String ownerName;
	private String registrationNo;
	private String vehicleType;
	private String vehicleModel;
	private boolean isAvailable;
	
	public Vehicle(String ownerName, String registrationNo, String vehicleType, String vehicleModel) {
		this.ownerName = ownerName;
		this.registrationNo = registrationNo;
		this.vehicleType = vehicleType;
		this.vehicleModel = vehicleModel;
		isAvailable = true;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
}