package com.mwn.Greenhouse.contoller;

import com.mwn.Greenhouse.Mapper.SensorData;
import com.mwn.Greenhouse.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensorData")
public class SensorDataController {

    @Autowired
    private SensorDataService sensorDataService;

    @PostMapping("/saveSensorData")
    public SensorData saveSensorData(@RequestBody SensorData sensorData) {
        return sensorDataService.saveSensorData(sensorData);
    }

    @GetMapping("/sensorId/{sensorId}")
    public List<SensorData> getSensorDataBySensorId(@PathVariable String sensorId) {
        return sensorDataService.getSensorDataBySensorId(sensorId);
    }

    @GetMapping("/location/{location}")
    public List<SensorData> getSensorDataByLocation(@PathVariable String location) {
        return sensorDataService.getSensorDataByLocation(location);
    }

    @GetMapping("/plantType/{plantType}")
    public List<SensorData> getSensorDataByPlantType(@PathVariable String plantType) {
        return sensorDataService.getSensorDataByPlantType(plantType);
    }

    @GetMapping("/plantName/{plantName}")
    public List<SensorData> getSensorDataByPlantName(@PathVariable String plantName) {
        return sensorDataService.getSensorDataByPlantName(plantName);
    }

    @GetMapping("/timestamp/range")
    public List<SensorData> getSensorDataByTimestamp(@RequestParam long start, @RequestParam long end) {
        return sensorDataService.getSensorDataByTimestamp(start, end);
    }
}
