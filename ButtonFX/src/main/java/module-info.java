module com.example_lambda.buttonfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example_lambda.buttonfx to javafx.fxml;
    exports com.example_lambda.buttonfx;
}