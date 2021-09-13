public class MoveableAdapterImpl implements MoveableAdapter {

	private Moveable luxuryCars;

	public MoveableAdapterImpl(Moveable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeedInKMPH(int speedInMPH) {
		return convertMPHtoKMPH(this.luxuryCars.getSpeedInMPH(speedInMPH));
	}

	private double convertMPHtoKMPH(int speedInMPH) {
		return speedInMPH * 1.60934;
	}

}
