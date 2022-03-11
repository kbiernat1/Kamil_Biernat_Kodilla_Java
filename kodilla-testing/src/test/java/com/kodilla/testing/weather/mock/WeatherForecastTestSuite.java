package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

// import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {
    @ExtendWith(MockitoExtension.class)

    @Mock
    private Temperatures temperaturesMock;

    Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeEach
    public void beforeEveryTest() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
    }

    @Test
    void testCalculateWeatherWithMock() {
        //Given
        // Temperatures temperaturesMock = mock(Temperatures.class);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testTemperaturesArithmeticAverage() {
        //Given
        // Temperatures temperaturesMock = mock(Temperatures.class);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double average = weatherForecast.temperaturesArithmeticAverage();
        //Then
        Assertions.assertEquals(25.56, average);
    }

    @Test
    void testTemperaturesMedian() {
        //Given
        // Temperatures temperaturesMock = mock(Temperatures.class);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double median = weatherForecast.temperaturesMedian();
        //Then
        Assertions.assertEquals(25.5, median);
    }
}
