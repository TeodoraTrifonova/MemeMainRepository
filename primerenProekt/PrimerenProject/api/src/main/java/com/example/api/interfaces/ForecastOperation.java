package com.example.api.interfaces;

import com.example.api.models.ForecastRequest;
import com.example.api.models.ForecastResponse;

public interface ForecastOperation {
    ForecastResponse getForecast(ForecastRequest Location);
}
