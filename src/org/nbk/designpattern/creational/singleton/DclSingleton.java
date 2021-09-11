public class DclSingleton {

	// volatile to prevent cache
	private static volatile DclSingleton instance;

	private DclSingleton() {
	}

	public static DclSingleton getInstance() {

		if (instance == null) {
			synchronized (DclSingleton.class) {
				if (instance == null) {
					instance = new DclSingleton();
				}
			}
		}

		return instance;
	}

}
