package com.example.tp4_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class ProductController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField priceField;

    @FXML
    private ListView<Product> productListView;

    private List<Product> products = new ArrayList<>();

    @FXML
    public void addProduct() {
        String name = nameField.getText();
        double price = Double.parseDouble(priceField.getText());

        Product product = new Product(name, price);
        products.add(product);

        productListView.getItems().add(product);

        nameField.clear();
        priceField.clear();
    }
}