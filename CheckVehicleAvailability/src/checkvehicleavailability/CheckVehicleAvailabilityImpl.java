package checkvehicleavailability;
import java.util.ArrayList;


import models.Vehicle;
import registercontoller.RegisterController;
import registercontoller.RegisterControllerImpl;
import  checkvehicleavailability.CheckVehicleAvailabilityActivator;

public class CheckVehicleAvailabilityImpl implements CheckVehicleAvailability {
	
	RegisterController k = new RegisterControllerImpl();
	ArrayList<Vehicle> bus =  new ArrayList<>();
	ArrayList<Vehicle> car =  new ArrayList<>();
	ArrayList<Vehicle> van =  new ArrayList<>();
	
	ArrayList<Vehicle> vehicles  = k.getVehicle();
	
	//CheckVehicleAvailabilityActivator.register.
	
	int bus_count , car_count , van_count = 0;
	
	public int  AvailableVehicleCount(String type) {
		
		
		
		for(Vehicle vehicle : vehicles) {
			
			   if(vehicle.getVehicleType()=="1") { 
			       car.add(vehicle);
			       
			   }
			   
			   else if(vehicle.getVehicleType()=="3")
			   {
				   bus.add(vehicle);
			   }
			   else if(vehicle.getVehicleType()=="2")
			   {
				   van.add(vehicle);
			   }
			}
		
		car_count = car.size();
		bus_count = bus.size();
		van_count = van.size();
		
		
		if (type == "1")
		{
			return car_count;
		}
		
		else if (type == "3")
		{
			return bus_count;
		}
		
		else if (type == "2") 
		{
			return van_count;
		}
		
		else 
		{
			return 0;
		}
		
	}

	@Override
	public boolean isVehicleAvailable(String type) {
		
	 int count =	AvailableVehicleCount(type);
		if (type == "1" && !(count == 0))
		{
			return true;
		}
		
		else if (type == "3" && !(count == 0))
		{
			return true;
		}
		
		else if (type == "2" && !(count==0)) 
		{
			return true;
		}
		
		else 
		{
			return false;
		}
	}
	
	
}
