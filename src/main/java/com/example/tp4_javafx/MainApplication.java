package com.example.tp4_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("p-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        // Appliquer la feuille de style CSS (chemin absolu)
        scene.getStylesheets().add(MainApplication.class.getResource("s.css").toExternalForm());

        // Configurer la fenêtre principale
        stage.setScene(scene);
        stage.setTitle("Gestion des Produits");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}