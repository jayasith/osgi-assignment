package checkvehicleavailability;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class CheckVehicleAvailabilityActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		CheckVehicleAvailabilityActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		CheckVehicleAvailabilityActivator.context = null;
	}

}
