package com.mwn.Greenhouse.service;

import com.mwn.Greenhouse.Mapper.SensorData;
import com.mwn.Greenhouse.repository.SensorDataRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorDataService {

    @Autowired
    private SensorDataRespository sensorDataRepository;

    public SensorData saveSensorData(SensorData sensorData) {
        return sensorDataRepository.save(sensorData);
    }

    public List<SensorData> getSensorDataBySensorId(String sensorId) {
        return sensorDataRepository.findBySensorId(sensorId);
    }

    public List<SensorData> getSensorDataByLocation(String location) {
        return sensorDataRepository.findByLocation(location);
    }

    public List<SensorData> getSensorDataByPlantType(String plantType) {
        return sensorDataRepository.findByPlantType(plantType);
    }

    public List<SensorData> getSensorDataByPlantName(String plantName) {
        return sensorDataRepository.findByPlantName(plantName);
    }

    public List<SensorData> getSensorDataByTimestamp(long start, long end) {
        return sensorDataRepository.findByTimestamp(start, end);
    }
}
