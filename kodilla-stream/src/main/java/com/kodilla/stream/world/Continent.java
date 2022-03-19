package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Continent {
    private String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public final List<Country> continent = new ArrayList<>();

    public List<Country> getCountryList() {
        return new ArrayList<>(continent);
    }
}
