public class ApplicationRun {
	
	public static void main(String[] args) {
		InternetConnection connection = new ProxyInternetConnection("naveen");
		connection.grantConnection();
	}

}
