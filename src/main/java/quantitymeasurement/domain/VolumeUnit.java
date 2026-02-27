package quantitymeasurement.domain;

public enum VolumeUnit implements IMeasurable {

    LITRE(1.0),
    MILLILITRE(0.001),
    GALLON(3.78541);

	private final double factor;

    VolumeUnit(double factor) {
        this.factor = factor;
    }

    public double toBase(double value) {
        return value * factor;
    }

    public double fromBase(double baseValue) {
        return baseValue / factor;
    }

	@Override
	public boolean supportsArithmetic() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validateOperationSupport(String operation) {
		// TODO Auto-generated method stub
		
	}
}