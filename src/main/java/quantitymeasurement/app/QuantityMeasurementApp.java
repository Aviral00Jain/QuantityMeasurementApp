package quantitymeasurement.app;
import java.util.Scanner;

import quantitymeasurement.domain.Length;
import quantitymeasurement.domain.Length.LengthUnit;
import quantitymeasurement.domain.Quantity;
public class QuantityMeasurementApp {
	
	public static void main(String[] args) {
		Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(12.0, LengthUnit.INCHES);

        System.out.println(
                q1.add(q2, LengthUnit.FEET)
        );

        System.out.println(
                q1.add(q2, LengthUnit.INCHES)
        );

        System.out.println(
                q1.add(q2, LengthUnit.YARDS)
        );
	}
}