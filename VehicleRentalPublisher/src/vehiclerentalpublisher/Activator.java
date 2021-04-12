package vehiclerentalpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

import vehiclerentalservice.vehicleRentalService;

public class Activator implements BundleActivator {
	
	ServiceRegistration rentalpublisher;
	ServiceReference vehiclerental;
	static vehicleRentalService vehiclerentalservice; 
	
	public void start(BundleContext context) throws Exception {
		System.out.println("start publisher");
		rentalMainService rentalhome = new rentalMainServiceImp();
		rentalpublisher = context.registerService(rentalMainService.class.getName(), rentalhome, null);
		
		vehiclerental = context.getServiceReference(vehicleRentalService.class.getName());
		vehiclerentalservice = (vehicleRentalService) context.getService(vehiclerental);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("stop publisher");
		context.ungetService(vehiclerental);
		context.ungetService(vehiclerental);
		rentalpublisher.unregister();
		
	}

}
