package com.kodilla.good.patterns.allegro;

public class MailedPurchaseInformation implements PurchaseInformation {
    public boolean inform(User user) {
        String message = "\"You have just bought a product on our website.\"";
        System.out.println("Automatic response sent to user: " + message);

        return true;
    }
}
