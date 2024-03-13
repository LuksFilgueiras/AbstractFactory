package org.example.src;

import org.example.abstractfactory.Receipt;
import org.example.abstractfactory.ReceiptFactory;

import java.util.List;

public class Sale {
    private Receipt receipt;
    private List<Product> products;

    public Sale(ReceiptFactory receiptFactory, List<Product> products){
        this.receipt = receiptFactory.createReceipt();
        setProducts(products);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        if(products == null){
            throw new IllegalArgumentException("Products empty!");
        }
        this.products = products;
    }

    public Double calculateTotal(){
        Double total = 0.0;

        for(Product p : products){
            total += p.getPrice();
        }

        return total;
    }

    public String generateReceipt(){
        return receipt.GenerateReceipt(this);
    }
}
