package consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class ConsumerActivator implements BundleActivator{

	@Override
	public void start(BundleContext arg0) throws Exception {
		
		System.out.println("#start consumer bundle");
		new FooConsumer();
		
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		
	}
}
