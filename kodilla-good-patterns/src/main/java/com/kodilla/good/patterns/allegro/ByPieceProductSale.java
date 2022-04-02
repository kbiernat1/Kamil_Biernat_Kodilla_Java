package com.kodilla.good.patterns.allegro;

public class ByPieceProductSale implements ProductSale {
    public boolean sold(User user, Product product) {
        System.out.println("Product " + product.getName() + " has been sold by piece to user " + user.getLogin() + ". ");

        return true;
    }
}
