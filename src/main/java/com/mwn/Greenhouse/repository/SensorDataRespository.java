package com.mwn.Greenhouse.repository;

import com.mwn.Greenhouse.Mapper.SensorData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SensorDataRespository extends MongoRepository<SensorData, String> {

    List<SensorData> findBySensorId(String sensorId);
    List<SensorData> findByLocation(String location);
    List<SensorData> findByPlantType(String plantType);
    List<SensorData> findByPlantName(String plantName);
    List<SensorData> findByTimestamp(long start, long end);
}
