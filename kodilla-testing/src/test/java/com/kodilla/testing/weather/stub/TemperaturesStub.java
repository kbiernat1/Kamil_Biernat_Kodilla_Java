package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures {

    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();

        stubResult.put("Rzeszów", 25.5);
        stubResult.put("Opole", 23.1);
        stubResult.put("Gdańsk", 24.3);
        stubResult.put("Lublin", 21.9);

        return stubResult;
    }
}
