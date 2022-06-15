package icecreampublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class IceCreamActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
//		System.out.println("IceCreamPublisher Start");
		IceCreamPublisher publisherService = new IceCreamPublisherImpl();
		publishServiceRegistration = bundleContext.registerService(IceCreamPublisher.class.getName(), publisherService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
//		System.out.println("IceCreamPublisher Stop");
		publishServiceRegistration.unregister();
		
		
	}

}
