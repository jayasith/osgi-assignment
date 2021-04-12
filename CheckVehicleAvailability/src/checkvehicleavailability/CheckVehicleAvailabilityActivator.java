package checkvehicleavailability;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class CheckVehicleAvailabilityActivator implements BundleActivator {
	ServiceRegistration<?> vehicleAvailability;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Starting vehicle availability check...");
		CheckVehicleAvailability checkVehicleAvailability = new CheckVehicleAvailabilityImpl();
		vehicleAvailability = context.registerService(CheckVehicleAvailability.class.getName(), checkVehicleAvailability, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopping vehicle availability check...");
	}

}
