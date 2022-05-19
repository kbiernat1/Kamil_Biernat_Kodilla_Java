package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //G
        invoiceDao.deleteAll();
        Product product = new Product("TV");
        Product product1 = new Product("Laptop");

        Item item = new Item(product, new BigDecimal(3999), 5);
        Item item1 = new Item(product, new BigDecimal(2999), 3);
        Item item2 = new Item(product1, new BigDecimal(5999), 2);

        Invoice invoice = new Invoice("IN/0642/2022");

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //W
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //T
        Assertions.assertNotEquals(0, id);
        Assertions.assertEquals(3, invoice.getItems().size());
        Assertions.assertEquals("TV", item.getProduct().getName());
        Assertions.assertEquals("TV", item1.getProduct().getName());
        Assertions.assertEquals("Laptop", item2.getProduct().getName());

        //Cleanup
        invoiceDao.deleteAll();
    }
}
