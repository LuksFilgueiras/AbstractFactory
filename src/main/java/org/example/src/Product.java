package org.example.src;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price){
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank() || name.isEmpty()){
            throw new IllegalArgumentException("Name non existent!");
        }
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(price < 0){
            throw new IllegalArgumentException("Price value can not be negative!");
        }
        this.price = price;
    }
}
