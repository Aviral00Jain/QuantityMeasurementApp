package quantitymeasurement.app;
import java.util.Scanner;

import quantitymeasurement.domain.LengthUnit;
import quantitymeasurement.domain.Quantity;
import quantitymeasurement.domain.WeightUnit;
public class QuantityMeasurementApp {
	
	public static void main(String[] args) {
		 Quantity<LengthUnit> oneFeet =
	                new Quantity<>(1, LengthUnit.FEET);

	        Quantity<LengthUnit> twelveInches = new Quantity<>(12, LengthUnit.INCHES);

	        System.out.println(oneFeet.equals(twelveInches));  

	        Quantity<LengthUnit> result = oneFeet.add(twelveInches);

	        System.out.println(result.getValue() + " FEET");   
	        Quantity<WeightUnit> oneKg = new Quantity<>(1, WeightUnit.KILOGRAM);

	        Quantity<WeightUnit> thousandGram = new Quantity<>(1000, WeightUnit.GRAM);

	        System.out.println(oneKg.equals(thousandGram));   

	        Quantity<WeightUnit> weightResult = oneKg.add(thousandGram);

	        System.out.println(weightResult.getValue() + " KG"); 	
	}
}