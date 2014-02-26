package consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Activator implements BundleActivator{

	@Override
	public void start(BundleContext arg0) throws Exception {
		
		System.out.println("#start consumer bundle");
		new Consumer();
		
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		
	}
}
