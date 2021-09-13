public class ProxyInternetConnection implements InternetConnection {

	private String employeeName;

	private RealInternetConnection realInternetConnection;

	public ProxyInternetConnection(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	@Override
	public void grantConnection() {
		realInternetConnection = new RealInternetConnection(employeeName);
		if (validateEmployee()) {
			realInternetConnection.grantConnection();
		}else {
			System.out.println("failed to grant access");
		}
	}

	private boolean validateEmployee() {
		return "Naveen".equalsIgnoreCase(employeeName);
	}

}
