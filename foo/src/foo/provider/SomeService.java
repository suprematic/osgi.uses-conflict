package foo.provider;

import foo.lib.Logger;

public class SomeService {

    private final Logger logger = new Logger(); ;

    public SomeService() {
        System.out.println("#init FooService with " + logger);
    }

    /**
     * Public API exposing the <strong>foo.lib</strong> package.
     */
    public Logger getLogger() {
        return logger;
    }
}
