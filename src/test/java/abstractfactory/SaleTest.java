package abstractfactory;

import org.example.abstractfactory.*;
import org.example.src.Product;
import org.example.src.Sale;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleTest {
    private final List<Product> products = Arrays.asList(new Product("Coca", 3.00), new Product("Coxinha", 5.50));

    @Test
    void generateCreditCardReceipt() {
        ReceiptFactory receiptFactory = new ReceiptFactoryCreditCard(302140129);
        Sale sale = new Sale(receiptFactory, products);
        assertEquals("Receipt on Credit Card", sale.generateReceipt());
    }

    @Test
    void generateDebitCardReceipt() {
        ReceiptFactory receiptFactory = new ReceiptFactoryDebitCard(302140129);
        Sale sale = new Sale(receiptFactory, products);
        assertEquals("Receipt on Debit Card", sale.generateReceipt());
    }

    @Test
    void generateCashReceipt() {
        ReceiptFactory receiptFactory = new ReceiptFactoryCash();
        Sale sale = new Sale(receiptFactory, products);
        assertEquals("Receipt on Cash", sale.generateReceipt());
    }
}
