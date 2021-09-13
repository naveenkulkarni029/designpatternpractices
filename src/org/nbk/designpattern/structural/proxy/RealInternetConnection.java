public class RealInternetConnection implements InternetConnection {

	private String employeeName;

	public RealInternetConnection(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	@Override
	public void grantConnection() {
		System.out.println("internet connection successful for employee : "+employeeName);

	}

}
