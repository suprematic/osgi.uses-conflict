package foo.provider;

import foo.lib.Logger;

public class FooService {

	private Logger logger = new Logger();;

	public FooService() {
		System.out.println("#init FooService with " + logger);
	}

	/**
	 * Public API
	 * @return
	 */
	public Logger getLogger() {
		return logger;
	}
}
