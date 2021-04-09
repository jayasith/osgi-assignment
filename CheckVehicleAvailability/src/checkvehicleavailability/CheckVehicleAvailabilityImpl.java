package checkvehicleavailability;

public class CheckVehicleAvailabilityImpl implements CheckVehicleAvailability {
	public static int vehicleCount = 10;
	
	public boolean isVehicleAvailable(int number) {
		return vehicleCount > number;
	}
}
