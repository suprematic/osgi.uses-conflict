package consumer;


//import foo.lib.Logger;
import foo.provider.FooService;

public class FooConsumer {

	public FooConsumer() {
		System.out.println("#FooConsumer");
		
//		Logger logger = new Logger();
		
		//logger.newMethod();
		
//		System.out.println("Logger from myself: " + logger);
		
		FooService service = new FooService();
		System.out.println("Logger from service: " + service.getLogger());
		
	}
}
