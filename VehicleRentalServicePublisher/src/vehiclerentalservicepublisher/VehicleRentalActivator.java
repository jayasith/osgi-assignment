package vehiclerentalservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class VehicleRentalActivator implements BundleActivator {

//	private static BundleContext context;
//
//	static BundleContext getContext() {
//		return context;
//	}
	ServiceRegistration vehiclerental;
	static String home;

	public void start(BundleContext context) throws Exception {
		System.out.println("start vehiclerental");
		vehicleRentalService vehiclerentalservice = new vehicleRentalServiceImp();
		vehiclerental = context.registerService(vehicleRentalService.class.getName(),vehiclerentalservice, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
	}

}
