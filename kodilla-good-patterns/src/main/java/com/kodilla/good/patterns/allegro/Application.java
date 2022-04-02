package com.kodilla.good.patterns.allegro;

public class Application {
    public static void main(String[] args) {
        ProductRequestRetriever productRequestRetriever = new ProductRequestRetriever();
        ProductRequest productRequest = productRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailedPurchaseInformation(), new ByPieceProductSale(), new ByPieceProductDatabase());

        productOrderService.process(productRequest);
    }
}
