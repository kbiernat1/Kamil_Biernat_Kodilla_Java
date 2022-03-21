package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38420687"));
        Country germany = new Country("germany", new BigDecimal("80457737"));
        Country france = new Country("france", new BigDecimal("67364357"));
        Country usa = new Country("usa", new BigDecimal("329256465"));
        Country canada = new Country("canada", new BigDecimal("35881659"));
        Country china = new Country("china", new BigDecimal("1401585247"));

        List<Country> europeanCountries = new ArrayList<>();
        europeanCountries.add(poland);
        europeanCountries.add(germany);
        europeanCountries.add(france);


        List<Country> northAmericanCountries = new ArrayList<>();
        northAmericanCountries.add(usa);
        northAmericanCountries.add(canada);

        List<Country> asianCountries = new ArrayList<>();
        asianCountries.add(china);

        Continent europe = new Continent("Europe", europeanCountries);
        europe.getCountryList();
        Continent northAmerica = new Continent("North America", northAmericanCountries);
        northAmerica.getCountryList();
        Continent asia = new Continent("Asia", asianCountries);
        asia.getCountryList();

        World world = new World();

        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        //When
        BigDecimal worldPeopleQty = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(new BigDecimal("1952966152"), worldPeopleQty);
    }
}
