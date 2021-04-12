package checkvehicleavailability;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

import registercontoller.RegisterController;



public class CheckVehicleAvailabilityActivator implements BundleActivator {
	ServiceRegistration<?> vehicleAvailability;
	 ServiceReference serviceReference;
	 static  RegisterController register;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Starting vehicle availability check...");
		CheckVehicleAvailability checkVehicleAvailability = new CheckVehicleAvailabilityImpl();
		vehicleAvailability = context.registerService(CheckVehicleAvailability.class.getName(), checkVehicleAvailability, null);
		
		serviceReference = context.getServiceReference(RegisterController.class.getName());
		register = (RegisterController) context.getService(serviceReference);

	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopping vehicle availability check...");
	}

}
