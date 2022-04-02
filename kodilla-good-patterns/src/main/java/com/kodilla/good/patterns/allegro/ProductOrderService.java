package com.kodilla.good.patterns.allegro;

public class ProductOrderService {
    private PurchaseInformation purchaseInformation;
    private ProductSale productSale;
    private ProductDatabase productDatabase;

    public ProductOrderService(PurchaseInformation purchaseInformation, ProductSale productSale, ProductDatabase productDatabase) {
        this.purchaseInformation = purchaseInformation;
        this.productSale = productSale;
        this.productDatabase = productDatabase;
    }

    public SaleDTO process(ProductRequest productRequest) {
        boolean sold = productSale.sold(productRequest.getUser(), productRequest.getProduct());

        if(sold) {
            purchaseInformation.inform(productRequest.getUser());
            productDatabase.createSale(productRequest.getUser(), productRequest.getProduct());
            return new SaleDTO(productRequest.getUser(), true);
        } else {
            return new SaleDTO(productRequest.getUser(), false);
        }
    }
}
