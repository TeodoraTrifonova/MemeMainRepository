package com.example.domain.service;

import com.example.domain.model.Forecast;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherClientService {
    private final RestTemplate restTemplate;

    public WeatherClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Forecast getForecastByLatAndLon(Double lat, Double lon){
        final String key = "c782585acdc84252b3790106220807";

        final String uri = "http://api.weatherapi.com/v1/current.json?key=" + key + "&q=" + lat
                + "," + lon;

        return restTemplate.getForObject(uri, Forecast.class);
    }

}
