module com.example.tp4_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp4_javafx to javafx.fxml;
    exports com.example.tp4_javafx;
}