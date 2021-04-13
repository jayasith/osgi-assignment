package client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import vehiclerentalpublisher.rentalMainService;


public class Activator implements BundleActivator {


	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {
		System.out.println("start service client");
		serviceReference =  context.getServiceReference(rentalMainService.class.getName());		
		rentalMainService rentalmainservice = (rentalMainService) context.getService(serviceReference);		
		rentalmainservice.mainservice();
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("stop service client");
		context.ungetService(serviceReference);
	}

}
