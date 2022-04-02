package com.kodilla.good.patterns.allegro;

public class SaleDTO {
    private User user;
    private boolean sold;

    public SaleDTO(User user, boolean sold) {
        this.user = user;
        this.sold = sold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return sold;
    }
}
