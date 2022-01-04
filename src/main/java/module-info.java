module com.example.admin {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.admin to javafx.fxml;
    exports com.example.admin;
}