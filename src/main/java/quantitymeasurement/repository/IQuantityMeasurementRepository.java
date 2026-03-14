package quantitymeasurement.repository;

import java.util.List;

import quantitymeasurement.entity.QuantityMeasurementEntity;

// Repository interface for QuantityMeasurementEntity
public interface IQuantityMeasurementRepository {

    void save(QuantityMeasurementEntity entity);

    List<QuantityMeasurementEntity> getAllMeasurements();

    public static void main(String[] args) {
        System.out.println("Testing IQuantityMeasurementRepository interface");
    }
}