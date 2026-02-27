package quantitymeasurement.domain;

public enum WeightUnit implements IMeasurable{

    KILOGRAM(1.0),
    GRAM(0.001),
    POUND(0.453592);

	private final double factor;

    WeightUnit(double factor) {
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