package consumer;

import foo.provider.SomeService;

public class Consumer {

    public Consumer() {

        System.out.println("#FooConsumer");

        SomeService service = new SomeService();
        System.out.println("Logger from service: " + service.getLogger());

    }
}
