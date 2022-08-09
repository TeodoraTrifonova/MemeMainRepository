package com.example.api.models;

import com.example.api.interfaces.OperationResult;

public class ForecastResponse implements OperationResult {
    private String locationID;
    private String locationName;
    private String humidity;
    private String rain;
    private String temperature;
}
