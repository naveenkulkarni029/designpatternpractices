public class ApplicationRun {

	public static void main(String[] args) {
		MoveableAdapter adapter = new MoveableAdapterImpl(new Buggati());
		System.out.println("speed in KMPH :: " + adapter.getSpeedInKMPH(250));
	}

}
