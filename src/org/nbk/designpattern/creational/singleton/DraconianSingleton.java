public class DraconianSingleton {
	
	// THREAD SAFE SINGLETON

	private static DraconianSingleton instance;

	private DraconianSingleton() {
	}

	public static synchronized DraconianSingleton getInstance() {

		if (instance == null) {
			instance = new DraconianSingleton();
		}

		return instance;
	}

}
