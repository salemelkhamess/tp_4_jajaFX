package com.example.tp4_javafx;

public class Product {
    private String name;
    private double price;

    // Constructeur par défaut
    public Product() {
    }

    // Constructeur avec paramètres
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Méthode toString
    @Override
    public String toString() {
        return name + " - " + price + " MRU";
    }
}