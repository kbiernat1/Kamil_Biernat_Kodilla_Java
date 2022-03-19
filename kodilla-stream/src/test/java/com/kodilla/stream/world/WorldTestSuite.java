package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38420687"));
        Country germany = new Country("Poland", new BigDecimal("80457737"));
        Country france = new Country("Poland", new BigDecimal("67364357"));
        Country usa = new Country("Poland", new BigDecimal("329256465"));
        Country canada = new Country("Poland", new BigDecimal("35881659"));
        Country china = new Country("Poland", new BigDecimal("1401585247"));

        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent asia = new Continent("Asia");

        europe.getCountryList().add(poland);
        europe.getCountryList().add(germany);
        europe.getCountryList().add(france);
        northAmerica.getCountryList().add(usa);
        northAmerica.getCountryList().add(canada);
        asia.getCountryList().add(china);

        World world = new World();

        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        //When
        BigDecimal worldPeopleQty = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(1952966152, worldPeopleQty);
    }
}
