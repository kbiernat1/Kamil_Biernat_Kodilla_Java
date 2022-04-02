package com.kodilla.good.patterns.allegro;

public class ByPieceProductDatabase implements ProductDatabase {
    public void createSale(User user, Product product) {
        System.out.println("Sold to " + user.getLogin() + " product \"" + product.getName() + "\" has been added to " +
                "products sold-by-piece database.");
    }
}
