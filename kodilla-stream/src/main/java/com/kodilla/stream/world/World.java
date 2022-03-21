package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    public List<Continent> world = new ArrayList<>();

    public List<Continent> addContinent(Continent continent) {
        world.add(continent);
        return world;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal worldPeopleQty = world.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum = sum.add(country));
        return worldPeopleQty;
    }
}
