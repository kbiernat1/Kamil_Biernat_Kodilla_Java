package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final BunType bun;
    private final int burgers;
    private final SauceType sauce;
    private List<IngredientType> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private BunType bun;
        private int burgers;
        private SauceType sauce;
        private List<IngredientType> ingredients = new ArrayList<>();

        public BigmacBuilder bun(BunType bunType) {
            this.bun = bunType;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(SauceType sauceType) {
            this.sauce = sauceType;
            return this;
        }

        public Bigmac.BigmacBuilder ingredient(IngredientType ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(BunType bun, int burgers, SauceType sauce, List<IngredientType> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public BunType getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public SauceType getSauce() {
        return sauce;
    }

    public List<IngredientType> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}
