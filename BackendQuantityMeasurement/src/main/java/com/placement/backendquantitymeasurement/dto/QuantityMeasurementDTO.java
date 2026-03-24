package com.placement.backendquantitymeasurement.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuantityMeasurementDTO {

    public QuantityMeasurementDTO(Object value, Object unit, Object measurementType, Object value2, Object unit2,
			Object measurementType2, String string, Object object, Object object2, Object object3, String valueOf,
			Object object4, boolean b) {
		// TODO Auto-generated constructor stub
	}
	private Double thisValue;
    private String thisUnit;
    private String thisMeasurementType;

    private Double thatValue;
    private String thatUnit;
    private String thatMeasurementType;

    private String operation;

    private Double resultValue;
    private String resultUnit;
    private String resultMeasurementType;

    private String resultString;

    private String errorMessage;
    private boolean error;
}