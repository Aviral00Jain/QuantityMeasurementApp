package quantitymeasurement.domain;

public enum LengthUnit implements IMeasurable {

    FEET(0.3048),
    INCHES(0.0254),
    YARDS(0.9144),
    CENTIMETERS(0.01);

    private final double factor;

    LengthUnit(double factor) {
        this.factor = factor;
    }

    public double toBase(double value) {
        return value * factor;
    }

    public double fromBase(double baseValue) {
        return baseValue / factor;
    }

	@Override
	public double toBaseUnit(double value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double fromBaseUnit(double baseValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	double getConversionFactor() {
		// TODO Auto-generated method stub
		return 0;
	}
}