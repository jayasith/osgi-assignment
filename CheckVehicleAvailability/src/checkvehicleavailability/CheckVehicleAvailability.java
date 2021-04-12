package checkvehicleavailability;

public interface CheckVehicleAvailability {
	
	public int  AvailableVehicleCount(String type);
	public boolean  isVehicleAvailable(String type);
}