package com.mwn.Greenhouse.Mapper;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document(collection = "sensorData")
public class SensorData {

    @Id
    private String id;
    private String sensorId;
    private double temperature;
    private double humidity;
    private double soilMoisture;
    private double lightLevel;
    private long timestamp;
    private String location;
    private String plantType;
    private String plantName;

}
