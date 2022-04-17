package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testNewBigmac() {
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(BunType.WITH_SEZAMME)
                .sauce(SauceType.AMERICAN)
                .burgers(2)
                .ingredient(IngredientType.ONION)
                .ingredient(IngredientType.CHEESE)
                .ingredient(IngredientType.PICKLE)
                .build();
        System.out.println(bigmac);

        //when
        int howManyIngr = bigmac.getIngredients().size();

        //then
        Assertions.assertEquals(3, howManyIngr);
    }
}
