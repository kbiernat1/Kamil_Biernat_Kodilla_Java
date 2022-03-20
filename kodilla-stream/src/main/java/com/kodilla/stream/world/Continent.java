package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private String continentName;
    private List<Country> countryList;

    public Continent(String continentName, List<Country> countryList) {
        this.continentName = continentName;
        this.countryList = countryList;
    }

    public String getContinentName() {
        return continentName;
    }

    public final List<Country> continent = new ArrayList<>();

    public List<Country> getCountryList() {
        return new ArrayList<>(continent);
    }
}
