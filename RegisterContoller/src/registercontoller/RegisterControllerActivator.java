package registercontoller;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class RegisterControllerActivator implements BundleActivator {
	ServiceRegistration<?> registerControl;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Starting register controller...");
		RegisterController registerController = new RegisterControllerImpl();
		registerControl = context.registerService(RegisterController.class.getName(), registerController, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopping register controller...");
	}

}