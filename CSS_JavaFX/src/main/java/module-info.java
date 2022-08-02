module com.example.css_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.css_javafx to javafx.fxml;
    exports com.example.css_javafx;
}