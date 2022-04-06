package com.kodilla.stream.sand;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SandStorageTestSuite {

    @Test
    void testGetSandBeansQuantity() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        for (SandStorage continent : continents) {
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }

        //Then
        BigDecimal expectedSand = new BigDecimal("23230572289118153328333583928030329684079829544396666111940842769984983545780");
        assertEquals(expectedSand, totalSand);
    }

    @Test
    void testGetSandBeansQuantityWithReduce() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigDecimal totalSand = continents.stream()                              // [1]
                .map(SandStorage::getSandBeansQuantity)                              // [2]
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));  // [3]

        //Then
        BigDecimal expectedSand = new BigDecimal("23230572289118153328333583928030329684079829544396666111940842769984983545780");      // [4]
        assertEquals(expectedSand, totalSand);                                  // [5]
    }
}