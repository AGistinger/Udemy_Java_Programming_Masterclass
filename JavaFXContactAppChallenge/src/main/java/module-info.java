module com.example.javafxcontactappchallenge {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.javafxcontactappchallenge to javafx.fxml;
    exports com.example.javafxcontactappchallenge;

    exports datamodel;
}