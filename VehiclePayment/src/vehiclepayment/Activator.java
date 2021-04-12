package vehiclepayment;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration<?> vehiclePayement;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Starting vehicle availability check...");
		VehiclePaymentService VehiclePayement = new VehiclePayementImpl();
		vehiclePayement = context.registerService(VehiclePaymentService.class.getName(), VehiclePayement, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopping vehicle availability check...");
	}
}
