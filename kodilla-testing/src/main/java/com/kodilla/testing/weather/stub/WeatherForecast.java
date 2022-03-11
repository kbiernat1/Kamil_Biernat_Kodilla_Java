package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double temperaturesArithmeticAverage() {
        List<Double> list = new ArrayList<>();
        for (Map.Entry<String, Double> values : temperatures.getTemperatures().entrySet()) {
            list.add(values.getValue());
        }

        double sum = 0;
        for (int i=0; i<list.size(); i++) {
            double value = list.get(i);
            sum += value;
        }
        return sum / list.size();
    }

    public double temperaturesMedian() {
        List<Double> list = new ArrayList<>();
        for (Map.Entry<String, Double> values : temperatures.getTemperatures().entrySet()) {
            list.add(values.getValue());
        }
        list.sort(Comparator.naturalOrder());
        if (list.size() % 2 == 0) {
            double firstNumber = list.get(list.size()/2 - 1);
            double secondNumber = list.get(list.size()/2 + 1);
            return (firstNumber + secondNumber) / 2;
        } else {
            return list.get(list.size()/2);
        }
    }
}
