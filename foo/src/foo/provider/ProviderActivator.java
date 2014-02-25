package foo.provider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class ProviderActivator implements BundleActivator{

	@Override
	public void start(BundleContext arg0) throws Exception {
		
		System.out.println("#start provider bundle");
		new FooService();
		
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		
	}

}
